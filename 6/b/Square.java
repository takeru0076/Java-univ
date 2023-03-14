class Square extends Shape{
    protected Point[] P;
    public Square(Point p, int w){
        P = new Point[4];
        P = new Point[4];
        P[0] = new Point(p.x,p.y);
        P[1] = new Point(p.x+w,p.y);
        P[2] = new Point(p.x+w,p.y+w);
        P[3] = new Point(p.x, p.y+w);
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