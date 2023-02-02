package Module7;

public class Exercise1 {
    public static void main(String[] args) {
        try {
            throw new NullPointerException("Try to catch if you can");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally, the block \"finally\"");
        }
    }
}
