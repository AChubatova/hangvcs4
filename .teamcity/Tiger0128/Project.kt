package Tiger0128

import Tiger0128.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0128")
    name = "Tiger0128"

    vcsRoot(Tiger0128_cVCSroot)
})
