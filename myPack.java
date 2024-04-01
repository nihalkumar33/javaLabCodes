package myPackage;
public class stuDetails {
  String Name;
  double balance;

  public stuDetails(String n, double b) {
    Name = n;
    balance = b;
  }
  
  public void show() {
    System.out.println("Name: " + Name + " Balance: " + balance);
  }
}

//Next file 
import myPackage.stuDetails;

public class main {
  public static void main(String[] args) {
    stuDetails s = new stuDetails("Nihal", 20);
    s.show();
  }
}

