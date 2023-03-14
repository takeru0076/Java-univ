class Circle extends Shape{
    protected Point c;
    protected int r;

    public Circle(Point p, int w){
        c = p;
        r = w;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("(" + c.x + ", " + c.y + ") radius =" + r);
    }
    
    @Override
    public void move(int dx, int dy){
        c.x += dx;
        c.y += dy;
    }

}