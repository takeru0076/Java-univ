import java.io.*;
class ReverseString {
    public static void main(String[] args){
        File file = new File("input.txt");
        int ch;
        String str = "";
        try{
            FileInputStream fin = new FileInputStream(file);
            while((ch = fin.read()) != -1){
                 str += (char)ch;
            }
            fin.close();
        } catch(FileNotFoundException e){
            System.out.println("File " + file.getAbsolutePath() + " could not be found on filesystem");
        } catch(IOException ioe){
            System.out.println("Exception while reading the file" + ioe);
        }

        StringBuilder strb = new StringBuilder(str);
        str = strb.reverse().toString();

        byte b[] = str.getBytes();
        try{
            FileOutputStream fout = new FileOutputStream("output.txt");
            fout.write(b);
            fout.close();
        } catch(Exception e){
            System.out.println(e);
        }
    }
}