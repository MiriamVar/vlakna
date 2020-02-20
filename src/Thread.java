import java.util.Random;

public class Thread implements Runnable{

    private java.lang.Thread thread;
    private String name;

    public Thread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("thread "+ this.name +" is running");
        try {
            for(int i = 1; i<=10; i++){
                int time = getTime();
                java.lang.Thread.sleep(time);
                System.out.println( this.name +" "+ i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("thread "+ this.name +" finished");
    }

    public int getTime(){
        Random random = new Random();
        return random.nextInt(3000)+1000;
    }

    public void start(){
        if(thread ==null){
            thread = new java.lang.Thread(this, this.name);
            thread.start();
        }
    }
}
