class Solution {
    public int calPoints(String[] operations) {

        // Stack stores all VALID scores
        Stack<Integer> stack = new Stack<>();

        // Traverse every operation
        for (int i = 0; i < operations.length; i++) {

            // ----------------------------
            // Case 1 : "C"
            // Remove the previous valid score
            // ----------------------------
            if (operations[i].equals("C")) {

                stack.pop();     // Removes the top score

            }

            // ----------------------------
            // Case 2 : "D"
            // Double the previous valid score
            // ----------------------------
            else if (operations[i].equals("D")) {

                // peek() returns the top element WITHOUT removing it
                int lastScore = stack.peek();

                // Push double of previous score
                stack.push(lastScore * 2);

            }

            // ----------------------------
            // Case 3 : "+"
            // Sum of previous TWO valid scores
            // ----------------------------
            else if (operations[i].equals("+")) {

                // Top score
                int first = stack.pop();

                // Second top score
                int second = stack.peek();

                // Put the first score back because
                // we only wanted to read it
                stack.push(first);

                // Push the new score
                stack.push(first + second);

            }

            // ----------------------------
            // Case 4 : Number
            // Example : "5", "-2", "17"
            // ----------------------------
            else {

                // Convert String into Integer
                stack.push(Integer.parseInt(operations[i]));

            }

        }

        // ----------------------------
        // Calculate Final Sum
        // ----------------------------

        int sum = 0;

        while (!stack.isEmpty()) {

            sum += stack.pop();

        }

        return sum;

    }
}