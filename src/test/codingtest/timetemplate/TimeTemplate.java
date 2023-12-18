package codingtest.timetemplate;

public abstract class TimeTemplate {

    public void time() {
        long startTime = System.currentTimeMillis();
        logic();
        long endTime = System.currentTimeMillis();
        System.out.printf("걸린 시간: {}", endTime-startTime);
    }

    protected void logic() {}

}
