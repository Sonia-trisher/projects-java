public class MyThreat  extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println("sonia "+ i);
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                System.out.println("mythreat interrupted");
            }
        }

    }
}
