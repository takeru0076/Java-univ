class AdvancedSortingMachine extends SortingMachine{
    AdvancedSortingMachine(Strategy s){
        super(s);
    }

    @Override
    public void setStrategy(Strategy s){ strategy = s; }
    
    @Override
    public void sort(int[] data){
        System.out.println(strategy.getClass().getName());
        long b = System.currentTimeMillis();
        strategy.sort(data);
        long a = System.currentTimeMillis();
        System.out.println("time: " + (a-b) + " msec");
    }
}