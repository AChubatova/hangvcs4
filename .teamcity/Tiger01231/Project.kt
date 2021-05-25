package Tiger01231

import Tiger01231.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01231")
    name = "Tiger01231"

    vcsRoot(Tiger01231_cVCSroot)
})
