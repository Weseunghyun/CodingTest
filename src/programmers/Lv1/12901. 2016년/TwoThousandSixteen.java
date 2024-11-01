class TwoThousandSixteen {
    public String solution(int a, int b) {
        String[] weekDay = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] monthDay = {31,29,31,30,31,30,31,31,30,31,30};

        int totalDay = 0;
        int weekDayIdx = 0;
        for(int i=0; i<a-1; i++){
            totalDay += monthDay[i];
        }
        totalDay += b;
        weekDayIdx = (totalDay-1) % 7 ;
        return weekDay[weekDayIdx];
    }
}