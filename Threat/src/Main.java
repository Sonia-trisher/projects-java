public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThreat t1 = new MyThreat();
//        t1.start();
        t1.run();
//        Thread.sleep(3000); // wait a bit
//        t1.interrupt();
        t1.join();
        System.out.println("Main completed");
    }
}
