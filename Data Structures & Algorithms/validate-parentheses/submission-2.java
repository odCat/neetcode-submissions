class Solution {
    public boolean isValid(String s) {
        ArrayList<Character> stack = new ArrayList<>();

        for (char c : s.toCharArray()) {
            switch (c) {
            case '(':
            case '{':
            case '[':
                stack.add(c);
                break;
            case ')':
                if (stack.isEmpty() || '(' != stack.get(stack.size()-1))
                    return false;
                else
                    stack.remove(stack.size()-1);
                break;
            case '}':
                if (stack.isEmpty() || '{' != stack.get(stack.size()-1))
                    return false;
                else
                    stack.remove(stack.size()-1);
                break;
            case ']':
                if (stack.isEmpty() || '[' != stack.get(stack.size()-1))
                    return false;
                else
                    stack.remove(stack.size()-1);
                break;
            default:
                break;
            }
        }

        if (stack.isEmpty())
            return true;
        else
            return false;
    }
}
