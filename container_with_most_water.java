class container_with_most_water 
{
    public static int maxArea(int[] height) 
    {
        int maxWater = 0;
        int lp = 0;
        int rp = height.length - 1;
        while (lp < rp) {
            maxWater = Math.max(maxWater, Math.min(height[lp], height[rp]) * (rp - lp)); 
            if (height[lp] > height[rp]) {
                rp--;
            } else {
                lp++;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) 
    {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
