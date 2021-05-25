package Tiger01947

import Tiger01947.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01947")
    name = "Tiger01947"

    vcsRoot(Tiger01947_cVCSroot)
})
