import java.util.Scanner;
class Fahrenheit{
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in); // A reference to a Scanner object
 int F = sc.nextInt(); // read an integer from the std. input
 // you code
 double c;
 c = (5.0/9.0) * (F - 32.0);

 if(c == 25.0){
     System.out.println(c);
 } else{
     System.out.printf("%.4f\n",c);
}
}
}