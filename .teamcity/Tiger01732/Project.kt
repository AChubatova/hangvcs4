package Tiger01732

import Tiger01732.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01732")
    name = "Tiger01732"

    vcsRoot(Tiger01732_cVCSroot)
})
