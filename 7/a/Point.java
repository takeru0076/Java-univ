public class Point implements Relatable{
     private int x;
     private int y;

     public Point(int xi, int yi){
         x = xi;
         y = yi;
     }

     public int getX(){
         return this.x;
     }

     public int getY(){
         return this.y;
     }

     @Override
     public boolean isSmallerThan(Relatable other){
         Point sepa = (Point)other;
         if(this.x < sepa.getX()) {
              return true;
         }
         if(this.x == sepa.getX()){
             if(this.y  < sepa.getY()){
                 return true;
              }
          }
          return false;
      }
}