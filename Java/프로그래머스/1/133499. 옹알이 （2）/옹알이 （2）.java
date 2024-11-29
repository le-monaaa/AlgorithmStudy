class Solution {
    public int solution(String[] babbling) {
        int cnt = 0;
        String[] validWords = {"aya", "ye", "woo", "ma"};

        for (String talk : babbling) {
            if (talk.matches("^(aya|ye|woo|ma)+$")) {
                boolean isValid = true;
                for (int i = 0; i < validWords.length; i++) {
                    if (talk.contains(validWords[i] + validWords[i])) {
                        isValid = false;
                        break;
                    }
                }
                if (isValid) {
                    cnt++;
                }
            }
        }

        return cnt;
    }
}
