package javaSilverSE8;


interface XIF {
    void methodA();
}

interface  YIF {
    void methodB();
}

interface  SubIf extends  XIF, YIF {
    void methodC();
}

class MyClass implements SubIf {
    // super interface, sub interfaceの抽象メソッドを全部継承すべき
    public void methodA() { System.out.println("methodA()"); }
    public void methodB() { System.out.println("methodB()"); }
    public void methodC() { System.out.println("methodC()"); }
}

abstract class MyAbsClass implements SubIf {
    // 継承が義務化されない
}


public class InterfaceExtention {
    public static void main(String [] args) {
        MyClass c = new MyClass();
        c.methodA(); c.methodB(); c.methodC();
    }
}
