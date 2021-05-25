package Tiger01148

import Tiger01148.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01148")
    name = "Tiger01148"

    vcsRoot(Tiger01148_cVCSroot)
})
