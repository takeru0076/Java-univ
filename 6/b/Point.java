public class Point {


    public int x;
    public int y;

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

    public int  getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void move(int dx, int dy){
        x += dx;
        y += dy;
    }
}