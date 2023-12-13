package designpattern.decorate;

import designpattern.decorate.code.Client;
import designpattern.decorate.code.Component;
import designpattern.decorate.code.DecorateProxy;
import designpattern.decorate.code.Server;
import org.junit.jupiter.api.Test;

public class DecoratePatternTest {

    @Test
    void decoratePatternTest() {
        Component decorateProxy = new DecorateProxy(new Server());
        Client client = new Client(decorateProxy);

        client.call();
    }
}
