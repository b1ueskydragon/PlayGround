package graffiti;

class FuncList {
  public static boolean isOdd(int x) {
    return (x % 2 == 1);
  }
  public static String addNamePrefix(boolean male, String name){
    return male ? "Mr." + name : "Ms." + name;
  }
}

interface Func1 {
  boolean call(int x);
}

interface Func2{
  String call(boolean m, String n);
}

// Main
public class FunctionPra {
  public static void main(String[]args) {
    FuncList funcList = new FuncList();
    Func1 func1 = FuncList::isOdd;
    Func2 func2 = FuncList::addNamePrefix;

    System.out.println(func1.call(15));
    System.out.println(func2.call(false,"Alex"));

  // Lambda
  Func1 funcLambda1 = x -> x%2 == 1;
  Func2 funcLambda2 = (m, n) -> (m ? "Mr." : "Ms.") + n;

  Func2 funcLambda2_ = (male, name) -> {
    if (male) return  "Mr." + name;
    else return "Ms." + name;
  };

  System.out.println(funcLambda1.call(23));
  System.out.println(funcLambda2.call(true,"John"));
  System.out.println(funcLambda2_.call(false, "Ricky"));

  }
}
