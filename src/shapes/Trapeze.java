package shapes;

public class Trapeze extends Quadrilateral {

    private int m;

    public Trapeze(int a,int b,int c,int d,int m){
        super(a,b,c,d);
        this.m = m;
    }

    @Override
    public double calculateArea() {
        return ((this.getA()+this.getC())/2)*this.m;
    }

    @Override
    public double calculateCircumReference() {
        return this.getA()+this.getB()+this.getC()+this.getD();
    }

    @Override
    public void printShape() {

    }
}
