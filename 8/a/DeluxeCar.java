public class DeluxeCar extends AdvancedCar{

    DeluxeCar(int b,int f, int k, int h,double d,double a){
        super(b,f,k,h,d,a);
    }

    @Override
    public double getFuelConsumptionOldRegulations(){
        double total=0;
        total = (super.finish - super.begin) / super.air + super.kilo / super.fukl;
        return total;
    }

    @Override
    public double getFuelConsumptionNewRegulations(){
        double total=0;
        total =  super.hour / super.air + super.kilo / super.fukl;
        return total;
    }
}