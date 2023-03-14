import java.io.*;
class IOExercise {
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter the number:");
            String str = reader.readLine();
            reader.close();
            double d = Double.parseDouble(str);
            double  d2 = Math.sqrt(d);
            System.out.println("Square root of " + d + " is " + d2);
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("number.data"));
            dos.writeDouble(d2);
            dos.close();
            System.out.println("The square root value " + d2 + " is written to the file \"number.data\".");
            DataInputStream dis = new DataInputStream(new FileInputStream("number.data"));
            double d3 = dis.readDouble();
            System.out.println("The value read from the file \"number.data\" is " + d3);
            double d4 = Math.pow(d3,2);
            System.out.println("Square of " + d3 + " is " + d4);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}