public class Leetcode2529 
{
    public static int maximumCount(int[] nums) 
    {
        if (nums[0] > 0 || nums[nums.length-1] < 0) {
            return nums.length;
        }
        int lastNegIndex = lastNegative(nums, 0, nums.length-1)+1;
        int firstPosIndex =nums.length - lastNegIndex-1;
        return Math.max(lastNegIndex, firstPosIndex);
    }

    // binary search for finding the first positive number
    public static int lastNegative(int a[], int low, int high) 
    {
        int ans = -1;
        while (low <= high) 
        {
            int mid = low + (high - low) / 2;
            if(a[mid] < 0)
            {
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }
    
    public static int firstPosIndex(int a[], int low, int high)
    {
        int ans = -1;
        while (low <= high) 
        {
            int mid = low + (high - low) / 2;
            if(a[mid] > 0)
            {
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) 
    {
        int a[] = {-2,-1,-1,1,2,3};
        System.out.println(maximumCount(a));
    }
}
