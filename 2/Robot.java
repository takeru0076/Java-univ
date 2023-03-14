class Robot {
    private int id;

    Robot(){
        id=0;
    }

    void setId(int str){
        id = str;
    }

    void printId(){
        System.out.println("I am Robot " + id +".");
    }
}