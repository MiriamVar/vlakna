public class Main {
    public static void main(String[] args) {
        Thread v1 = new Thread("v1");
        v1.start();
        Thread v2 = new Thread("v2");
        v2.start();
        Thread v3 = new Thread("v3");
        v3.start();
    }
}
