package Tiger01944

import Tiger01944.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01944")
    name = "Tiger01944"

    vcsRoot(Tiger01944_cVCSroot)
})
