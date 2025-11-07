package hieunb.ezy.hieunb.admin.test;

import org.youngmonkeys.devtools.swagger.SwaggerGenerator;

public class HieunbAdminPluginSwaggerGenerator {

    public static void main(String[] args) throws Exception {
        SwaggerGenerator swaggerGenerator = new SwaggerGenerator(
            "hieunb.ezy.hieunb.admin.controller"
        );
        swaggerGenerator.generateToDefaultFile();
    }
}
