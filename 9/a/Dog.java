class Dog extends Animal {
    private static int c;
    public Dog() {
        c=0;
    };

    @Override
    public void noise() {
        System.out.println("Woof");
        increment();
    }

    public  static void increment() { c++; }
    public  static int getCount() { return c; }
}