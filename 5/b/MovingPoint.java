public class MovingPoint{
    private int x;
    private int y;
    private int vx;
    private int vy;

    MovingPoint(int a, int b){
        this.x = a;
        this.y = b;
        this.vx = 0;
        this.vy = 0;
    }

    double getDistance(MovingPoint p){
        double dis=0;
        dis = (this.x - p.x) * (this.x -p.x ) + (this.y - p.y) * (this.y - p.y);
        dis = Math.sqrt(dis);
        return dis;
    }

    void setVelocity(int a, int b){
        this.vx = a;
        this.vy = b;
    }

    void move(){
        this.x += this.vx;
        this.y += this.vy;
    }

    void print(){
        System.out.println("(" + this.x + ", " + this.y + ")");
    }
}