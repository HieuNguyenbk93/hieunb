package hieunb.ezy.hieunb.test;

import org.youngmonkeys.devtools.repository.RepositoryClassesGenerator;

public class HieunbRepositoryClassesGenerator {

    public static void main(String[] args) throws Exception {
        new RepositoryClassesGenerator(Object.class)
            .generate();
    }
}
