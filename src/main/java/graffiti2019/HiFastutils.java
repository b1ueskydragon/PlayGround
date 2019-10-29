package graffiti2019;

import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.ints.Int2DoubleArrayMap;
import it.unimi.dsi.fastutil.ints.Int2DoubleMap;
import it.unimi.dsi.fastutil.ints.Int2DoubleMaps;

public class HiFastutils {

  /** keys and values should have same lengths */
  @VisibleForTesting
  static double productScalar(int[] tx, double[] x) {
    final Int2DoubleMap map = new Int2DoubleArrayMap(tx, x);
    double s = 0;
    for (Int2DoubleArrayMap.Entry entry : Int2DoubleMaps.fastIterable(map)) {
      s += entry.getIntKey() * entry.getDoubleValue();
    }
    return s;
  }

}
