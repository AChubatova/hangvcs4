package Tiger01321

import Tiger01321.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01321")
    name = "Tiger01321"

    vcsRoot(Tiger01321_cVCSroot)
})
