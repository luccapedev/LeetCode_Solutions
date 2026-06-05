package easy.array2_q1_set_mismatch;

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int[] listaErro = new int[2];
        int maiorNumero = 0;
        int contador = nums[0];

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > maiorNumero){
                maiorNumero = nums[i];
            }
        }

        for(int i = 0; i < nums.length; i++) {
            if (contador != nums[i]) {
                listaErro[0] = nums[i];
                listaErro[1] = contador;
            }

            if (nums[0] <= 1){
                contador++;
            } else {
                contador--;
            }
        }

        return  listaErro;
    }
}