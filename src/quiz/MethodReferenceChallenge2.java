package quiz;

public class MethodReferenceChallenge2 {

  public static void main(String[] args) {
    String shoot = shoot(Soprano::useRevolver);

    // 匿名クラスで実装と同時にインスタンス化ー
    System.out.println(shoot + new Gun() {
      public String shoot() {
        return null;
      }
    }.reload());

    // same as above
    System.out.println(shoot + new GunImpl().reload());
  }

  static String shoot(Gun gun) {
    return gun.shoot() + gun.shoot();
  }

  interface Gun {
    String shoot();

    default String reload() {
      return "reload";
    }
  }

  static class Soprano {
    static String useRevolver() {
      return "shot";
    }
  }

  // 匿名クラスを使わない場合
  static class GunImpl implements Gun {
    @Override
    public String shoot() {
      return null;
    }

//    @Override
//    public String reload() {
//      return "overwritten!!";
//    }
  }
}
