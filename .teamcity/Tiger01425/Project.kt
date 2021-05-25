package Tiger01425

import Tiger01425.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01425")
    name = "Tiger01425"

    vcsRoot(Tiger01425_cVCSroot)
})
