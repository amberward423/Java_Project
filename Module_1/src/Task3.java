public class Task3 {

    private int id;
    private long startTime;
    private long endTime;
    private static int idTracker;


    public Task3(int id){
        this.id = id;
        this.startTime = System.currentTimeMillis();
    }

    public void setEndTime(){
        this.endTime = System.currentTimeMillis();
    }

    public long getTimeSpent(){
       return endTime - startTime;
    }

    public int getId(){
        return id;
    }

    public long getStartTime(){
        return startTime;
    }

    public long getEndTime(){
        return endTime;
    }


}
