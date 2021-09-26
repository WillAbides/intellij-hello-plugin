package com.github.willabides.intellijhelloplugin.services

import com.intellij.openapi.project.Project
import com.github.willabides.intellijhelloplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
