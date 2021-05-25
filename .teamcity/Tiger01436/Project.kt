package Tiger01436

import Tiger01436.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01436")
    name = "Tiger01436"

    vcsRoot(Tiger01436_cVCSroot)
})
