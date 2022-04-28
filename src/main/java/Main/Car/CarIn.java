package Main.Car;

public class CarIn {
    private String carname;
    private String color;
    private String regnumber;
    private int price;
    public CarIn() {

    }
    public CarIn(String carname, String color, String regnumber, int price) {
        this.carname=carname;
        this.color=color;
        this.regnumber=regnumber;
        this.price=price;
    }


    public String toString() {
        return "\n\tName :"+this.carname+"\n\n\tColor :"+this.color+"\n\n\tPlate :"+this.regnumber+"\n\n\tPrice :"+this.price;
    }
}