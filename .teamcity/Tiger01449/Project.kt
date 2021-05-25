package Tiger01449

import Tiger01449.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01449")
    name = "Tiger01449"

    vcsRoot(Tiger01449_cVCSroot)
})
