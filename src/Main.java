public class Main {
    public static void main(String[] args) {

        //A
        boolean result = !(!(!(false ^ false) || (true && true)));
        System.out.println("A: "+ result);

        int x = 3;
        int y = 2;
        boolean result1 = !((x * y) <= 6) && (x - y != 1);
        System.out.printf("B: "+ result1);
    }
}