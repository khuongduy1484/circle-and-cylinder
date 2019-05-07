public class Cylinder extends Circle {
    private double height;
    public Cylinder(){

    } public Cylinder(double height){
        this.height = height;

    }public  Cylinder(double height,double radius,String color){
        super(radius,color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea1(){
        return 2*Math.PI*height;
    }
    public void show(){
        System.out.println(getArea1());
    }

}
