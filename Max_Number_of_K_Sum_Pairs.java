import java.util.*;
class Max_Number_of_K_Sum_Pairs {
    public static int maxOperations(int[] nums, int k) 
    {
        Arrays.sort(nums);
        int count = 0;
        int i=0, j=nums.length-1;
        while(i < j)
        {
            if(nums[i] + nums[j] == k)
            {
                i++;
                j--;
                count++;
            }
            else if(nums[i] + nums[j] < k)
            {
                i++;
            }
            else 
            {
                j--;
            }
        }
        return count;
    }
    public static void main(String[] args) 
    {
        int[] nums = {1,2,3,4};
        int k = 5;
        System.out.println(maxOperations(nums, 5));
    }
}