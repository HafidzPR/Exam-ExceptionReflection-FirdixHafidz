package invalidage;

public class Main {
    public void validateAge(int age) throws InvalidAge {
        if (age < 18) {
            throw new InvalidAge("Age must be 18 or older.");
        }
    }
}