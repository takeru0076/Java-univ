class ComputeInitials {
    public static void main(String[] args){
        String[] names = args[0].split(" ");
        String rename_1 = names[0].substring(0,1);
        String rename_2 = names[1].substring(0,1);
        System.out.println("My initials are: " + rename_1 + rename_2);
    }
}