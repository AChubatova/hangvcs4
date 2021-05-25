package Tiger0151

import Tiger0151.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0151")
    name = "Tiger0151"

    vcsRoot(Tiger0151_cVCSroot)
})
