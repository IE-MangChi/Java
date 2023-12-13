package designpattern.singleton;

import designpattern.singleton.code.Singleton;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingletonTest {

    @Test
    void singleton() {
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();

        Assertions.assertThat(singleton1).isEqualTo(singleton2);
    }
}
