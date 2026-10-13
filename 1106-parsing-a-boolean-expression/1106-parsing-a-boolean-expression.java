
class Solution {
    public boolean parseBoolExpr(String expression) {
        int[] index = {0};
        return parse(expression, index);
    }

    private boolean parse(String s, int[] index) {
        char c = s.charAt(index[0]++);

        if (c == 't') return true;
        if (c == 'f') return false;

        char operator = c;
        index[0]++; // Skip '('

        boolean result = (operator == '&');

        while (s.charAt(index[0]) != ')') {
            if (s.charAt(index[0]) == ',') {
                index[0]++;
                continue;
            }

            boolean value = parse(s, index);

            if (operator == '!') {
                result = !value;
            } else if (operator == '&') {
                result &= value;
            } else if (operator == '|') {
                result |= value;
            }
        }

        index[0]++; // Skip ')'
        return result;
    }
}
