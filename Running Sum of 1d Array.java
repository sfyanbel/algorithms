class Solution {
    public int[] runningSum(int[] nums) {
        
        
        int[] sums= new int[nums.length];
      
        int sum=0;
      
        for(int i=0;i<nums.length;i++){
            
            for(int j=0;j<=i;j++){   
                sum=sum+nums[j];
            }
            sums[i]=sum;
               sum=0;
        }

        return sums;
        
    }
}
