class StackUnderflowException extends Exception{
    StackUnderflowException(){
        super("Underflow. There is no element in the stack.");
    }
}