package easy.array2_q3_find_disappeared_numbers;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> listaFaltantes = new ArrayList<>();
        boolean[] isChamado = new boolean[nums.length + 1];

        for (int num : nums) {
            isChamado[num] = true;
        }

        for (int i = 1; i <= nums.length; i++){
            if (isChamado[i] == false) {
                listaFaltantes.add(i);
            }
        }

        return listaFaltantes;
    }
}
