public class Stack implements OpenList{
    private int s[] = new int [100];
    private int flag;

    public Stack(){
        flag = 0;
    }

    @Override
    public boolean isEmpty(){
        if(flag == 0){
            return true;
        } else{
            return false;
        }
    };

    @Override
    public int pop(){
        flag--;
        int o = s[flag+1];
        return o;
    };

    @Override
    public void push(int u){
        s[++flag] = u;
    };
}