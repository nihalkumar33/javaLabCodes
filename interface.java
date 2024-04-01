import java.util.*;

interface area {
  double pi = 3.14;
  double clac(double x, double y);
}

class rec impliments area {
  double calc(double x, double y) {
    return x*y;
  }
}

class circ impliments area{
  double calc(double x, double y) {
    return pi*x*y;
  }
}

class main {
  public static void main(String[] args) {
    rec r = new rec();
    circ c = new circ();

    area a;
    a = r;

    double ans1 = a.calc(10, 20);
    a = c;
    double ans2 = a.calc(20, 20);
  }
