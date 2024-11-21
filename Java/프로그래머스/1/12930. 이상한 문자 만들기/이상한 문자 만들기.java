import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class Solution {
    public String solution(String s) {
        List<String> arr = Arrays.stream(s.split(" ", -1)).collect(Collectors.toList());

        for(int k=0; k<arr.size(); k++) {
            String word = arr.get(k);
            StringBuilder updateWord = new StringBuilder();

            for(int i=0; i < word.length(); i++) {
                if ( i%2 == 0) {
                    updateWord.append(Character.toUpperCase(word.charAt(i)));
                } else {
                    updateWord.append(Character.toLowerCase(word.charAt(i)));
                }
            }
            arr.set(k, updateWord.toString());
        }
        return String.join(" ", arr);
    }
}