package designpattern.decorate.code;

public class Client {

    private Component component;

    public Client(Component component) {
        this.component = component;
    }

    public void call() {
        System.out.println(component.operation());
    }
}
