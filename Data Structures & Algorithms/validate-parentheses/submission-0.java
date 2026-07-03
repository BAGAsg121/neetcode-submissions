class Solution {

    public boolean isValid(String s) {

        // Stack to store only opening brackets
        Stack<Character> stack = new Stack<>();

        // Traverse every character of the string
        for (int i = 0; i < s.length(); i++) {

            // Current character
            char currentCharacter = s.charAt(i);

            // ---------------------------------------------------
            // CASE 1 : Opening Bracket
            // ---------------------------------------------------
            if (currentCharacter == '(' ||
                currentCharacter == '{' ||
                currentCharacter == '[') {

                // Push opening bracket into stack
                stack.push(currentCharacter);
            }

            // ---------------------------------------------------
            // CASE 2 : Closing Bracket
            // ---------------------------------------------------
            else {

                // If stack is empty,
                // there is no opening bracket to match.
                if (stack.isEmpty()) {
                    return false;
                }

                // Check if brackets match
                if ((currentCharacter == ')' && stack.peek() == '(') ||
                    (currentCharacter == '}' && stack.peek() == '{') ||
                    (currentCharacter == ']' && stack.peek() == '[')) {

                    // Matched pair
                    stack.pop();
                }

                // Wrong type of bracket
                else {
                    return false;
                }
            }
        }

        // If stack is empty,
        // every opening bracket found its pair.
        return stack.isEmpty();
    }
}