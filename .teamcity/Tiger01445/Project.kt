package Tiger01445

import Tiger01445.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01445")
    name = "Tiger01445"

    vcsRoot(Tiger01445_cVCSroot)
})
