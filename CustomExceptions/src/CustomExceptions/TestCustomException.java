package CustomExceptions;

public class TestCustomException {

    public static void validateVoter (int age) throws AgeNotValidException {
        if(age < 18) {
            throw new AgeNotValidException("minor < 18");
        }
        System.out.println("senior");
    }

    public static void main(String[] args) {
        try {
            validateVoter(22);
        } catch(AgeNotValidException anve) {
            System.out.println(anve.getMessage());
        }

    }
}
