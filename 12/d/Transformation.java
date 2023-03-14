import java.util.Scanner;
class Transformation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        int num = scanner.nextInt();
        for(int i=0; i<num; i++){
            String s = scanner.next();
            //System.out.println(s);
            if(s.equals("replace")){
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                String c = scanner.next();
                sb.replace(a,b+1,c);
                //System.out.println(a);
                //System.out.println(b);
            } else if(s.equals("reverse")){
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                String c = sb.substring(a,b+1);
                StringBuilder d = new StringBuilder();
                d.append(c);
                c = d.reverse().toString();
                //System.out.println("c=" + c);
                sb.replace(a,b+1,c);



            } else if(s.equals("print")){
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                System.out.println(sb.substring(a,b+1));
            }
        }
    }
}