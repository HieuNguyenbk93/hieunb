package hieunb.ezy.hieunb.web.test;

import com.tvd12.ezyhttp.server.boot.EzyHttpApplicationBootstrap;
import com.tvd12.ezyhttp.server.core.annotation.ComponentsScan;
import com.tvd12.ezyhttp.server.core.annotation.PropertiesSources;

@PropertiesSources({
    "config.properties",
    "setup.properties"
})
@ComponentsScan({
    "org.youngmonkeys.ezyplatform",
    "hieunb.ezy.hieunb"
})
public class HieunbThemeStartupTest {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello World");
        EzyHttpApplicationBootstrap.start(HieunbThemeStartupTest.class);
    }
}
