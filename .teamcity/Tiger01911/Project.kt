package Tiger01911

import Tiger01911.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01911")
    name = "Tiger01911"

    vcsRoot(Tiger01911_cVCSroot)
})
