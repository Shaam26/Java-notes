package in.Kgcoding.Challenge83;

public class Square extends Shape{

    private final double sideInCms;

    public Square(double sideInCms){
        this.sideInCms = sideInCms;
    }

    public double getSizeInCms() {
        return sideInCms;
    }

    @Override
    public double calculateArea(){
        return Math.pow(sideInCms,2);
    }
}
