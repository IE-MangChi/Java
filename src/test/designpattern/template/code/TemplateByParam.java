package designpattern.template.code;

public class TemplateByParam {

    private Component component;

    public TemplateByParam(Component component) {
        this.component = component;
    }

    public void call() {
        System.out.println("템플릿 머리");
        component.call();
        System.out.println("템플릿 꼬리");
    }
}
