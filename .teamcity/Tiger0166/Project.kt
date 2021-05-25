package Tiger0166

import Tiger0166.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0166")
    name = "Tiger0166"

    vcsRoot(Tiger0166_cVCSroot)
})
