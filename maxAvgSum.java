class maxAvgSum 
{
    public static double Maximum_Average_Subarray(int[] nums, int k) 
    {
        int left = 0;
        int right = k-1;
        double maxAvg = 0;
        int sum = 0;

        // calculate the sum of first k elements

       for(int i=left; i<=right; i++)
       {
            sum += nums[i];
       }

       maxAvg = (double) sum / k;
       while(right < nums.length-1) 
       {
            sum -= nums[left];
            left++;
            right++;
            sum += nums[right];
            maxAvg = Math.max(maxAvg, (double)sum/k);
       }
       return maxAvg;
    }

    public static void main(String[] args) 
    {
        int []nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(Maximum_Average_Subarray(nums, k));
    }
    // Output: 12.75000
}