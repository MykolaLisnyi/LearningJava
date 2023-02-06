package Module7;

public class Exercise5 {
    
    public static void main(String[] args) {
        
        try {
            new B().throwThreeExceptions();
        } catch (MyThirdDefinedException | MyFourthDefinedException | MyFifthDefinedException e){
            System.out.printf("%nI've caught %s%n", e.getClass().getName());
        }
    }
}

class B {
    
    public void throwThreeExceptions() throws MyThirdDefinedException, MyFourthDefinedException, MyFifthDefinedException {
        
        switch ((int)(Math.random() * 3)) {
            case 0 -> throw new MyThirdDefinedException();
            case 1 -> throw new MyFourthDefinedException();
            case 2 -> throw new MyFifthDefinedException();
        }
    }
}

class MyThirdDefinedException extends Exception {}

class MyFourthDefinedException extends Exception {}

class MyFifthDefinedException extends Exception {}
