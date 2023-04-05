public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int ileRazy = 4;
        for (int i = 0; i < ileRazy; i++) {
            System.out.println("*");
        }
        Car car = new Car("Volvo" , "V70" , 2000);
        System.out.println(car.toString());
    }
}