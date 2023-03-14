class Point {
    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public boolean equals(Point p){
        if(getClass() == p.getClass()){
            return true;
        } else {
            return false;
        }
    }
}