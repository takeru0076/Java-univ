public class Rectangle implements Relatable{
    private Point p1;
    private Point p3;

    Rectangle(Point p1_i, Point p3_i){
        p1 = p1_i;
        p3 = p3_i;
    }

    public int getArea(){
        return p3.getX() * p3.getY();
    }

    @Override
    public boolean isSmallerThan(Relatable other){
        Rectangle sepa = (Rectangle)other;
       if(this.getArea() < sepa.getArea()) {
            return true;
       } else if(this.getArea()  < sepa.getArea()){
           return true;
       } else {
           return false;
       }
    };
}