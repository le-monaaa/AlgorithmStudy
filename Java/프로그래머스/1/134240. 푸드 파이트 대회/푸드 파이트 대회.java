class Solution {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        StringBuilder reversedPart = new StringBuilder();
        int kcal = 1;
        for(int i=1; i<food.length; i++) {
            String f = (("" + kcal).repeat(food[i]/2));
            answer.append(f);
            reversedPart.insert(0, f);
            kcal++;
        }
        answer.append("0");
        answer.append(reversedPart);


        return answer.toString();
    }
}