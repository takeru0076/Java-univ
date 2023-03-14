class SelectionSort implements Strategy{

    @Override
    public void sort(int[] data){
        for (int i=0; i < data.length-1; i++) {
    	    int min = i;
    	        for (int j=i+1; j < data.length; j++) {
    		    if (data[min] > data[j]) {
    		        min = j;
    		    }
    		}
    	    int tmp = data[i];
    	    data[i] = data[min];
    	    data[min] = tmp;
    	}
    };
}