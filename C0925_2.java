public class C0925_2 {
    public static void main(String[] args) {
        System.out.println("Card.width = " + Card.width);
        // System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);
        // System.out.println("Card.height = " + Card.height);
        Card c1 = new Card();
        // Card c1 = new Card();
        c1.kind = "Heart";
        // c1.kind = "Heart";
        c1.number = 7;
        // c1.number = 7;

        Card c2 = new Card();
        // Card c2 = new Card();
        c2.kind = "Spade";
        // c2.kind = "Spade";
        c2.number = 4;
        // c2.number = 4;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")" );
        System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")" );
        System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");

        c1.width = 70;
        c2.height = 90;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")" );
        System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")" );
    }
}

class Card {
    String kind; // 카드마다의 고유한 특징이 있다면 인스턴스 변수로 설정
    int number;
    static int width = 100; // 공통된 특징은 클래스 변수로 설정, 모든 인스턴스가 공유
    static int height = 250;
}