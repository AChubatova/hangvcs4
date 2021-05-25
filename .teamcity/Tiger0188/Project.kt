package Tiger0188

import Tiger0188.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0188")
    name = "Tiger0188"

    vcsRoot(Tiger0188_cVCSroot)
})
