class Stack {
    private int[] data = new int[100];
    private int top=0;
    
    void push(int x){
        data[top] = x;
        top++;
    }

    int pop(){
        top--;
        int y = data[top];
        return y;
    }
}