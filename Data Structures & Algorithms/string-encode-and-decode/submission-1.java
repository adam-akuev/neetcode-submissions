class Solution {

    public String encode(List<String> strs) {
        String line = "";
        for (String s : strs) {
            line += s.length() + "#" + s;
        }
        return line;
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int size = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + size;
            list.add(str.substring(i, j));
            i = j;
        }
        
        return list;
    }
}
