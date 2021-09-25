package com.lurninghut.build.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class GreetingPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        project.tasks.register('greet', GreetTask)
        project.tasks.register('dance', DanceTask)
    }
}
