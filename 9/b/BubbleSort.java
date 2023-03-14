class BubbleSort implements Strategy{

    @Override
    public void sort(int[] p){
        int length = p.length;
        int tem;
        for(int i=0; i<length-1; i++){
            for(int j=length-1; j>i; j--){
                if(p[j-1] > p[j]){
                    tem = p[j-1];
                    p[j-1] = p[j];
                    p[j] = tem;
                }
            }
        }
    };
}

/*   for(int i=0; i<length-1; i++){
        for(int j=length-1; j>i; j--){
            if(p[j].isSmallerThan(p[j-1])){
                tem = p[j-1];
                p[j-1] = p[j];
                p[j] = tem;
            }
        }
    }
*/