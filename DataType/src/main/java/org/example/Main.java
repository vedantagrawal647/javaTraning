
class CustomException extends Exception {

    public CustomException(String message) {
        super(message);
    }
}

public class Main{

    public void checkValue(int value) throws CustomException {
        if (value < 0) {
            throw new CustomException("Value cannot be negative");
        }
    }

    public static void main(String[] args) {
        Main obj = new Main();
        try {
            obj.checkValue(-5);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
