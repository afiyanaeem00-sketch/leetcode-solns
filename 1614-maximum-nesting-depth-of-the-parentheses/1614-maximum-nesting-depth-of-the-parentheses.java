class Solution {
    public int maxDepth(String s) {

        int count = 0;
        int max =0;

        char[] arr= s.toCharArray();
        for(int i =0; i < arr.length; i++){
            char ch = arr[i];
            if(ch == '('){
                count++;
                if(count>max){
                    max=count;
                }
            }
            else if(ch == ')'){
                count--;
            }

        }
        return max;        
    }
}