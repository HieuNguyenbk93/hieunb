package hieunb.ezy.hieunb.test;

import org.youngmonkeys.devtools.pagination.PaginationClassesGenerator;

public class HieunbPaginationClassesGenerator {

    public static void main(String[] args) throws Exception {
        new PaginationClassesGenerator(Object.class)
            .generate();
    }
}
