package square;

public class tesSquare {
    public static void main(String[] args) {
        Square square=new Square(5);
        System.out.println(square);
        square=new Square("yellow",6);
        System.out.println(square);
    }
}
