class Solution {

    public boolean isPossible (int[] arr, int m ,int k , int day){
        int fl = 0;
        int boq = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] <= day){
                fl++;
                if(fl == k){
                    boq++;
                    fl = 0;
                }
                if(boq == m){
                    return true;
                }
            }
            else{
                fl = 0;
            }

        }
        return false;
    }


    public int minDays(int[] arr, int m, int k) {
        int min = arr[0];
        int max = arr[0];
        for( int i = 0 ; i < arr.length ; i++){
            min = Math.min( min , arr[i]);
            max = Math.max( max , arr[i] );
        }
        int ans = -1;
        while(min <= max){
            int mid = min + (max - min)/2;
            if(isPossible(arr,m,k,mid)){
                ans = mid;
                max = mid - 1;
            }
            else{
                min = mid + 1;
            }
        }

        return ans;
    }
}