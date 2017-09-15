package codeiq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PuzzlePattern___ {
    private static final List<Integer> notTargetW = new ArrayList<>(Arrays.asList(0, 4, 8, 12));
    private static  final List<Integer> notTargetH = new ArrayList<>(Arrays.asList(0,1,2,3));

    int cents[] = {2,4,8,16,32};

    public int count(int amount) {
        return count(amount, 0);
    }

    private int count(int amount, int idx) {
        if (amount == 0)
            return 1;
        else if (amount < 0 || idx >= cents.length)
            return 0;
        else
            return count(amount - cents[idx], idx) + count(amount, idx + 1);
    }

    private static boolean sameFlag(List<Integer> list, int idx){
        boolean flag = false;
        if(!notTargetW.contains(idx)){
            if(list.get(idx - 1).equals(list.get(idx))) {
                flag = true;
            }
        }
        if (!notTargetH.contains(idx)) {
            if (list.get(idx - 4).equals(list.get(idx))) {
                flag = true;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
         System.out.println(new PuzzlePattern___().count(32));
    }
    // ありうる合計 0, 4, 16, 48, 128
}
