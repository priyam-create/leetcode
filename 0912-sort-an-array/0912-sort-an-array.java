class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }
    void mergeSort(int nums[],int l,int r){
        if(l>=r) return;
        
        int mid=l+(r-l)/2;
        mergeSort(nums,l,mid);
        mergeSort(nums,mid+1,r);

        merge(nums,l,mid,r);
    }
    void merge(int nums[],int l,int mid,int r){
        int[] arr=new int[r-l+1];
        int i=l;int j=mid+1;int k=0;

        while(i<=mid && j<=r){
            if(nums[i]<=nums[j])arr[k++]=nums[i++];
            else arr[k++]=nums[j++];
        }
        while(i<=mid)arr[k++]=nums[i++];
        while(j<=r)arr[k++]=nums[j++];
        for(int s=0;s<arr.length;s++){
            nums[l++]=arr[s];

        }
    }
}