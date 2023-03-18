public class Circle implements Area{
    private final double radius;
    private final double CONST_P = 3.14;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculate() {
        return CONST_P * Math.pow(radius, 2);
    }
}
