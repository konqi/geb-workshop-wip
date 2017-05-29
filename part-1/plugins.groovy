#!/usr/bin/env groovy

@Grapes([
        @Grab("org.gebish:geb-core:1.1.1"),
        @Grab("org.seleniumhq.selenium:selenium-firefox-driver:3.4.0"),
        @Grab("io.github.bonigarcia:webdrivermanager:1.6.2"),
])


import io.github.bonigarcia.wdm.FirefoxDriverManager
import org.openqa.selenium.firefox.FirefoxDriver
import geb.Browser

FirefoxDriverManager.instance.setup()
Browser browser = new Browser(driver: new FirefoxDriver())


browser.with {

    go "http://plugins.grails.org/q/sort%3Adate"

    sleep(3000)

 
}

browser.close()