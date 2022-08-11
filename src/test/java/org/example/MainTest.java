package org.example;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class MainTest {

    @Test
    void contextLoads() {
    }

    @Test
    void testSuccess() {
        assertThat("String").isEqualTo("String");
    }

    @Test
    void testFails() {
        assertThat("String").isEqualTo("A");
    }
}
