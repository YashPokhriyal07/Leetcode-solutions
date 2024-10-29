class Solution {
    public int findMin(int[] nums) {
        int pivot=findPivot(nums);
       return findMinEL(nums,pivot+1,nums.length-1);
        
       
    }

    int findPivot(int []arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end&&arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start&&arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start]>=arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }

    int findMinEL(int[] arr,int low,int high) {
        

        while (low < high) {
            int mid = low + (high - low) / 2;

            if(arr[mid] < arr[high]) {
                high = mid;
            }else{
 
                low = mid + 1;
            }
        }

        return arr[low];
    }
}
