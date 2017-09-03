package code.with.play;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * target の可変性を考慮し配列からリストへ変更
 */
public class FindMax {

  private static int find(List<Integer> list){
      int centerIdx = list.size() / 2;
      List<Integer> a = new ArrayList<>();
      List<Integer> b = new ArrayList<>();

      // 左半分 (a)
      int idx = 0;
      for(int i : list) {
        a.add(i);
        idx += 1;
        if(idx == centerIdx)
          break;
      }

      // 右半分 (b)
      for(int i = centerIdx ; i < list.size() ; i ++){
        b.add(list.get(i));
      }

    // basic case と recursive case
    if(a.size() == 1 && b.size() == 1) {
        return a.get(0) > b.get(0) ? a.get(0) : b.get(0);
    }else{
        return find(a) > find(b) ? find(a) : find(b);
    }
  }

  public static void main(String [] args){
    List<Integer> target = Arrays.asList(200, 6, 12, 34, 100, 11, 2, 99, 101);
    System.out.println(find(target));
  }
}
