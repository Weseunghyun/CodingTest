import java.util.*;

class Solution {
    int answer = 0;

    public int solution(String numbers) {
        char[] arr = numbers.toCharArray();
        boolean[] visited = new boolean[arr.length];
        Set<Integer> set = new HashSet<>();

        DFS(arr, visited, "", set);

        return answer;
    }

    public void DFS(char[] arr, boolean[] visited, String current, Set<Integer> set) {
        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;

                String newNumber = current + arr[i];
                int num = Integer.parseInt(newNumber);
                if (!set.contains(num)) { // 이미 검사한 숫자가 아닐 때만 진행
                    set.add(num);

                    if (isPrime(num)) {
                        answer++;
                    }
                }
                
                DFS(arr, visited, newNumber, set);

                visited[i] = false; // 백트래킹 (반환할 때 반드시 false로 변경)
            }
        }
    }

    boolean isPrime(int n) {
        if (n <= 1)
            return false; //1은 소수가 아님.

        // 짝수는 소수에서 제외
        // 단, 2는 유일하게 짝수 중에서 소수
        if (n % 2 == 0)
            return n == 2 ? true : false;

        // n이 홀수인 경우 sqrt(n)까지 나눠서 나눠떨어지는지 여부 체크
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            // 나눠 떨어진다면 약수에 해당하므로 소수가 아님.
            if (n % i == 0)
                return false;
        }
        // 위에서 걸러지지 않은 나머지 경우는 소수에 해당됨
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("011"));
    }
}
