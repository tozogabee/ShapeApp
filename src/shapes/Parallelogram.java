package shapes;

public class Parallelogram extends Quadrilateral {

    private int talling;

    public Parallelogram(int a,int b,int talling){
        super(a,b);
        this.talling = talling;
    }

    @Override
    public double calculateArea() {
        return this.getA()*this.talling;
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
        return "Parallelogram{" +
                "talling=" + talling +"\nThe \"a\" side - "+this.getA()+"\nThe \"b\" side - "+this.getB()
                +"\nThe area - "+this.calculateArea()+"\nThe circum - "+this.calculateCircumReference()+"\n"+
                '}';
    }
}
