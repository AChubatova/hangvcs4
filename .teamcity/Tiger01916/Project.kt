package Tiger01916

import Tiger01916.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01916")
    name = "Tiger01916"

    vcsRoot(Tiger01916_cVCSroot)
})
