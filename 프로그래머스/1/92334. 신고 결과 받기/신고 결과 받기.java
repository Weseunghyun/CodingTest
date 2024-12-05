import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        // 해당 이름이 신고당한 횟수를 저장하는 map
        Map<String, Integer> nameCountMap = new HashMap<>();

        // 각 사용자가 신고한 사용자들을 저장하는 map
        Map<String, Set<String>> reportMap = new HashMap<>();

        int length = id_list.length;
        int[] answer = new int[length];

        // 초기화: 각 유저의 신고 횟수를 0으로 설정
        for (String id : id_list) {
            nameCountMap.put(id, 0);
            reportMap.put(id, new HashSet<>());
        }

        // 신고 내용을 reportMap에 추가
        for (String re : report) {
            String[] splitRe = re.split(" ");
            String reporter = splitRe[0];
            String reported = splitRe[1];
            reportMap.get(reporter).add(reported); // 동일한 신고는 중복 처리됨
        }

        // 신고당한 횟수 카운트
        for (Set<String> reportedSet : reportMap.values()) {
            for (String reported : reportedSet) {
                nameCountMap.put(reported, nameCountMap.get(reported) + 1);
            }
        }

        // 정지된 사용자 확인 및 메일 수 계산
        for (String reporter : id_list) {
            for (String reported : reportMap.get(reporter)) {
                if (nameCountMap.get(reported) >= k) {
                    answer[Arrays.asList(id_list).indexOf(reporter)]++;
                }
            }
        }

        return answer;
    }
}