package javaSilverSE8;


public class AryAry {

    public static void main(String [] args) {

        int [][] ary = {{1, 2, 3}, {4, 5, 6, 7}}; // 行列
        System.out.println(ary[0].length);
        System.out.println(ary.length);
        System.out.println(ary[1].length);
        System.out.println(ary.getClass().isArray());
        System.out.println(ary[1][2]);

        System.out.println(ary[0]);

        for(int [] i : ary){
            System.out.println(i);
        }
        for(int i : ary[1]){
            System.out.println(i);
        }
    }
}
