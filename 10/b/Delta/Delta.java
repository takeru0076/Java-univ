package Delta;
import Alpha.Alpha;
import Alpha.Gamma;
import Beta.Beta;
public class Delta{
 Alpha alpha = new Alpha();
 Beta beta = new Beta();
 Gamma gamma = new Gamma();
 public Delta(){
 alpha.show(gamma);
 beta.show(gamma);
 gamma.show(alpha);
 }

 public static void main(String[] args){
 new Delta();
 }
}