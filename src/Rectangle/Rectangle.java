package Rectangle;

import Shap.Shap;

public class Rectangle extends Shap {
    private float width = 12;
    private float length = 10.3f;
    public Rectangle() {

    }

    public Rectangle(float width) {
    }

    public Rectangle(float width, float length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, float width, float length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean fill, float width, float length) {
        super(color, fill);
        this.width = width;
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }
    public float getArea(){
        return length*width;
    }
    public float getPerimeter(){
        return this.length*2+this.width*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length + ", A = " + getArea() + ", P =" + getPerimeter() +
                '}';
    }
}
