package Tiger01430

import Tiger01430.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01430")
    name = "Tiger01430"

    vcsRoot(Tiger01430_cVCSroot)
})
