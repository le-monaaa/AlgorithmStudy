class Solution {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        StringBuilder reversed = new StringBuilder();
        for(int i = 1; i < food.length; i++) {
            String foods = String.valueOf(i).repeat(food[i]/2);
            answer.append(foods);
            reversed.insert(0, foods);
        }
        return answer + "0" + reversed;
    }
}