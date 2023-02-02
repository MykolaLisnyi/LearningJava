package Module7;

public class Exercise3 {
    public static void main(String[] args) {
        Object object = null;
//        System.out.println(object.toString());

        try {
            System.out.println(object.toString());
        } catch (NullPointerException e) {
            System.out.println("I can catch NPE!!!");
        }
    }
}
