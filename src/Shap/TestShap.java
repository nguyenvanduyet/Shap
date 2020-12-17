package Shap;

public class TestShap {
    public static void main(String[] args) {
        Shap shap = new Shap();
        System.out.println(shap.toString());
        shap.setFill(true);
        shap.setColor("blue");
        System.out.println(shap);
        shap = new Shap("black",true);
        System.out.println(shap);
        shap = new Shap("white");
        System.out.println(shap);
    }
}
