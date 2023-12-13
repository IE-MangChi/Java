package designpattern.template.code;

public class PrintHi extends AbstractTemplate {

    @Override
    protected void logic() {
        System.out.println("안녕하세요");
    }
}
