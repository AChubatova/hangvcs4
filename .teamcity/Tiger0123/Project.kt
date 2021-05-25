package Tiger0123

import Tiger0123.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0123")
    name = "Tiger0123"

    vcsRoot(Tiger0123_cVCSroot)
})
