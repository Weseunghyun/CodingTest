package programmers.Lv1;

class Cards {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int cardsOneIdx = 0;
        int cardsTwoIdx = 0;

        for(String s:goal){
            if(s.equals(cards1[cardsOneIdx])){
                if(cardsOneIdx<cards1.length-1){
                    cardsOneIdx++;
                }
            } else if(s.equals(cards2[cardsTwoIdx])){
                if(cardsTwoIdx < cards2.length-1){
                    cardsTwoIdx++;
                }
            } else
                return "No";
        }

        return "Yes";
    }
}
