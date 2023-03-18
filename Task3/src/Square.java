public class Square implements Area{
    private final double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculate() {
        return sideLength * sideLength;
    }
}
