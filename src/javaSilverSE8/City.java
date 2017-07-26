package javaSilverSE8;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class City {

    public static void main(String [] args) {

        String [] ary = {"tokyo", "nagasaki" ,"mie" , "nara" };
        // List<String> city = Arrays.asList(ary); // 実行時エラー (固定リスト)
        List<String> city = new ArrayList<>(Arrays.asList(ary)); // (可変リスト)
        if(city.removeIf(str -> str.length() <= 3)) {
            System.out.println(city);
        }

    }

}
