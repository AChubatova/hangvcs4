package Tiger01343

import Tiger01343.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01343")
    name = "Tiger01343"

    vcsRoot(Tiger01343_cVCSroot)
})
