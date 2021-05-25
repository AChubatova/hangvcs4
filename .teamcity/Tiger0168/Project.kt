package Tiger0168

import Tiger0168.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0168")
    name = "Tiger0168"

    vcsRoot(Tiger0168_cVCSroot)
})
