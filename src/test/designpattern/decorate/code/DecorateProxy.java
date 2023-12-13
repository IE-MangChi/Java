package designpattern.decorate.code;

public class DecorateProxy implements Component {

    private Component target;

    public DecorateProxy(Component target) {
        this.target = target;
    }

    @Override
    public String operation() {
        String result = "***" + target.operation() + "***";
        return result;
    }
}
