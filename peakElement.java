/**
 * peakElement
 */
public class peakElement 
{
    public static int findPeakElement(int[] nums) 
    {
        if(nums.length == 0)  return -1;
        int n = nums.length;
        if(n ==1) return 0;
        if(nums[0] > nums[1]) return 0;
        for(int i =1; i<nums.length-1; i++)
        {
            if(nums[i] > nums[i-1] && nums[i] > nums[i+1]) return i;
        }
        if(nums[n-1] > nums[n-2]) return n-1;
        return -1;
    }
    public static void main(String[] args) 
    {
        int nums[] = {1,2,3,1}; // 2
        int nums1[] = {1,2,1,3,5,6,4}; // 5
        System.out.println(findPeakElement(nums));
        System.out.println(findPeakElement(nums1));
    }
}