package Tiger0142

import Tiger0142.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0142")
    name = "Tiger0142"

    vcsRoot(Tiger0142_cVCSroot)
})
