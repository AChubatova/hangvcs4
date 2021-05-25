package Tiger0162

import Tiger0162.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0162")
    name = "Tiger0162"

    vcsRoot(Tiger0162_cVCSroot)
})
