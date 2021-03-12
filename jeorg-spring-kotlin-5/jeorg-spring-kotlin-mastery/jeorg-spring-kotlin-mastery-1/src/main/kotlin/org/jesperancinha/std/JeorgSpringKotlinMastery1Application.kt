package org.jesperancinha.std

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JeorgSpringKotlinMastery1Application : CommandLineRunner {
	override fun run(vararg args: String?) {
		ConsolerizerComposer.out(" ")
			.ln()
			.blue("We can depend on other classes")
			.brightBlue("So instead of writing implements all the time")
			.green("We just write colon!")
			.toConsoleLn();
	}
}

fun main(args: Array<String>) {
    ConsolerizerComposer.out(" ")
        .ln()
        .brightMagenta("Welcome to Kotlin!")
        .yellow("This is the first module to understand the basics")
		.toConsoleLn();

    runApplication<JeorgSpringKotlinMastery1Application>(*args)
}
