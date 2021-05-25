package Tiger01527

import Tiger01527.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01527")
    name = "Tiger01527"

    vcsRoot(Tiger01527_cVCSroot)
})
