package day_34_practice.deviceTask;

public class DeviceShop {

    public static void main(String[] args) {

            Iphone iphone = new Iphone("Apple", "Iphone 14 Pro Max","Large",1000,"White",true,true);
            Samsung samsung = new Samsung("Samsung","Galaxy S22","Medium",1120,"Black",true,true);
            Computer computer = new Computer("Dell", "Alien","Large",2500,"Black",false,true);
            Google google = new Google("Google","Google Pixel","Medium",1250,"Black",true,true);

            Laptop laptop = new Laptop("Dell", "Inspiron","Medium", 1200,"Black",true,true );
            Desktop desktop = new Desktop("Apple", "Imac", "Large", 1250,"Blue",false,true);

            System.out.println(iphone);
            System.out.println(samsung);
            System.out.println(computer);
            System.out.println(google);
            System.out.println(laptop);
            System.out.println(desktop);

    }
}