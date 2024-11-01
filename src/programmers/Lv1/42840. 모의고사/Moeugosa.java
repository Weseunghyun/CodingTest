package programmers.Lv1;

import java.util.ArrayList;
import java.util.List;

class Moeugosa {
    public int[] solution(int[] answers) {

        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        int oneCount = 0;
        int twoCount = 0;
        int threeCount = 0;
        int idxOne = 0;
        int idxTwo = 0;
        int idxThree = 0;
        for(int i=0; i<answers.length; i++){
            if(one[idxOne%5] == answers[i]){
                oneCount++;
            }
            if(two[idxTwo%8] == answers[i]){
                twoCount++;
            }
            if(three[idxThree%10] == answers[i]){
                threeCount++;
            }
            idxOne++;
            idxTwo++;
            idxThree++;
        }

        int max = Math.max(oneCount,Math.max(twoCount,threeCount));
        List<Integer> list = new ArrayList<>();

        if(max==oneCount){
            list.add(1);
        }
        if(max==twoCount){
            list.add(2);
        }
        if(max==threeCount){
            list.add(3);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}
