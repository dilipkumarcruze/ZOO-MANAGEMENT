package zoopack;
interface FirstInterface {
  public void myMethod();
}

interface SecondInterface {
  public void myOtherMethod();
}

class DemoClass implements FirstInterface, SecondInterface {
  public void myMethod() {
    System.out.println("Cameras are working properly");
  }
  public void myOtherMethod() {
    System.out.println("Animals, Birds and Tourist are fine");
  }
}

class Main {
  public static void main(String[] args) {
    DemoClass myObj = new DemoClass();
    myObj.myMethod();
    myObj.myOtherMethod();
  }
}
