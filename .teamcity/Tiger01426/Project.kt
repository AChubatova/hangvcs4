package Tiger01426

import Tiger01426.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01426")
    name = "Tiger01426"

    vcsRoot(Tiger01426_cVCSroot)
})
