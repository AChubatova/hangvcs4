package Tiger0132

import Tiger0132.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0132")
    name = "Tiger0132"

    vcsRoot(Tiger0132_cVCSroot)
})
