package hieunb.ezy.hieunb.web.test;

import org.youngmonkeys.devtools.swagger.SwaggerGenerator;

public class HieunbThemeSwaggerGenerator {

    public static void main(String[] args) throws Exception {
        SwaggerGenerator swaggerGenerator = new SwaggerGenerator(
            "hieunb.ezy.hieunb.web.controller"
        );
        swaggerGenerator.generateToDefaultFile();
    }
}
