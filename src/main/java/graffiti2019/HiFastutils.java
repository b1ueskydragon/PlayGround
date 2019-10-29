package graffiti2019;

import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import it.unimi.dsi.fastutil.ints.Int2DoubleArrayMap;
import it.unimi.dsi.fastutil.ints.Int2DoubleMap;
import it.unimi.dsi.fastutil.ints.Int2DoubleMaps;

public class HiFastutils {

  /** keys and values should have same lengths */
  @VisibleForTesting
  static DoubleList justGen(int[] key, double[] value) {

    final Int2DoubleMap map = new Int2DoubleArrayMap(key, value);

    DoubleList res = new DoubleArrayList();

    for (Int2DoubleArrayMap.Entry entry : Int2DoubleMaps.fastIterable(map)) {
      res.add(entry.getIntKey() * entry.getDoubleValue());
    }

    return res;

  }

}
