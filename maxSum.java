public class maxSum {
    public static void main(String[] args) {
        int a[] = {6, 2, 3, 4, 7, 2, 1, 7, 1};
        int k = 4;
        int lsum = 0;
        int rsum = 0;
        int maxsum = 0;

        // Calculate the sum of the first k elements
        for (int i = 0; i < k; i++) {
            lsum += a[i];
        }

        // Initialize maxsum with the sum of first k elements
        maxsum = lsum;

        // Calculate the sum of remaining elements using sliding window technique
        for (int i = 0; i < a.length - k; i++) {
            lsum = lsum - a[i]; // Remove the leftmost element from the window
            rsum = rsum + a[i + k]; // Add the rightmost element to the window
            maxsum = Math.max(maxsum, lsum + rsum); // Update maxsum if needed
        }

        System.out.println("Maximum Sum : " + maxsum);
    }
}
