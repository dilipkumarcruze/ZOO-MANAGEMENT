package zoopack;
interface Reptiles {
  public void Crocodile();
  public void sleep(); 
}

class Crocodile implements Reptiles {
  public void Crocodile() {
    System.out.println("Crocodile eats well");
  }
  public void sleep() {
    System.out.println("Sleeping shedule is good");
  }
}

class Main {
  public static void main(String[] args) {
    Crocodile myCrocodile = new Crocodile();
    myCrocodile.Crocodile();
    myCrocodile.sleep();
  }
}
