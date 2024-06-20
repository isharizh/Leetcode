class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='*'){
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        StringBuffer str = new StringBuffer();
        while(!stack.isEmpty()){
            str.append(stack.peek());
            stack.pop();
        }
        str.reverse();
        return str.toString();
    }
}