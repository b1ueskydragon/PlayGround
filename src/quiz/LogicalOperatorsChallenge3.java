package quiz;

/**
 * i ++ 判定・処理後のインクリ(後置インクリメント)
 * ++ i 判定・処理前のインクリ(前置インクリメント)
 *
 * &・| 前の判定結果の TF に関わらず後ろも判定・処理する
 * &&・|| 前の判定結果の TF により後ろを判定・処理する場合としない場合がある
 */
public class LogicalOperatorsChallenge3 {

  public static void main(String[] args) {
    int num1 = 7;
    int num2 = 7;

    if (num1 > num2 && num1++ > ++num2) {
      num1++;
    }

    if (++num2 > num1 || num1++ == num2++) {
      num1++;
    }

    System.out.println(num1 + ":" + num2);


    int num3 = 7;
    int num4 = 7;

    if (num3 > num4 & num3++ > ++num4) {
      num3++;
    }

    if (++num4 > num3 | num3++ == num4++) {
      num3++;
    }

    System.out.println(num3 + ":" + num4);
  }
}
