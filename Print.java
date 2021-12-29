// Your First Program

class Print {

    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(1); 
        System.out.println(2);
        System.out.println(3);
        System.out.println(5);
        // print1_100();
    }

    private static void print1_100() {
        for(int i=1;i<=100;i=i+2) {  // revised print even numbers from 0-100
            System.out.println(i); 
        }
    }
}