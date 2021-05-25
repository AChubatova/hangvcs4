package Tiger01935

import Tiger01935.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01935")
    name = "Tiger01935"

    vcsRoot(Tiger01935_cVCSroot)
})
