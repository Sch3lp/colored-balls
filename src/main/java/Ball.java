import java.util.HashMap;

public class Ball {

    private static HashMap<String, Ball> balls = new HashMap<>();
    private String color;

    private Ball(String color) {
        this.color = color;
    }

    public void bounce() {
        System.out.println("boing!");
    }

    public String getColor() {
        return color;
    }

    public static Ball getInstance(String color) {
        balls.computeIfAbsent(color, Ball::new);
        return balls.get(color);
    }
}

