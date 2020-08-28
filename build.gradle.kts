// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
  repositories {
    google()
    jcenter()
  }
  dependencies {
    classpath ("com.android.tools.build:gradle:4.0.1")
    classpath ("com.google.gms:google-services:4.3.3")
    classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}")
  }
}

allprojects {
  repositories {
    google()
    jcenter()
  }
  repositories {
    mavenCentral()
  }
}

tasks.register<Delete>("clean") {
  delete(rootProject.buildDir)
}