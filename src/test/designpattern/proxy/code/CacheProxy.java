package designpattern.proxy.code;

public class CacheProxy implements Subject{

    private Subject target;
    private String cache;

    public CacheProxy(Subject target) {
        this.target = target;
    }

    @Override
    public String operation() {
        if (cache == null) {
            cache = target.operation();
        }
        return cache;
    }
}
