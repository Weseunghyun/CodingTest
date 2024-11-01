package programmers;

import java.util.Arrays;

class Honor {
    class Solution {
        public int[] solution(int k, int[] score) {
            int[] arr = new int[k];
            int[] answer = new int[score.length];
            int min = 2001;

            for (int i = 0; i < score.length; i++) {
                if (i < k) {
                    arr[i] = score[i];
                    if (min > arr[i]) {
                        min = arr[i];
                    }
                    answer[i] = min;
                } else {
                    if (score[i] > min) {
                        for (int j = 0; j < k; j++) {
                            if (arr[j] == min) {
                                arr[j] = score[i];
                                break;
                            }
                        }
                        min = Arrays.stream(arr).min().getAsInt();
                    }
                    answer[i] = min;
                }
            }
            return answer;
        }

    }
}
