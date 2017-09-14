package codeiq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PuzzlePattern___ {

    private static List<Integer> elementList = new ArrayList<>(Arrays.asList(2,4,8,16,32));

    private static int getScore(int i){
        int el ;
        if(i == 0){
            elementList.get(i);
        }else{
            if(elementList.get(i-1).equals(elementList.get(i))) getScore(i);
        }

        el =  elementList.get(i);
        return el * ((int)(Math.log(el)/Math.log(2)) -1);
    }

    public static void main(String[] args) {
        System.out.println(getScore(2));
    }
    // ありうる合計 0, 4, 16, 48, 128
}
