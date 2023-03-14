class TestCastApplication {
    public static void main(String[] args){
        MovingPoint m1 = new MovingPoint(0,0);
        MovingPoint o1 = m1;

        MovingPoint m2 = new MovingPoint(3,4);
        Point o2 = m2;

        MovingPoint o3 = (MovingPoint)o2;

        System.out.println("(" + o1.x + ", " + o1.y + ")");
        System.out.println("(" + o2.x + ", " + o2.y + ")");
        System.out.println("(" + o3.x + ", " + o3.y + ")");

        double dis;
        dis = (o1.x - o2.x) * (o1.x - o2.x ) + (o1.y - o2.y) * (o1.y - o2.y);
        dis = Math.sqrt(dis);
        System.out.println(dis);

        dis = (o3.x - o2.x) * (o3.x - o2.x ) + (o3.y - o2.y) * (o3.y - o2.y);
        dis = Math.sqrt(dis);
        System.out.println(dis);
    }
}

