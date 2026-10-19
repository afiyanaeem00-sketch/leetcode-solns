class Solution {
    public int lengthOfLastWord(String s) {
        String[] h = s.split("");
        int n = h.length;
        int count =0;

        for(int i = n-1; i>=0; i--){
            if(!h[i].equals(" ")){
                count++;
                 continue;
            }
            else if(count != 0){
                 break;
            }
            // else if(h[i].equals(' ') && count == 0){
            //     count = 0;
            //     continue;
            // }
        }

        return count;
        
    }
}