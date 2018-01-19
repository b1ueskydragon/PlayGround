package quiz2018;

public class PolymorphismStaticChallenge {

  static {
    System.out.println("Static");
  }

  public static void main(String... args) {
    class MichaelCorleone extends VitoCorleone {
      {
        System.out.println("SMichael");
      }

      @Override
      void execute() {
        System.out.println("IMichael");
      }
    }

    VitoCorleone vito = new MichaelCorleone();
    vito.execute();
  }

  static class VitoCorleone {
    static {
      System.out.println("SVito");
    }

    void execute() {
      System.out.println("IVito");
    }
  }

}

