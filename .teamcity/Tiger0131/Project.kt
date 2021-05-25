package Tiger0131

import Tiger0131.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0131")
    name = "Tiger0131"

    vcsRoot(Tiger0131_cVCSroot)
})
