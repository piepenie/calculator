public class CircleCalculator extends Calculator {
    public double calculateCircleArea(double radius) {
        double area = Pi * radius * radius;
        getResults().add(area);
        return area;
    }

}
