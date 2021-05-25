package Tiger01624

import Tiger01624.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01624")
    name = "Tiger01624"

    vcsRoot(Tiger01624_cVCSroot)
})
