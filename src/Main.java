public class Main {
    /**
    * The main method
    */
    public static void main(String[] args) {
        System.out.println("The programm started");
        lowLevelMethod();
    }

    /**
     * The method throwing exception
     */
    private static void lowLevelMethod() {
        int result = 1 / 0;
    }
}
