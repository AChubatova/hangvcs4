package Tiger01142

import Tiger01142.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01142")
    name = "Tiger01142"

    vcsRoot(Tiger01142_cVCSroot)
})
