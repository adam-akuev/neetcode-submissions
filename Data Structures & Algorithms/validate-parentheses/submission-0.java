class Solution {
    public boolean isValid(String s) {
        Stack<Character> brackets = new Stack<>();
        Map<Character, Character> closeToOpen = new HashMap<>();
        closeToOpen.put(')', '(');
        closeToOpen.put(']', '[');
        closeToOpen.put('}', '{');

        for (char ch : s.toCharArray()) {
            if (closeToOpen.containsKey(ch)) {
                if (!brackets.empty() && brackets.peek() == closeToOpen.get(ch)) {
                    brackets.pop();
                } else {
                    return false;
                }
            } else {
                brackets.push(ch);
            }
        }
        return brackets.empty();
    }
}
