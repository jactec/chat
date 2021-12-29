// Your First Program

class Print {

    public static void main(String[] args) {
        print1_100();
    }

    private static void print1_100() {
        for(int i=0;i<=100;i=i+2) {  // revised print even numbers from 0-100
            System.out.println(i); 
        }
    }
}