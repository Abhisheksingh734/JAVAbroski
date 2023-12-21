import java.util.ArrayList;

public class ArrayLIst {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<>();

        food.add("Pizza");
        food.add("Hamburger");
        food.add("hotdog");
        food.set(0, "Sushi");
        for(String x:food){
            System.out.println(x);
        }

     }
}
