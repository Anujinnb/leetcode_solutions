//This solution has time complexity of O(n) since we loop the whole array only once.
//Space complexity of O(n) where n is unique email addresses in the hashset.
//Explanation: We loop the emails array and get email one by one. Then, we split the email by @ sign to local name and domain name.
//If the local name contains ".", then we ignore this one and treat as a string without ".". If the local name contains "+" sign,
//then we ignore the characters after "+" sign and get all the characters before "+". After that, we can store the concatenation of local name,
//"@" sign and domain name into the new string. And using hashset, we can get only unique email addresses. Then, returning the size of hashset
//is our desired value.

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