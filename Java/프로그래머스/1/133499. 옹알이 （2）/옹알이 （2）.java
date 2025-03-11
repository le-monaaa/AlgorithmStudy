class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(int i = 0; i < babbling.length; i++){
            babbling[i] = babbling[i].replaceAll("ayaaya|yeye|woowoo|mama", "1");
            babbling[i] = babbling[i].replaceAll("aya|ye|woo|ma", "");
            babbling[i] = babbling[i].replaceAll(" ", "");
            if(babbling[i].equals("")) answer++;
        }
        return answer;
    }
}