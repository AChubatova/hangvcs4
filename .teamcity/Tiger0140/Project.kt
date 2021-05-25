package Tiger0140

import Tiger0140.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0140")
    name = "Tiger0140"

    vcsRoot(Tiger0140_cVCSroot)
})
