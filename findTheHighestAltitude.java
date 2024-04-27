class findTheHighestAltitude {
    public static int largestAltitude(int[] gain) 
    {
        // prefix sum
        int i=1; 
        int j=0;
        int a[] = new int[gain.length+1];
        a[0] = 0;
        while(j < gain.length)
        {
            a[i] = a[i-1] + gain[j];
            i++;
            j++;
        }
        int ans = findMax(a);
        return ans;
    }

    public static int findMax(int a[])
    {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<a.length; i++)
        {
            if(max < a[i])
            {
                max = a[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int a[] = {-5,1,5,0,-7};
        System.out.println(largestAltitude(a));
    }
}