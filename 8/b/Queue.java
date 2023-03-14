public class Queue implements OpenList{
    private int q[] = new int [16];
    private int head;
    private int tail;


    public Queue(){
        head = 0;
        tail = 0;
    }

    @Override
    public boolean isEmpty(){
        if(head == tail){
            return true;
        } else {
            return false;
        }

    };

    @Override
    public int pop(){
        int p = q[head];
        head = (head + 1) % 16;
        return p;
    };

    @Override
    public void push(int u){
        q[tail] = u;
        tail = (tail + 1) % 16;
    };
}