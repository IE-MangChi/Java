package designpattern.template.code;

public abstract class AbstractTemplate {

    public void call() {
        System.out.println("템플릿 머리");
        logic();
        System.out.println("템플릿 꼬리");
    }

    protected void logic() {};
}
