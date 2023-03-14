public class MovingPoint extends Point{
    private int vx;
    private int vy;

    MovingPoint(int a, int b){
        super(a,b);
        this.vx = 0;
        this.vy = 0;
    }

    double getDistance(MovingPoint p){
        double dis=0;
        dis = (super.x - p.x) * (super.x -p.x ) + (super.y - p.y) * (super.y - p.y);
        dis = Math.sqrt(dis);
        return dis;
    }

    void setVelocity(int a, int b){
        this.vx = a;
        this.vy = b;
    }

    void move(){
        super.x += this.vx;
        super.y += this.vy;
    }

    @Override
    void print(){
        super.print();
    }
}