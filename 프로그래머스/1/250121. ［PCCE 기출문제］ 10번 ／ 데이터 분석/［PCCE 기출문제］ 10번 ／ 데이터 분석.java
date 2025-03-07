import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        
        //ext 를 기준으로 작은값들을 저장할 list 생성
        List<int[]> list = new ArrayList<>();
        
         // 문자열 key에 대한 인덱스 매핑
        Map<String, Integer> map = new HashMap<>();
        map.put("code",0);
        map.put("date",1);
        map.put("maximum",2);
        map.put("remain",3);
        
        //비교해야할 기준의 인덱스 가져오기 
        int compare = map.get(ext);
        
        //기준 인덱스만 비교해서 list에 저장
        for(int i=0; i<data.length; i++) {
            if(data[i][compare] < val_ext) {
                list.add(data[i]);
            }
        }
        
        //오름차순 정렬할 기준 인덱스 저장
        int asc = map.get(sort_by);
        
        //list 의 sort 메서드와 Comparator의 comparingInt 를 사용해 정렬 수행
        list.sort(Comparator.comparingInt(a -> a[asc]));
        
        return list.toArray(new int[0][]);
    }
}

/*
코드번호는 1부터 100,000 까지 가능 data의 길이가 500이므로 이차원 배열의 값은 총 500개
ext 가 뽑아낼 정보를 알려주는 기준, val_ext 가 해당 기준의 실제 값을 나타냄
sort_by는 해당 값을 기준으로 오름차순 정렬하면됨.

ext와 sort_by는 code 번호, date 날짜, maximum 최대값, remain 남은 값을 기준으로 삼을 수 있다.
val_ext 는 기준에 있는 범위 내의 값만 존재한다는 뜻
조건을 만족하는 데이터는 항상 한 개 이상 존재 따라서 빈 배열이 반환될 가능성은 없다.

1차적으로 ext 값이 val_ext 값보다 작은 데이터들을 뽑아야함.
어떻게 따로 데이터들을 뽑아야할까?
예를들어 ext 가 code 라면? val_ext 값은 1~10만 의 값일테고 이보다 작은값들을 새로운 배열로 저장한다?
우선 ext에 따라서 [i][j] 즉 j를 어떤 값을 비교해야할지 알아내야한다. Map 을 사용할까?
Map code:0, date:1, maximum:2, remain:3 으로 해당 ext 값에 매칭되는 인덱스들을 저장해놓고
map.get(ext) 를 하면 해당 인덱스가 나올테니까 data[i][map.get(ext)] 를 비교하면서 작은값들을 뽑으면됨
만약 해당 값이 작다면 어떻게 그 값들을 새로운 배열로 만들 수 있을까?
List 를 생성해서 해당 배열 값을 저장해야할까? List<int[]> 를 활용하여 작은값들을 저장하자.

2차적으로 sort_by에 해당하는 값을 기준으로 뽑은 데이터들을 오름차순 정렬해야함.
생성된 list를 통해 정렬을 진행해야한다.
배열을 정렬하는 sort 메서드에 기준값도 넣어줄 수 있었던가?
찾아보니 List 의 sort 메서드와 Comparator.comparingInt(a -> a[정렬할 기준 인덱스]) 를 사용하면 가능하다고 한다.

그렇다면 마지막으로 list 를 배열로 다시 변환해야하는데 List<int[]> 를 다시 2차원 배열로 어떻게 변환할까?
List<int[]>는 단순한 리스트이며, 내부의 요소는 각각 'int[] 배열'이다.
이를 이차원 배열 int[][] 형태로 변환해야 한다.
Java의 List<T>.toArray(T[] array) 메서드를 사용하면, 해당 리스트의 요소들을 전달된 배열 타입으로 변환할 수 있다.
 하지만, 배열의 크기를 명확하게 지정해주어야 하므로 `new int[list.size()][]`를 생성하여 이를 전달한다.
`list.size()`는 변환될 배열의 행(row) 수를 의미한다.
`new int[list.size()][]`는 '행 개수만 지정된 이차원 배열'을 의미하며, 내부 요소(각 행)는 그대로 유지된다.
결국 list.toArray(new int[list.size()][])를 호출하면 List 내부의 int[] 배열들이 그대로 복사되며, 최종적으로 int[][] 형태가 된다.

java.util.List의 toArray()  메소드는
파라미터로 전달받은 배열 객체의 길이가, 원본 리스트보다 작을 경우 자동으로 원본 리스트의 size 크기로 배열을 만들어준다.
즉 new int[0][] 을 해도 정상적으로 리스트의 사이즈만큼의 똑같은 행 개수를 가지는 배열이 생성될 것이다.
list.toArray(new int[0][])를 전달해도 내부적으로 new int[list.size()][]과 같은 크기의 배열을 생성하고 내용을 복사한다.
반대로, 원본 List의 길이보다 배열의 크기를 더 크게 지정하면, 배열의 나머지 인덱스는 'null'로 채워진다.

왜 열 인덱스는 명시해주지않아도 정상적으로 이차원 배열로 변환되는가?
List<int[]>의 각 원소(= int[] 배열)가 이미 특정한 길이를 가지고 있고, 
toArray()는 해당 원소들을 그대로 복사하여 각 행에 자동으로 매칭하기 때문이다.

즉, List<int[]>의 크기(list.size())와 변환될 2차원 배열의 행 개수(new int[list.size()][])가 동일하기 때문에
toArray()가 각 원소(= int[])를 그대로 매칭하여 변환하는 것이 가능합니다.
*/