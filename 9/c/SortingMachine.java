class SortingMachine implements Strategy{
        protected Strategy strategy;
    
        public SortingMachine(Strategy s){ strategy = s; }
    
        public void setStrategy(Strategy s){ strategy = s; }
    
        @Override
        public void sort(int[] data){
            System.out.println(strategy.getClass().getName());
            strategy.sort(data);
            System.out.println();
        }
}