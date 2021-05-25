package Tiger0167

import Tiger0167.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0167")
    name = "Tiger0167"

    vcsRoot(Tiger0167_cVCSroot)
})
