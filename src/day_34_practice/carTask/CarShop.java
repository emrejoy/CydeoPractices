package day_34_practice.carTask;

public class CarShop {

    public static void main(String[] args) {

        // create objects of each concrete class
        Toyota toyota = new Toyota("Corolla", 2021, 25000, "red");
        System.out.println(toyota);
        toyota.start();
        toyota.drive();


        System.out.println("------------------------");

        BMW bmw = new BMW("X5", 2021, 65000, "black");
        System.out.println(bmw);
        bmw.start();
        bmw.drive();

        System.out.println("------------------------");

        Audi audi = new Audi("A6", 2022, 52000, "white");
        System.out.println(audi);
        audi.start();
        audi.drive();
        audi.autoPark();

        System.out.println("------------------------");

        Mercedes mercedes = new Mercedes("S-Class", 2021, 90000, "silver");
        System.out.println(mercedes);
        mercedes.start();
        mercedes.drive();
        mercedes.autoPark();

        System.out.println("------------------------");

        Tesla tesla = new Tesla("Model S", 2022, 85000, "red");
        System.out.println(tesla);
        tesla.autoPark();
        tesla.selfDrive();
        
        tesla.start();
        tesla.drive();

        System.out.println("------------------------");

        Nio nio = new Nio("ET7", 2022, 85000, "blue");
        System.out.println(nio);
        nio.drive();
        nio.start();

        nio.autoPark();
        nio.selfDrive();

        

    }
}

        /*Honda honda = new Honda("Civic", 2022, 27000, "blue");

        BMW bmw = new BMW("X5", 2021, 65000, "black");

        Audi audi = new Audi("A6", 2022, 52000, "white");

        Mercedes mercedes = new Mercedes("S-Class", 2021, 90000, "silver");

        Tesla tesla = new Tesla("Model S", 2022, 85000, "red");

        Nio nio = new Nio("ET7", 2022, 85000, "blue");

        CydeoCar cydeoCar = new CydeoCar("CydeoCar", 2023, 200000, "white");


        // add the cars to the list

        cars.add(toyota);
        cars.add(honda);
        cars.add(bmw);
        cars.add(audi);
        cars.add(mercedes);
        cars.add(tesla);
        cars.add(nio);
        cars.add(cydeoCar);

        // test all the functions of each object
        for (Car car : cars) {
            System.out.println(car.toString());
            car.start();
            car.drive();
            car.stop();

            if (car instanceof AutoPark) {
                AutoPark autoPark = (AutoPark) car;
                autoPark.autoPark();
            }

            if (car instanceof AutoPilot) {
                AutoPilot autoPilot = (AutoPilot) car;
                autoPilot.selfDrive();
            }

            if (car instanceof Flyable) {
                Flyable flyable = (Flyable) car;
                flyable.fly();
            }

            System.out.println();
        }
    }
}
*/