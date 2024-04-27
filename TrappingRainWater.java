import java.util.Stack;

public class TrappingRainWater {

    public static int trappingRainWater(int height[])
    {
        // using helper arrays and arrays
        /* 
        int n= height.length -1;
        // calculate left max boundary -- helper array
        int leftMax[] = new int[n+1];
        leftMax[0] = height[0];
        for(int i=1; i<=n; i++)
        {
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }

        // calculate right max boundary -- helper array
        int rightMax[] = new int[n+1];
        rightMax[n] = height[n];
        for(int i=n-1; i>= 0; i--)
        {
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }

        // loop
        int waterLevel=0;
        int trappedWater = 0;
        for(int i=0; i<=n; i++)
        {
            // waterLevel = min(leftMax bound, rightMax bound)
            waterLevel = Math.min(leftMax[i], rightMax[i]);
            // trapped water = waterLevel-height[i]
            trappedWater += waterLevel-height[i];

        }
        return trappedWater; */

        // 2... using TWO-POINTER APPROACH
        /*
        int left = 0;
        int right = height.length-1;
        int leftMax = 0;
        int rightMax = 0;
        int trappedWater = 0;

        while (left < right) 
        {
            if(height[left] < height[right])
            {
                if(height[left] >= leftMax)
                {
                    leftMax = height[left];
                }    
                else{
                    trappedWater += leftMax-height[left];
                }
                left++;
            }
            else{
                if(height[right] >= rightMax)
                {
                    rightMax = height[right];
                }
                else
                {
                    trappedWater += rightMax - height[right];
                }
                right--;
            }
        }
        return trappedWater;

         */


        //  3... stack based approach


        int n = height.length;
        int trappedWater = 0;
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack.peek());
        for(int i=0; i<n; i++)
        {
            while(!stack.isEmpty() && height[i] > height[stack.peek()]) 
            {
                int top = stack.pop();
                if(stack.isEmpty())
                {
                    break;
                }    
                int distance  = i-stack.peek()-1;
                int boundedHeight = Math.min(height[i], height[stack.peek()])-height[top];
                trappedWater += distance*boundedHeight;
            }
            stack.push(i);
        }
        return trappedWater;
         
    }
    public static void main(String[] args) {
        int a[] = {4,2,0,6, 3,2,5};
        System.out.println(trappingRainWater(a));
    }
    
}