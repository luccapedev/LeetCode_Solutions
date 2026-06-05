package medium.stack_q1_build_array;

import java.util.ArrayList;
import java.util.List;

public class BuildArray {
    public List<String> buildArray(int[] target, int n) {
        List<String> stack = new ArrayList<String>();
        int contador = 1;
        for (int i = 0; i < target.length; i++) {
            if (target[i] == contador) {
                stack.add("Push");
            } else {
                stack.add("Push");
                stack.add("Pop");
                i--;
            }
            contador++;
        }

        return stack;
    }
}
