package Tiger01315

import Tiger01315.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01315")
    name = "Tiger01315"

    vcsRoot(Tiger01315_cVCSroot)
})
