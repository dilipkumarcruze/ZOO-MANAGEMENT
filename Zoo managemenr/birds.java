// Abstract class
package zoopack;
abstract class Birds {
  public abstract void Birdshealth();
  public void health() {
    System.out.println("Birds health is GOOD");
  }
}

// Subclass (inherit from Birds)
class Parrot extends Birds {
  public void Birdshealth() {
    System.out.println("The Medicine are given");
  }
}

class Main {
  public static void main(String[] args) {
    Parrot myParrot = new Parrot(); // Create a Parrot object
    myParrot.Birdshealth();
    myParrot.health();
  }
}
