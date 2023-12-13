package designpattern.template.code;

public class Logic implements Component{
    @Override
    public void call() {
        System.out.println("로직");
    }
}
