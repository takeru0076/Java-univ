public class Stack{
    private int flag;
    private int[]s;

    public Stack(int n){
        flag = 0;
        s = new int [n];
    }

    public boolean isEmpty(){
        if(flag == 0){
            return true;
        } else{
            return false;
        }
    };

    public int pop() throws StackUnderflowException{
        if(--flag < 0){
            throw new StackUnderflowException();
        }
        int o = s[flag];
        return o;
    };

    public void push(int u) throws StackOverflowException{
        if(flag == 0){
            s[flag] = u;
            flag++;
            return;
        }
        if(++flag >= s.length){
            throw new StackOverflowException(u);
        }
        s[flag] = u;
    };
}