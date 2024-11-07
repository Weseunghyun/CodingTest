class Solution {
    public String solution(String s) {
//         String[] a = s.split(" ");
//         StringBuilder sb = new StringBuilder();
        
//         for(int i=0; i<a.length; i++){
//             char[] arr = a[i].toCharArray();
//             for(int j=0; j<arr.length; j++){
//                 if(j%2==0){
//                     sb.append(Character.toUpperCase(arr[j]));
//                 }else{
//                     sb.append(Character.toLowerCase(arr[j]));
//                 }
//             }
//             if(i!=a.length-1){
//                 sb.append(" ");
//             }
//         }
//         return sb.toString();
        
        //더 성능 좋은 방식
        char[] arr = s.toCharArray();
        int idx = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == ' '){
                idx = 0;
                continue;
            }
            arr[i] = idx % 2 == 0 ?  Character.toUpperCase(arr[i]) : Character.toLowerCase(arr[i]);
            idx++;
        }
        
        return String.valueOf(arr);
    }
}