class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];
        arr1[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            arr1[i]=arr1[i-1]*nums[i];
        }
        arr2[nums.length-1]=nums[nums.length-1];
        for(int j=nums.length-2;j>=0;j--){
            arr2[j]=arr2[j+1]*nums[j];
        }

        int[] result = new int[nums.length];
        
        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
            result[i]=arr2[i+1];
            else if(i==nums.length-1)
            result[i]=arr1[i-1];
            else
            result[i]=arr1[i-1]*arr2[i+1];
        }
        return result;

        
    }
}  
