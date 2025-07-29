public class EnumDemo {

    enum Apple {
        Jonathan(10),RedDel(15),GreenApple(20);

        private int price;

        Apple(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;
        }
    }

    public static void main(String[] args) {
        for (Apple a : Apple.values()) {
            System.out.println(a + " has price: " + a.getPrice());
        }
    }
}
