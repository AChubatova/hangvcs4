package Tiger0161

import Tiger0161.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0161")
    name = "Tiger0161"

    vcsRoot(Tiger0161_cVCSroot)
})
