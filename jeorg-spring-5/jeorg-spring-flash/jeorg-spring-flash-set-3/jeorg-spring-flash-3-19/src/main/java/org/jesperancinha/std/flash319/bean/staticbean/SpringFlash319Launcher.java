package org.jesperancinha.std.flash319.bean.staticbean;

import org.jesperancinha.std.flash319.bean.staticbean.model.Harvest;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.YELLOW;

@SpringBootApplication
public class SpringFlash319Launcher implements CommandLineRunner {

    private final Harvest harvest1;

    private final Harvest harvest2;

    public SpringFlash319Launcher(Harvest harvest1, Harvest harvest2) {
        this.harvest1 = harvest1;
        this.harvest2 = harvest2;
    }

    public static void main(String[] args) {
        GREEN.printGenericTitleLn("Service is starting");
        SpringApplication.run(SpringFlash319Launcher.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        GREEN.printGenericLn("Service has started!");
        YELLOW.printGenericLn(harvest1);
        YELLOW.printGenericLn(harvest2);
    }
}