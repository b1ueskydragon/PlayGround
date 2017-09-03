package code.with.play;

public class FindMax {

  private static int find(int [] ary){
      int centerIdx = ary.length / 2;
      int [] a = new int[ary.length/2];
      int [] b = new int[ary.length/2];

      int idx = 0;
      for(int i : ary) {
        a[idx] = i;
        idx += 1;
        if(idx == centerIdx)
          break;
      }

      int idx_ = 0;
      for(int i = centerIdx ; i < ary.length ; i ++){
        b[idx_++] = ary[i];
      }

    if(a.length == 1 && b.length == 1) {
        return a[0] > b[0] ? a[0] : b[0];
    }else{
        return find(a) > find(b) ? find(a) : find(b);
    }
  }

  public static void main(String [] args){

    // TODO lengthが2のn乗ではない場合は？
    int [] target = {2, 9, 6, 12, 34, 100, 11, 2};
    System.out.println(find(target));

  }
}
