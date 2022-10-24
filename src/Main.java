import com.google.Circle;
import com.google.Square;

public class Main {
    public static void main(String[] args) {
        Circle circle=new Circle(45);
        circle.calculateArea();
        circle.calculatePerimiter();
        System.out.println(circle.calculateArea()+" "+ circle.calculatePerimiter());
        System.out.println("******************************************************************");


        Square square=new Square(24,45);

        System.out.println(square.calculateArea()+" "+square.calculatePerimiter());

    }
}
