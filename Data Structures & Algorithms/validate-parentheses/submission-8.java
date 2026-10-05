class Solution {

    public boolean isValid(String s)
    {
        ArrayList<Character> stack = new ArrayList<>();

        for (Character ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.add(ch);
            } else if (stack.size() == 0 ||
                       !matche(stack.remove(stack.size()-1), ch)) {
                return false;
            }
        }

        if (stack.size() != 0)
            return false;

        return true;
    }

    private boolean matche(Character first, Character second) {
        if (first == '(' && second == ')')
            return true;
        if (first == '[' && second == ']')
            return true;
        if (first == '{' && second == '}')
            return true;
        return false;
    }
}
