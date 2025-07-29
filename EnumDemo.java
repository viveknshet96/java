public class EnumDemo {

    enum Apple {
        Jonathan(10),RedDel(15),GreenApple(20),Pineapple;

        private int price;
 	
	Apple() {
            this.price = -1; 
        }

        Apple(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;
        }
    }

	static int m(Integer v){
	return v;
	}


    public static void main(String[] args) {
        for (Apple a : Apple.values()) {
            System.out.println(a + " has price: " + a.getPrice());
 	System.out.println(" ordinal: " + a.ordinal());
        }
		Apple myApple = Apple.valueOf("RedDel");
        	System.out.println("valueof " + myApple + " costs " + myApple.getPrice());
	

		Integer iob=100;
		int a=iob;
		System.out.println(iob+" "+a);


		Integer ob = m(500);
		System.out.println(ob);


    }
}
