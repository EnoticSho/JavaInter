public class Main {
    public static void main(String[] args) {
        Area[] areas = new Area[]{new Circle(5), new Square(5), new Triangle(5, 2, 5)};
        for (Area area : areas) {
            System.out.println(area.calculate());
        }
    }
}