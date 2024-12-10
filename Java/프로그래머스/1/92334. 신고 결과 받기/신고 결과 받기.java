import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Set<String> reports = new HashSet<>(Arrays.asList(report));

        Map<String, Integer> repostCnt = new HashMap<>();
        for(String r : reports) {
            String receiver = r.split(" ")[1];
            repostCnt.put(receiver, repostCnt.getOrDefault(receiver, 0) + 1);
        }
        Set<String> ban = new HashSet<>();
        for(Map.Entry<String, Integer>entry : repostCnt.entrySet()) {
            if(entry.getValue() >= k) {
                ban.add(entry.getKey());
            }
        }
        Map<String, List<String>> userReports = new HashMap<>();
        for(String r:reports) {
            String reporter = r.split(" ")[0];
            String reportedUser = r.split(" ")[1];
            userReports.computeIfAbsent(reporter, v -> new ArrayList<>()).add(reportedUser);
        }

        int[] answer = new int[id_list.length];
        for(int i = 0; i < id_list.length; i++) {
            String user = id_list[i];
            List<String> reports2 = userReports.getOrDefault(user, Collections.emptyList());
            for(String reportedUser : reports2) {
                if(ban.contains(reportedUser)){
                    answer[i]++;
                }
            }
        }

        return answer;
    }
}