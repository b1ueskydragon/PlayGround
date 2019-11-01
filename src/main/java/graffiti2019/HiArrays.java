package graffiti2019;

import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.ints.Int2DoubleArrayMap;
import it.unimi.dsi.fastutil.ints.Int2DoubleMap;
import it.unimi.dsi.fastutil.ints.Int2DoubleMaps;

public class HiArrays {

  /**
   * keys and values should have same lengths
   */
  @VisibleForTesting
  static double productScalar(int[] tx, double[] x) {
    final Int2DoubleMap map = new Int2DoubleArrayMap(tx, x);
    double s = 0;
    for (Int2DoubleArrayMap.Entry entry : Int2DoubleMaps.fastIterable(map)) {
      s += entry.getIntKey() * entry.getDoubleValue();
    }
    return s;
  }

  @VisibleForTesting
  static double[] nonZeroValues() {

    final int[] dimension = {3, 3};

    //  {0, 1, 2}
    //  {0, 0, 3}
    //  {4, 5, 0}
    final int[] sparseVector = {0, 1, 2, 0, 0, 3, 4, 5, 0};

    // indices of non-zero elements.
    final int[] indices = {1, 2, 2, 0, 1};

    // values that corresponded with indices.
    double[] values = new double[indices.length];

    // 2 non-zero elements in row=0, 1 in row=1, 2 in row=2.
    final int[] rows = {0, 0, 1, 2, 2};

    for (int i = 0; i < indices.length; i++) {
      values[i] = sparseVector[dimension[0] * rows[i] + indices[i]];
    }

    return values;
  }

}
