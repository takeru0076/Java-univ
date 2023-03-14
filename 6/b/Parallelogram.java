class Parallelogram extends Shape{
    protected Point[]P;

    public Parallelogram(Point p1, Point p2, int w){
        P = new Point[4];
        P[0] = new Point(p1.x,p1.y);
        P[1] = new Point(p1.x+w,p1.y);
        P[2] = new Point(p2.x,p2.y);
        P[3] = new Point(p2.x-w, p2.y);
    }
    
    @Override
    public void print(){
    super.print();
    for ( int i = 0; i < 4; i++ ) {
        if ( i > 0 ) System.out.print("-"); 
        System.out.print("(" + P[i].getX() + ", " + P[i].getY() + ")");
    }
    System.out.println();
    }

    @Override
    public void move(int dx, int dy){
    for ( int i = 0; i < 4; i++ ) P[i].move(dx, dy);
    }
}