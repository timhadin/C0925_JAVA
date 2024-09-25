interface Shape {
    double area(); // 도형의 면적을 반환하는 메서드
    double perimeter(); // 도형의 둘레를 반환하는 메서드
}

class Circle implements Shape {
    private double radius; // 원의 반지름을 저장

    public Circle(double radius) { // 원의 반지름을 매개변수로 받아 초기화
        this.radius = radius;
    }

    public double area() { // 원의 면적을 반환. 공식은 파이 * 반지름^2
        return Math.PI * radius * radius; // PI(파이) * radius(반지름) * radius(반지름)
    }

    public double perimeter() { // 원의 둘레를 반환.
        return 2 * Math.PI * radius; // 2 * PI(파이) * radius(반지름)
    }
}

class Rectangle implements Shape { // Shape 인터페이스를 구현하며, 직사각형의 면적과 둘레를 계산
    private double width; // 직사각형의 너비
    private double height; // 직사각형의 높이

    public Rectangle(double width, double height) {
        this.width = width; // 위의 private double width(인스턴스 변수)와
                            // width(객체의 인스턴스 변수)를 구분하기위해 this를 사용함
        this.height = height;
    }

    public double area() {
        return width * height; // 직사각형의 면적 반환(가로 * 세로)
    }

    public double perimeter() {
        return 2 * (width + height); // 직사각형의 둘레 반환(2 * (가로 + 세로))
    }
}

public class C0925_GPT {
    public static void main(String[] args) {
        Shape circle = new Circle(5); // 반지름이 5인 Circle 객체 생성
        Shape rectangle = new Rectangle(4, 6); // 가로 4, 세로 6의 직사각형 객체 생성

        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
    }
}