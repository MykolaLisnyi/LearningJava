package Module7;

public class Exercise2 {
    public static void main(String[] args) {
        try {
            throw new MyFirstDefinedException("\nException! Exception!! Exception!!!");
        } catch (MyFirstDefinedException e){
            System.out.println(e.getMessage());
        }
    }
}


class MyFirstDefinedException extends Exception {
    private final String MSG;

    public MyFirstDefinedException(String MSG) {
        this.MSG = MSG;
    }

    @Override
    public String getMessage() {
        return MSG;
    }
}
