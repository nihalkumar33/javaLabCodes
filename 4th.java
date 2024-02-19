import java.util.Scanner;

class Car {
    int speed;
    double regularPrice;
    String color;
    
    Car(int speed, double regularprice, String color) {
        this.speed = speed;
        this.regularPrice = regularprice;
        this.color = color;
    }
    
    double getSalesPrice() {
        return regularPrice;
    }
}

class Truck extends Car {
    int weight;
    
    Truck(int s, double rp, String clr, int w) {
        super(s, rp, clr);
        weight = w;
    }
    
    double getSalesPrice() {
        if (weight > 2000) {
            regularPrice = regularPrice * 0.9;
            return regularPrice;
        }
        
        else {
            regularPrice = regularPrice * 0.8;
            return regularPrice;
        }
    }
}

class Ford extends Car {
    int year;
    int manufacturerDisc;
    
    Ford(int s, double rp, String clr, int yr, int mfd) {
        super(s, rp, clr);
        year = yr;
        manufacturerDisc = mfd;
    }
    
    double getSalesPrice() {
        regularPrice -= manufacturerDisc;
        return regularPrice;
    }
}

class Sedan extends Car {
    int length;
    
    Sedan(int s, double rp, String clr, int len) {
        super(s, rp, clr);
        length = len;
    }
    
    double getSalesPrice() {
        if (length > 20) {
            regularPrice *= 0.95;
            return regularPrice;
        }
        
        else {
            regularPrice *= 0.90;
            return regularPrice;
        }
    }
}

class MyOwnAutoShop {
    public static void main(String[] args) {
        Sedan sedanCar = new Sedan(100, 3500000, "Blue", 22);
        System.out.println("Price of Sedan: " + sedanCar.getSalesPrice());
        
    }
}

