import java.util.*;
import java.util.Set;
class find_difference_two_arrays {
    public static void findDifference(int[] nums1, int[] nums2) 
    {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        HashSet<Integer> a = new HashSet<>();
        for (int i : nums1) 
        {
            a.add(i);    
        }
        HashSet<Integer> b = new HashSet<>();
        for (int i : nums2) 
        {
            b.add(i);    
        }

        for(Integer key : a)
        {
            if(b.contains(key) == false)
            {
                list1.add(key);
            }
        }
        for(Integer key : b)
        {
            if(a.contains(key) == false)
            {
                list2.add(key);
            }
        }
        ans.add(list1);
        ans.add(list2);
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int []nums1 = {1,2,3, 3};
        int []nums2 = {1,1,2,2};
        findDifference(nums1, nums2);
    }
}