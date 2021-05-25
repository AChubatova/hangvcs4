package Tiger01940

import Tiger01940.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01940")
    name = "Tiger01940"

    vcsRoot(Tiger01940_cVCSroot)
})
