package Tiger01725

import Tiger01725.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01725")
    name = "Tiger01725"

    vcsRoot(Tiger01725_cVCSroot)
})
