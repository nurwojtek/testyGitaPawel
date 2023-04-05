public class Car {
    String marka;
    String model;
    int rok;

    public Car(String marka, String model, int rok) {
        this.marka = marka;
        this.model = model;
        this.rok = rok;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", rok=" + rok +
                '}';
    }
}
