package Tiger01431

import Tiger01431.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01431")
    name = "Tiger01431"

    vcsRoot(Tiger01431_cVCSroot)
})
