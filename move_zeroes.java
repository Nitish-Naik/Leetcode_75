class move_zeroes {
    public static int[] moveZeroes(int[] nums) 
    {
        int nonZeroIndex = 0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] !=0 )
            {
                nums[nonZeroIndex++] = nums[i];
            }
        }

        while(nonZeroIndex < nums.length)
        {
            nums[nonZeroIndex++] = 0;
        }
        return nums;
    }
    public static void main(String[] args) 
    {
        int[] input = {0,1,0,3,12};
        // Output: [1,3,12,0,0]
        int nums[] = moveZeroes(input);
        for(int i: nums)
        {
            System.out.print(i+" ");
        }
    }
}