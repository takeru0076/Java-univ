class TwirlingRobot {
    private int id;
    private int x;
    private int y;
    private int dir;

    TwirlingRobot(){
       id =0;
       x = 0;
       y = 0;
       dir = 0;
    }

    void setId(int str){
        id = str;
    }

    void initialize(int a,int b,int c){
        x = a;
        y = b;
        dir = c;
    }

    void turnLeft(){
        if(dir == 0){
            dir = 3;
        } else {
            dir--;
        }
    }

    void turnRight(){
        if(dir == 3){
            dir = 0;
        } else {
            dir++;
        }
    }

    void move(){
        if(dir == 0){
            y--;
        } else if(dir == 1){
            x++;
        } else if(dir == 2){
            y++;
        } else {
            x--;
        }
    }

    void printLocation(){
        System.out.println("Robot " + id +" is at (" + x + ", " + y +").");
    }
}