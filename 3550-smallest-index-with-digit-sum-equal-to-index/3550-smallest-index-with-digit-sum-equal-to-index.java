class Solution {
    public int sum(int n){
            int a=0;
            while(n>0){
                a=a+n%10;
                n/=10;
            }
            return a ;
        }
    public int smallestIndex(int[] nums) {
        

        for(int i =0; i<nums.length;i++){
            if(i==sum(nums[i])){
                return i;
            }

        }
        return -1;
        
    }
}