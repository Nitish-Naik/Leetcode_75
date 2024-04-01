public class maxVowels 
{
    public static int maxVowel(String s, int k) 
    {
        int max = 0;
        int count = 0;
        int left = 0;
        int right = k - 1;
        String vowels = "aeiou";
        
        // Count vowels in the first window
        for (int i = left; i <= right; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                count++;
            }
        }
        max = count;

        // Slide the window and update count and max
        while (right < s.length() - 1) {
            if (vowels.indexOf(s.charAt(left)) != -1) {
                count--;
            }
            left++;
            right++;
            if (vowels.indexOf(s.charAt(right)) != -1) {
                count++;
            }
            max = Math.max(max, count);
        }
        return max;
    }

    public static void main(String[] args) 
    {
        String s = "abciiidef";
        int k=3;
        System.out.println(maxVowel(s, k));    
    }
}
