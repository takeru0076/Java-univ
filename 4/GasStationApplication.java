import java.util.Scanner;

class GasStationApplication{
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        //Scanner m = new Scanner(System.in);

        int lane_sum = n.nextInt();
        int inst_num = n.nextInt();
        //System.out.println(inst_num); System.out.println(lane_sum);
        int ch = 0,min=100000,least=0;

        GasStation[] car = new GasStation[inst_num];
        int [] lane_total = new int[lane_sum+1];

        //System.out.println(inst_num); System.out.println(lane_sum);
        for(int i=0; i<inst_num; i++){
            Scanner k = new Scanner(System.in);
            //Scanner u = new Scanner(System.in);
            int sepa = k.nextInt(); //1 or 0
            int number_plate = k.nextInt(); //number or 2and1
            for(int j=0; j<lane_sum+1; j++){
                lane_total[j] = 0;
            }
            min = 100000;
            least = 0;
            
            if(sepa == 1){
                if(ch == 0){
                    car[0] = new GasStation(number_plate,1);
                    ch++;

                    //System.out.println(car[ch-1].lane);
                } else{
                    for(int j=0; j<ch; j++){
                        if(car[j].lane == 1){
                            lane_total[1]++;
                        }
                        if(car[j].lane == 2){
                            lane_total[2]++;
                        }
                    }
                    for(int j=1; j<lane_sum+1; j++){
                        if(lane_total[j] < min){
                            min = lane_total[j];
                            least = j;
                        }
                    }
                    //System.out.println("num="+ number_plate+ "lea" + least);
                    car[ch] = new GasStation(number_plate,least);
                    ch++;
                    //System.out.println(car[ch-1].lane);
                }
            } else {
                for(int j=0; j<=ch; j++){
                    if(car[j].lane == number_plate && car[j].exsi == 1){
                        car[j].exsi = 0;
                        System.out.println(car[j].car_num);
                        ch--;
                        break;
                    }
                }
            }
        }
    }
}
