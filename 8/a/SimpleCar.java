public class SimpleCar {
    int begin; 
    int finish;
    int kilo;
    int hour;
    double fukl;
    double air;

    SimpleCar(int b,int f, int k, int h,double d,double a){
        this.begin = b;
        this.finish = f;
        this.kilo = k;
        this.hour = h;
        this.fukl = d;
        this.air = a;

    }

    public double getFuelConsumptionOldRegulations(){
        return (double)kilo / fukl;
    };

    public double getFuelConsumptionNewRegulations(){
        return (double)kilo / fukl;
    };
}