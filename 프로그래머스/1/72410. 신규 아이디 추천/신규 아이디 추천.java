class Solution {
    public String solution(String new_id) {
        // 1단계: 모든 대문자를 소문자로 변환
        // - 아이디는 소문자로만 이루어져야 하므로, 모든 대문자를 소문자로 변환한다.
        new_id = new_id.toLowerCase();

        // 2단계: 사용 가능한 문자(소문자, 숫자, '-', '_', '.')만 남기기
        // - String을 char 배열로 변환한 후, 사용 불가능한 문자들을 필터링한다.
        // - 특정 문자만 남기는 방법으로 isLetterOrDigit() 메서드와 직접 비교를 사용.
        // - 공백 문자(' ')를 대체하는 방식 대신 StringBuilder를 사용하여 새 문자열을 만든다.
        StringBuilder filtered = new StringBuilder();
        for (char c : new_id.toCharArray()) {
            if (Character.isLetterOrDigit(c) || c == '-' || c == '_' || c == '.') {
                filtered.append(c);
            }
        }

        // 3단계: 연속된 마침표(.)를 하나의 마침표(.)로 치환
        // - 마침표가 여러 개 연속되면 한 개로 줄여야 한다.
        // - replaceAll("\\.+", ".")을 사용하면 여러 개의 '.'을 한 개로 변환할 수 있다.
        String new2 = filtered.toString().replaceAll("\\.+", ".");

        // 4단계: 마침표(.)가 처음이나 끝에 위치하면 제거
        // - 첫 문자나 마지막 문자가 '.'일 경우 이를 제거해야 한다.
        // - 조건문을 사용하여 문자열의 첫 문자와 마지막 문자를 검사하고 필요하면 substring을 이용해 제거한다.
        if (new2.startsWith(".")) {
            new2 = new2.substring(1);
        }
        if (new2.endsWith(".")) {
            new2 = new2.substring(0, new2.length() - 1);
        }

        // 5단계: 빈 문자열이면 "a" 대입
        // - 4단계를 거치고 나서 new2가 빈 문자열("")이 되었다면 "a"로 변경해야 한다.
        if (new2.isEmpty()) {
            new2 = "a";
        }

        // 6단계: 길이가 16자 이상이면 15자로 자르고, 끝이 '.'이면 다시 제거
        // - 15자까지만 남기고 이후 문자열은 삭제해야 한다.
        // - substring(0, 15)를 이용하여 15자만 남긴다.
        // - 자르고 난 뒤 마지막 문자가 '.'이라면 다시 제거해야 하므로 endsWith(".") 검사 후 substring 적용.
        if (new2.length() >= 16) {
            new2 = new2.substring(0, 15);
            if (new2.endsWith(".")) {
                new2 = new2.substring(0, 14);
            }
        }

        // 7단계: 길이가 2자 이하라면 마지막 문자를 3자 이상 될 때까지 반복 추가
        // - 마지막 문자를 반복하여 추가하여 최소 길이를 충족시킨다.
        // - while 루프를 사용하여 계속 추가하는 방식으로 해결.
        while (new2.length() < 3) {
            new2 += new2.charAt(new2.length() - 1);
        }

        return new2;
    }
}
