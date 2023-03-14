class Sphere{
    private double r = 0.0;

    Sphere(double s){
        r = s;
    }

    double getHeightOfContactPoint(Sphere secondSphere){
        //double s1_r = r;
        double d2 = secondSphere.r - r;

        double d1 = r * d2 / (secondSphere.r + r);
        return  d1 + r;
    }
}


