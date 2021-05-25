package Tiger0197

import Tiger0197.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0197")
    name = "Tiger0197"

    vcsRoot(Tiger0197_cVCSroot)
})
