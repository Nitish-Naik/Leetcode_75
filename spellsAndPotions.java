import java.util.*;
public class spellsAndPotions {
    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions); // Sort the potions array

        int[] result = new int[spells.length];

        for (int i = 0; i < spells.length; i++) {
            int spell = spells[i];
            int count = countSuccessfulPairs(spell, potions, success);
            result[i] = count;
        }

        return result;
    }

    private static int countSuccessfulPairs(int spell, int[] potions, long success) {
        int left = 0;
        int right = potions.length - 1;
        int count = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long product = (long) spell * potions[mid];
            if (product >= success) {
                right = mid - 1; // Continue search in left part
                count = potions.length - mid; // All elements from mid to right can form successful pairs
            } else {
                left = mid + 1; // Continue search in right part
            }
        }

        return count;
    }
    public static void main(String[] args) 
    {
        int spells[] = {5,1,3};
        int []potions = {1,2,3,4,5};
        int success = 7;
        int []c = successfulPairs(spells, potions, success);
        for(int i: c)
        {
            System.out.print(i+" ");
        }
    }
}
