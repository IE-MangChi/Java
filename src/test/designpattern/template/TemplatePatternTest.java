package designpattern.template;

import designpattern.template.code.Component;
import designpattern.template.code.Logic;
import designpattern.template.code.PrintHi;
import designpattern.template.code.TemplateByParam;
import org.junit.jupiter.api.Test;

public class TemplatePatternTest {

    @Test
    void templatePatternTest() {
        PrintHi printHi = new PrintHi();

        printHi.call();
    }

    @Test
    void templatePatternByParam() {
        Component logic = new Logic();
        TemplateByParam template = new TemplateByParam(logic);

        template.call();
    }
}
