package Tiger0164

import Tiger0164.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0164")
    name = "Tiger0164"

    vcsRoot(Tiger0164_cVCSroot)
})
