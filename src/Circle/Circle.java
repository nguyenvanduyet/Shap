package Circle;

import Shap.Shap;

public class Circle extends Shap {
    private double ridius = 2000000000;

    public Circle(double ridius) {
        this.ridius = ridius;
    }

    public Circle(String color, double ridius) {
        super(color);
        this.ridius = ridius;
    }

    public Circle(String color, boolean fill, double ridius) {
        super(color, fill);
        this.ridius = ridius;
    }

    public Circle() {
    }

    public double getRidius() {
        return ridius;
    }

    public void setRidius(double ridius) {
        this.ridius = ridius;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "ridius=" + ridius +" " +
                '}';
    }
}
