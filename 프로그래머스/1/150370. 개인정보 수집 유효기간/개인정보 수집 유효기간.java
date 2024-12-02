import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> termMap = new HashMap<>();
        List<Integer> expiredList = new ArrayList<>();
        
        // 약관 종류와 유효기간 매핑
        for (String term : terms) {
            String[] termInfo = term.split(" ");
            termMap.put(termInfo[0], Integer.parseInt(termInfo[1]));
        }
        
        // 오늘 날짜 분리
        String[] todayParts = today.split("\\.");
        int todayYear = Integer.parseInt(todayParts[0]);
        int todayMonth = Integer.parseInt(todayParts[1]);
        int todayDay = Integer.parseInt(todayParts[2]);
        
        int idx = 1; // 개인정보 번호
        for (String privacy : privacies) {
            String[] privacyInfo = privacy.split(" ");
            String[] dateParts = privacyInfo[0].split("\\.");
            String termType = privacyInfo[1];
            
            int year = Integer.parseInt(dateParts[0]);
            int month = Integer.parseInt(dateParts[1]);
            int day = Integer.parseInt(dateParts[2]);
            
            // 유효기간 더하기
            int termMonths = termMap.get(termType);
            month += termMonths;
            while (month > 12) {
                month -= 12;
                year++;
            }
            
            // 만료일은 마지막 날 기준
            day -= 1;
            if (day == 0) {
                day = 28;
                month -= 1;
                if (month == 0) {
                    month = 12;
                    year -= 1;
                }
            }
            
            // 오늘 날짜와 비교
            if (year < todayYear || 
                (year == todayYear && month < todayMonth) || 
                (year == todayYear && month == todayMonth && day < todayDay)) {
                expiredList.add(idx);
            }
            idx++;
        }
        
        // 결과 배열 반환
        return expiredList.stream().mapToInt(i -> i).toArray();
    }
}
