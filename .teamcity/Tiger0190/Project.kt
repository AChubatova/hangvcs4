package Tiger0190

import Tiger0190.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0190")
    name = "Tiger0190"

    vcsRoot(Tiger0190_cVCSroot)
})
