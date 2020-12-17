package square;

import Rectangle.Rectangle;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(float a) {
        super(a,a);
    }

    public Square(String color, float width) {
        super(color, width, width);
    }

    public Square(String color, boolean fill, float width) {
        super(color, fill, width, width);
    }
    public float getA(){
        return getWidth();
    }
    public void setA(float a){
        setWidth(a);
        setLength(a);
    }
    @Override
    public String toString() {
        return "square{"+" " + getA()+" "+ super.toString()+"}";
    }
}
