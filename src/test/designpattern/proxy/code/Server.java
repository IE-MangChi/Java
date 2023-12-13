package designpattern.proxy.code;

public class Server implements Subject{

    @Override
    public String operation() {
        System.out.println("서버 호출");
        sleep(1000);

        return "ok";
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
