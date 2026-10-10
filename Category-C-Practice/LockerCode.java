public class LockerCode {
    private final int lockerNumber;
    private String combination;

    public LockerCode(int lockerNumber, String initialCode) {
        this.lockerNumber = lockerNumber;
        this.combination = initialCode;
    }

    public boolean changeCode(String currentCode, String newCode) {
        if (combination.equals(currentCode)) {
            combination = newCode;
            return true;
        }
        return false;
    }

    public int getLockerNumber() {
        return lockerNumber;
    }

    public static void main(String[] args) {
        LockerCode locker = new LockerCode(101, "1234");
        System.out.println("First change successful: " + locker.changeCode("1234", "5678"));
        System.out.println("Second change successful: " + locker.changeCode("0000", "9999"));
    }
}
