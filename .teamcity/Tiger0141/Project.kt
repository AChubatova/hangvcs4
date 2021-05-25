package Tiger0141

import Tiger0141.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0141")
    name = "Tiger0141"

    vcsRoot(Tiger0141_cVCSroot)
})
