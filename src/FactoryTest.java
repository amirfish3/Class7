public class FactoryTest {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape myCircle = shapeFactory.getShape("CIRCLE");
        myCircle.draw();

        Shape mySquare = shapeFactory.getShape("SQUARE");
        mySquare.draw();
        Shape myLine = shapeFactory.getShape("Line");
        myLine.draw();
    }
}