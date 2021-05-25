package Tiger0189

import Tiger0189.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0189")
    name = "Tiger0189"

    vcsRoot(Tiger0189_cVCSroot)
})
