package Tiger01745

import Tiger01745.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01745")
    name = "Tiger01745"

    vcsRoot(Tiger01745_cVCSroot)
})
