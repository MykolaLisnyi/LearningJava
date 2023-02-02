package Module7;

public class Exercise4 {
    public static void main(String[] args) {
        try {
            new A().f();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


class A {
    public void f() throws MySecondDefinedException {
        try {
            g();
        } catch (MyFirstDefinedException e) {
            throw new MySecondDefinedException("Second defined exception in the method \"f\"");
        }
    }

    public void g() throws MyFirstDefinedException {
        throw new MyFirstDefinedException("First defined exception in the method \"g\"");
    }
}


class MySecondDefinedException extends Exception {
    private final String MSG;

    public MySecondDefinedException(String MSG) {
        this.MSG = MSG;
    }

    @Override
    public String getMessage() {
        return MSG;
    }
}