class StackOverflowException extends Exception{
    StackOverflowException(int n){
        super("Overflow. " +n+ " can not be pushed.");
    }
}