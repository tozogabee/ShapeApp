package shapes;

public class Square extends Quadrilateral {

    public Square(int a){
        super(a);
    }



    @Override
    public double calculateArea() {
        return Math.pow(this.getA(),2);
    }

    @Override
    public double calculateCircumReference() {
        return 4*this.getA();
    }

    @Override
    public void printShape() {

    }

    @Override
    public String toString() {
        return "Square{" +"\n"+
                "The \"a\" side - " +this.getA()+"\nThe area - "+this.calculateArea()+
                "\nThe circum - "+this.calculateCircumReference()+"\n"+
                "}";
    }
}
