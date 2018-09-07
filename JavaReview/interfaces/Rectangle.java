public class Rectangle implements Shape{

    private double length;
    private double witdh;

    public Rectangle(double length, double width){
        //this : implicicit argument
        this.length = length;
        this.witdh = width;
    }

    public double area(){
        return length*witdh;
    }

    public double getLength(){
        return this.length;
    }

    public String toString(){
        return "L: " + length + " --- W: " + witdh;
    }

    public double getWidth(){
        return this.witdh;
    }
}