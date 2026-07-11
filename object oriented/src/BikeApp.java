public class BikeApp {
    public static void main(String[] args) {
        Bike b1=new Bike();
        b1.engno=123;
        b1.color="Black";
        b1.brand="Hero";
        b1.start();
        b1.move();
        b1.stop();

        Bike b2= new Bike();
        b2.engno=354;
        b2.color="Blue";
        b2.brand="Honda";
        b2.start();
    }
}
