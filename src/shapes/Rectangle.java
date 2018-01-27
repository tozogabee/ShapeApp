package shapes;

public class Rectangle extends Quadrilateral {

    public Rectangle(int a,int b){
        super(a,b);
    }

    @Override
    public double calculateArea() {
        return this.getA()*this.getB();
    }

    @Override
    public double calculateCircumReference() {
        return 2*(this.getA()+this.getB());
    }

    @Override
    public void printShape() {

    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "The \"a\" side - " +this.getA()+"\nThe \"b\" side - "+ this.getB()
                +"\n"+"The are - "+this.calculateArea()+"\n"
                +"The circum - "+this.calculateCircumReference()+"}";
    }
}
