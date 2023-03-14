public class SortingMachine{
    /*private int x;
    private int y;
    SortingMachine(int xi,int yi){
        x = xi;
        y = yi;
    }*/

    public void sort(Relatable p[]){

        int length = p.length;
        Relatable tem;

        for(int i=0; i<length-1; i++){
            for(int j=length-1; j>i; j--){
                if(p[j].isSmallerThan(p[j-1])){
                    tem = p[j-1];
                    p[j-1] = p[j];
                    p[j] = tem;
                }
            }
        }
    }

}
