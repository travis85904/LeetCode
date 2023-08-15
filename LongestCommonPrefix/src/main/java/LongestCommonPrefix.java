public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();

        if (strs.length == 1) {
            return strs[0];
        }

        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            boolean isSame = true;

            for (int j = 1; j < strs.length; j++) {

                if (i >= strs[j].length() || c != strs[j].charAt(i)) {
                    isSame = false;
                    i = strs[0].length();
                    break;
                }

            }

            if (isSame)
                sb.append(c);
        }
        return sb.toString();
    }
}
