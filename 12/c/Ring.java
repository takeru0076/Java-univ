import java.util.Scanner;
class Ring {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str_1 = scanner.next();
        String str_2 = scanner.next();
        //System.out.println(str_1);
        //System.out.println(str_2);
        int l = str_1.length();
        int m = str_2.length();
       //System.out.println(l);
        //System.out.println(m);
        int flag =0;
        for(int i=0; i<l; i++){
            String str_3= str_1.substring(0,m);
            if(str_2.equals(str_3)){
                flag = 1;
                System.out.println("Yes");
                break;
            }
            //System.out.println(str_1.substring(2,l));
            str_1 = str_1.substring(1,l) + str_1.substring(0,1);
            //System.out.println(str_1);
        }
        if(flag == 0){
            System.out.println("No");
        }
    }
}