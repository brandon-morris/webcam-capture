/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("com.github.sarxos.java-conventions")
}

dependencies {
    api(project(":webcam-capture"))
    api(libs.org.openimaj.core.video.capture)
}

description = "Webcam Capture - OpenIMAJ Driver"
