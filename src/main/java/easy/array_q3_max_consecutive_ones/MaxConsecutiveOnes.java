package easy.array_q3_max_consecutive_ones;

/**
 * LeetCode 485 - Max Consecutive Ones
 * Difficulty: Easy
 * Topic: Array
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int contador = 0;
        int recorde = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                contador++;

                if (contador > recorde) {
                    recorde = contador;
                }
            } else {
                contador = 0;
            }
        }

        return recorde;
    }
}