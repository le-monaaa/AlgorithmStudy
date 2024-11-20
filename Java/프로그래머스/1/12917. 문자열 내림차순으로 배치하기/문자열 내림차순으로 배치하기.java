import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class Solution {
    public String solution(String s) {
        List<String> arr = Arrays.stream(s.split("")).sorted((a,b) -> b.compareTo(a)).collect(Collectors.toList());
        String answer = String.join("", arr);
        return answer;
    }
}