public class Main {
    public static void main(String[] args) {
        lowLevelMethod();
    }

    /**
     * The method throwing exception
     */
    private static void lowLevelMethod() {
        int result = 1 / 0;
    }
}
