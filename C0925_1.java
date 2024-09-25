class C0925_1 {
//    public static void main(String[] args) {
//        Tv t;
//        t = new Tv();
//        t.channel = 7;
//        t.channelDown();
//        System.out.print("현재 채널은 " + t.channel + "번 입니다.");
//    }
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.print("Tv1의 채널은" + t1.channel + "입니다.\n");
        System.out.print("Tv2의 채널은" + t2.channel + "입니다.\n");

        t1.channel = 7;
        System.out.print("Tv1의 채널을" + t1.channel + "로 변경했습니다.\n");
        t2.channel = 8;
        System.out.print("Tv2의 채널을" + t2.channel + "로 변경했습니다.\n");

        System.out.print("Tv1의 채널은" + t1.channel + "입니다.\n");
        System.out.print("Tv2의 채널은" + t2.channel + "입니다.\n");
    }
}

class Tv {
    String color;
    boolean power;
    int channel;

    void power() { power = !power; } // void(반환값이 없는 메서드), power가 true이면 !power는 false,
                                     // power가 true이면 false로 바꾸라는 뜻
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
}