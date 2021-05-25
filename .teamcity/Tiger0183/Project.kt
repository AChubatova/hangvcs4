package Tiger0183

import Tiger0183.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0183")
    name = "Tiger0183"

    vcsRoot(Tiger0183_cVCSroot)
})
