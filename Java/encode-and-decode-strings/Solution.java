class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded_str = new StringBuilder();

        for (String str : strs) {
            encoded_str.append(str.length()).append('#').append(str);
        }

        return encoded_str.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded_strs = new ArrayList<>();

        int i = 0;
        while (i < str.length()) {
            int hashIndex = str.indexOf('#', i);
            int len_str = Integer.parseInt(str.substring(i, hashIndex));

            i = hashIndex + 1;

            decoded_strs.add(str.substring(i, i + len_str));

            i += len_str;
        }

        return decoded_strs;

    }
}
