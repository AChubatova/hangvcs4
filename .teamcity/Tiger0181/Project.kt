package Tiger0181

import Tiger0181.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0181")
    name = "Tiger0181"

    vcsRoot(Tiger0181_cVCSroot)
})
