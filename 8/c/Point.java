public class Point {
    private int x;
    private int y;

    public Point(int x_i, int y_i){
        this.x = x_i;
        this.y = y_i;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void print(){
        System.out.println("(" + this.x +", " + this.y +")");
    }
}