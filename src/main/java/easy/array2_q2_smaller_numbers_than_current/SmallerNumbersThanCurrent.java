package easy.array2_q2_smaller_numbers_than_current;

public class SmallerNumbersThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int recorde = 0;
        int[] resposta = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            for (int num : nums) {
                if (nums[i] > num){
                    recorde++;
                }
            }
            resposta[i] = recorde;
            recorde = 0;
        }

        return resposta;
    }
}
