package OOP;

public class Car2 {
    public String model;
    public String color;

    public Car2(String model, String color){
        this.model = model;
        this.color = color;
    }

    public void drive(){
        System.out.println("you drive the " + this.color + " " + this.model);
    }

    @Override
    public String toString() {
        return "Car2{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
