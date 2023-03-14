class Adder {
    public static void main(String[] args) {
        int l = args.length;
        int sum=0;
        int [] num = new int[l];
        for(int i=0; i<l; i++){
            num[i] = Integer.parseInt(args[i]);
            sum+= num[i];
        }
        System.out.println(sum);
    }
}