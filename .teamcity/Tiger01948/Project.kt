package Tiger01948

import Tiger01948.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01948")
    name = "Tiger01948"

    vcsRoot(Tiger01948_cVCSroot)
})
