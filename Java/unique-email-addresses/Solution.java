//This solution has time complexity of O(n) since we loop the whole array only once.
//Space complexity of O(n) where n is unique email addresses in the hashset.

class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();

        for (String email : emails) {
            String[] names = email.split("\\@");
            String local = names[0];
            String domain = names[1];

            if (local.contains(".")) {
                local = local.replace(".", "");
            }

            int plus_index = local.indexOf("+");

            if (plus_index != -1) {
                local = local.substring(0, plus_index);
            }

            String processedEmail = local + "@" + domain;

            if (!set.contains(processedEmail)) {
                set.add(processedEmail);
            }
        }

        return set.size();
    }
}