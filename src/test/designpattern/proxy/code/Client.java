package designpattern.proxy.code;

public class Client {

    private Subject subject;

    public Client(Subject subject) {
        this.subject = subject;
    }

    public String call() {
        return subject.operation();
    }
}
