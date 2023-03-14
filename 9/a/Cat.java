class Cat extends Animal {
    private static int c;
    public Cat() {
        c=0;
    };

    @Override
    public void noise() {
        System.out.println("Meow");
        increment();
    }

    public  static void increment() { c++; }
    public  static int getCount() { return c; }
}