package Tiger01641

import Tiger01641.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01641")
    name = "Tiger01641"

    vcsRoot(Tiger01641_cVCSroot)
})
