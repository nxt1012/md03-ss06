package ra.bt3;

public class StopWatch {
    private long startTime, endTime;
    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }
    public void start(){
        this.startTime = System.currentTimeMillis();
    }
    public void stop(){
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return this.endTime - this.startTime;
    }

}

