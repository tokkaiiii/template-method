public class Client {
    public static void main(String[] args) {
        PlusFileProcessor plusFileProcessor = new PlusFileProcessor("numbers.txt");
        int result1 = plusFileProcessor.process();
        System.out.println(result1); // 15

        MultiplyFileProcessor multiplyFileProcessor = new MultiplyFileProcessor("numbers.txt");
        int result2 = multiplyFileProcessor.process();
        System.out.println(result2); // 120
    }
}
