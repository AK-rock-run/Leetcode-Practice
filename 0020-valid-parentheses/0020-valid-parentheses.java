class Solution {
    public boolean isValid(String s) {
        //     int[] arr = new int[3];
        //     for(int i=0;i<s.length();i++){
        //         if(s.charAt(i)=='{')
        //             arr[0]=arr[0]+1;
        //         else if(s.charAt(i)=='}')
        //             arr[0]=arr[0]-1;

        //         if(s.charAt(i)=='(')
        //             arr[1]=arr[1]+1;
        //         else if(s.charAt(i)==')')
        //             arr[1]=arr[1]-1;

        //         if(s.charAt(i)=='[')
        //             arr[2]=arr[2]+1;
        //         else if(s.charAt(i)==']')
        //             arr[2]=arr[2]-1;
        //     } 
        // for(int i=0;i<3;i++){
        //     if(arr[i]!=0)
        //         return false;
        // }
        // return true;
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty())
                    return false;

                char top = stack.peek();

                if ((ch == '}' && top == '{') ||
                        (ch == ')' && top == '(') ||
                        (ch == ']' && top == '[')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}