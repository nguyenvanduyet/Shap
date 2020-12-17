package Shap;

public class Shap {
    private String color = "red";
    private boolean fill = false;

    public Shap() {
    }

    public Shap(String color) {
        this.color = color;
    }

    public Shap(String color, boolean fill) {
        this.color = color;
        this.fill = fill;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    @Override
    public String toString() {
        return "Shap.Shap{" +
                "color='" + color + '\'' +
                ", fill=" + fill +
                '}';
    }
}
