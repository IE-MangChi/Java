package designpattern.proxy;

import designpattern.proxy.code.CacheProxy;
import designpattern.proxy.code.Client;
import designpattern.proxy.code.Server;
import designpattern.proxy.code.Subject;
import org.junit.jupiter.api.Test;

public class ProxyPatternTest {

    @Test
    void proxyPatternTest() {
        // 클라이언트 -> 프록시(접근제어) -> 서버
        Subject proxy = new CacheProxy(new Server());
        Client client = new Client(proxy);

        client.call();
        client.call();
        client.call();
    }

    @Test
    void noProxyPatternTest() {
        // 클라이언트 -> 서버
        Client client = new Client(new Server());

        client.call();
        client.call();
        client.call();
    }
}
