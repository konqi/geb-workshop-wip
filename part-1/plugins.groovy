#!/usr/bin/env groovy

@Grapes([
        @Grab("org.gebish:geb-core:1.1.1"),
        @Grab("org.seleniumhq.selenium:selenium-chrome-driver:3.4.0"),
        @Grab("io.github.bonigarcia:webdrivermanager:1.6.2"),
])


import io.github.bonigarcia.wdm.ChromeDriverManager
import org.openqa.selenium.chrome.ChromeDriver
import geb.Browser

ChromeDriverManager.instance.setup()
Browser browser = new Browser(driver: new ChromeDriver())


browser.with {

    go "http://plugins.grails.org/q/sort%3Adate"

    sleep(3000)

    $("ul.plugins-list > li").each {
        it.find("a.plugin-name").each {
            println it.text()
        }
        it.find("span.plugin-description").each {
            println it.text()
        }
        println ''
        println '---'
        println ''
    }

}

browser.close()