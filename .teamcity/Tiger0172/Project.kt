package Tiger0172

import Tiger0172.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0172")
    name = "Tiger0172"

    vcsRoot(Tiger0172_cVCSroot)
})
