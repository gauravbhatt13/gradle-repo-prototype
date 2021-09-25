package com.lurninghut.build.plugin

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class DanceTask extends DefaultTask {
    @TaskAction
    void executeTask() {
        println "I can dance"
    }
}
