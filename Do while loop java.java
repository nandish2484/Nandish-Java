public class BlockTest {
    public static void main(String args[]) {
        int x, y;
        y = 20;
        x = 0;
        do {
            System.out.println("This is x " + x);
            System.out.println("This is y " + y);
            y = y - 2;
            x++;
        } while (x < 10);
    }
}