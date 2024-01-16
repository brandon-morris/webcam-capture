/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("com.github.sarxos.java-conventions")
}

dependencies {
    api(project(":webcam-capture"))
    api(libs.uk.co.caprica.vlcj)
    testImplementation(libs.junit.junit)
    testImplementation(libs.org.easymock.easymock)
    testImplementation(libs.org.powermock.powermock.api.easymock)
    testImplementation(libs.org.powermock.powermock.module.junit4)
    compileOnly(libs.ch.qos.logback.logback.classic)
}

description = "Webcam Capture - Vlcj Driver"
