package Tiger0156

import Tiger0156.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0156")
    name = "Tiger0156"

    vcsRoot(Tiger0156_cVCSroot)
})
