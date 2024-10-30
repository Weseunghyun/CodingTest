package programmers;

public class PhoneNumber {
    class Solution2{
        public String solution(String phone_number) {
            char[] phone = phone_number.toCharArray();

            for (int i = 0; i < phone.length-4; i++) {
                phone[i] = '*';
            }

            return String.valueOf(phone);
        }
    }

    class Solution1{
        public String solution(String phone_number) {
            StringBuilder masked = new StringBuilder();
            int length = phone_number.length();
            for(int i=0; i<length; i++){
                if(i<length-4)
                    masked.append('*');
                else
                    masked.append(phone_number.charAt(i));
            }

            String answer = masked.toString();
            return answer;
        }
    }

}
