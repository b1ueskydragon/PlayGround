package effective.generics.n29;

import java.util.HashMap;
import java.util.Map;

// 29 type-safe heterogeneous container
public class Favorites {

  private Map<Class<?>, Object> favorites = new HashMap<>();

  public <T> void putFavorite(Class<T> type, T instance) {
    if (type == null) throw new NullPointerException("Type is null");
    favorites.put(type, instance);
  }

  public <T> T getFavorite(Class<T> type) {
    return type.cast(favorites.get(type));
  }
}
