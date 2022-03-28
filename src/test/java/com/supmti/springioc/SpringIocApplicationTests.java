package com.supmti.springioc;

import com.supmti.springioc.springfacture.FacturationService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringIocApplicationTests {

    @Autowired
    FacturationService facturationService;
    @Test
    void contextLoads() {
        System.out.println(facturationService.cacluleMontantTTC(110));
    }

}
