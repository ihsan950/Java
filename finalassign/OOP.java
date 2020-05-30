package finalassign;

import java.util.Scanner;

public class OOP {
	public static void main(String[] args) {
		System.out.println("OOP programming:");
        car car_1 = new car();
        car_1.brand = "Toyota";
        car_1.year = 1997;
        car_1.model = "Supra";
        car_1.info();
        
	}


}

class car {
    String brand;
    int year;
    String model;

 

    void info() {

        System.out.println("Brand:" + brand + "\nYear:" + year + "\nModel:" + model);
    }
   
    
}
