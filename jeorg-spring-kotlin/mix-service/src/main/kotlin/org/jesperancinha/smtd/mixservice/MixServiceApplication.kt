package org.jesperancinha.smtd.mixservice

import org.jesperancinha.smtd.mixservice.configuration.AppProperties
import org.jesperancinha.smtd.mixservice.configuration.InventoryProcessor
import org.jesperancinha.smtd.mixservice.configuration.Notification
import org.jesperancinha.smtd.mixservice.configuration.NotificationService
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(AppProperties::class)
class MixServiceApplication(
    private val notificationService: NotificationService,
    private val inventoryProcessor: InventoryProcessor,
    private val properties: AppProperties
) : ApplicationRunner {
    override fun run(args: ApplicationArguments?) {
        notificationService.notifyByEmail()
        notificationService.notifyBySMS()

        process(notificationService.smsNotification)
        process(notificationService.emailNotification)

        inventoryProcessor.performAll()

        println("The binding test should result in the default because of @ConstructorBinding")
        println(properties)
    }

    private fun process(notificationEmail: Notification) {
        when (notificationEmail) {
            is Notification.SMS -> println("SMS")
            is Notification.Email -> println("Email")
        }
    }
}

fun main(args: Array<String>) {
    runApplication<MixServiceApplication>(*args)
}
