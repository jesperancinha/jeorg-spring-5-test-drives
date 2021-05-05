package org.jesperancinha.std.flash25.jpa.operators.service;

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer;
import org.jesperancinha.std.flash25.jpa.operators.repos.BeanRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.TestPropertySource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.jesperancinha.console.consolerizer.console.ConsolerizerComposer.title;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@MockBean(BeanRepository.class)
@TestPropertySource("classpath:beans.properties")
class BeanServiceImplNoneSpringBootTest {

    @Autowired
    private BeanServiceImpl beanService;

    @Value("${spring.datasource.url}")
    private String dataSourceUrl;

    @Autowired
    private ApplicationContext applicationContext;

//    @LocalServerPort
//    private Long port;

    @Test
    void tesGetSlogan_whenCalled_getProductionSlogan() {
        assertThat(beanService.getSlogan()).isEqualTo("This is just a slogan");
        assertThat(dataSourceUrl).isEqualTo("jdbc:h2:file:~/flash25db");

        ConsolerizerComposer.outSpace()
                .green(title(applicationContext.getClass()))
                .reset();

        ConsolerizerComposer
                .outSpace()
                .cyan("We cannot inject Port with NONE")
                .green("We run without any web environment")
                .reset();

    }
}