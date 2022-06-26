// Abstract class
package zoopack;
abstract class Animal {
  public abstract void animalhealth();
  public void health() {
    System.out.println("Animal health is GOOD");
  }
}

// Subclass (inherit from Animal)
class Pig extends Animal {
  public void animalhealth() {
    System.out.println("The Medicine are given");
  }
}

class Main {
  public static void main(String[] args) {
    Pig myPig = new Pig(); // Create a Pig object
    myPig.animalhealth();
    myPig.health();
  }
}
