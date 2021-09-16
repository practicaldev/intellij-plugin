package com.github.practicaldev.intellijplugin.services

import com.intellij.openapi.project.Project
import com.github.practicaldev.intellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
