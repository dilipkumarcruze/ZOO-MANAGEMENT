package zoopack;
import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    String userName;
    
    // Enter username and press Enter
    System.out.println("WELCOME TO THE JUNGLE ZOO"); 
    System.out.println("Enter yourname:"); 
    userName = myObj.nextLine();   
       
    System.out.println("HELLO " + userName+" WELCOME TO THE JUNGLE");        
  }
}
