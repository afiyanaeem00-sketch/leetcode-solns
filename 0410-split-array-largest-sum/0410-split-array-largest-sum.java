class Solution {

    public boolean isPossible (int[] arr,int sum, int k){
        int cur = 0;
        int sub =1;
        for(int i =0; i<arr.length;i++){
            if(cur + arr[i] <= sum){
                cur += arr[i];
            }
            else{
                sub++;
                cur = arr[i];
            }
        }
        return sub <=k;
    }
    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;
        for(int ele : nums){
            low = Math.max(low,ele);
            high += ele;
        }

        int ans = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(isPossible(nums, mid , k)){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
        
    }
}