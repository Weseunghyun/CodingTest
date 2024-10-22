import java.util.Arrays;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2};

        // 기본 타입 배열을 오름으로 정렬
        Arrays.sort(arr);

        // 내림차순으로 결과 배열을 저장
        int[] sortedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = arr[arr.length - 1 - i];
        }

        // 결과 출력
        System.out.println(Arrays.toString(sortedArr));
    }
}