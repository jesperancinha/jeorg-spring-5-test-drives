package org.jesperancinha.std.flash25.jpa.operators.service;

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer;
import org.jesperancinha.std.flash25.jpa.operators.repos.BeanRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import static org.assertj.core.api.Assertions.assertThat;
import static org.jesperancinha.console.consolerizer.console.ConsolerizerComposer.title;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource("classpath:beans.properties")
class BeanServiceImplRandomPortSpringBootTest {

    @MockitoBean
    private BeanRepository beanRepository;

    @Autowired
    private BeanServiceImpl beanService;

    @Value("${spring.datasource.url}")
    private String dataSourceUrl;

    @LocalServerPort
    private Long port;

    @Autowired
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    public void setup() {
        applicationContext.start();
    }

    @Test
    void tesGetSlogan_whenCalled_getProductionSlogan() {
        assertThat(beanService.getSlogan()).isEqualTo("This is just a slogan");
        assertThat(dataSourceUrl).isEqualTo("jdbc:h2:file:~/flash25db");

        ConsolerizerComposer.outSpace()
                .green(title(applicationContext.getClass()))
                .reset();

        ConsolerizerComposer
                .outSpace()
                .cyan("Server port is %d", port)
                .reset();
    }
}