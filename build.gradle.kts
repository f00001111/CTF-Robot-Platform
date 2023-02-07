plugins {
    val kotlinVersion = "1.7.10"
    kotlin("jvm") version kotlinVersion
    kotlin("plugin.serialization") version kotlinVersion

    id("net.mamoe.mirai-console") version "2.13.4"
}

group = "tk.mcsog"
version = "0.1.0"

repositories {
     maven("https://maven.aliyun.com/repository/public")
    mavenCentral()
}
