package easy.array_q1_concatenation_of_array;

public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int tamanhoLista = nums.length;
        int[] ans = new int[2 * tamanhoLista];

        for (int i = 0; i < tamanhoLista; i++) {
            ans[i] = nums[i];
            ans[i + tamanhoLista] = nums[i];
        }

        return ans;
    }
}