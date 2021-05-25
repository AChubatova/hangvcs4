package Tiger01720

import Tiger01720.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01720")
    name = "Tiger01720"

    vcsRoot(Tiger01720_cVCSroot)
})
