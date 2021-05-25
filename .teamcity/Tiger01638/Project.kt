package Tiger01638

import Tiger01638.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01638")
    name = "Tiger01638"

    vcsRoot(Tiger01638_cVCSroot)
})
