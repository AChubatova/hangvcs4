package Tiger01331

import Tiger01331.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01331")
    name = "Tiger01331"

    vcsRoot(Tiger01331_cVCSroot)
})
