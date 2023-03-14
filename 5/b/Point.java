public class Point {
    private int x;
    private int y;

    Point(int a,int b){
        this.x = a;
        this.y = b;
    }

    double getDistance(Point p){
        double dis=0;
        dis = (this.x - p.x) * (this.x - p.x ) + (this.y - p.y) * (this.y - p.y);
        dis = Math.sqrt(dis);
        return dis;
    }

    void print(){
        System.out.println("(" + this.x + ", " + this.y + ")");
    }
}