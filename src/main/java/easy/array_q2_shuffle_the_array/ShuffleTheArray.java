package easy.array_q2_shuffle_the_array;

public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] listaNova = new int[2 * n];
        int j = 0;

        for (int i = 0; i < 2 * n; i += 2) {
            listaNova[i] = nums[j];
            j++;
        }

        for (int i = 1; i < 2 * n; i += 2) {
            listaNova[i] = nums[j];
            j++;
        }

        return listaNova;
    }
}