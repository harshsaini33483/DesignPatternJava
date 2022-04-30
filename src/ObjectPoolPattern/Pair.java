package ObjectPoolPattern;

public class Pair {

    Thread thread;
    String jobName;

    public Pair(Thread thread, String name) {
        this.thread = thread;
        this.jobName = name;
    }

    public void setName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobName() {
        return jobName;
    }

    public Thread getThread() {
        return thread;
    }
}
