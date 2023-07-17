plugins {
  kotlin("jvm") version "1.9.0"
  application
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("org.jsoup:jsoup:1.16.1")
  testImplementation("org.hamcrest:hamcrest:2.2")
  testImplementation(kotlin("test"))
}

tasks.test {
  useJUnitPlatform()
}

application {
  mainClass.set("MainKt")
}