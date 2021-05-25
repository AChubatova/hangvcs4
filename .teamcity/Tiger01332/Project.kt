package Tiger01332

import Tiger01332.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01332")
    name = "Tiger01332"

    vcsRoot(Tiger01332_cVCSroot)
})
