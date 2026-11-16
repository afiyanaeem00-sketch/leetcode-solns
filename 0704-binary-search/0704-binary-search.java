class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1; 

        while ( low <= high){
            int mid = low + (high - low )/ 2;

            if(nums[mid]==target){
                System.out.println("element found at index:" + mid);
                return mid;
               
            }

            else if (nums[mid] > target){
                high = mid - 1;

            }

            else {
                low = mid + 1;
            }

        }

        System.out.println("Element not found");
        return -1;

        
    }
}