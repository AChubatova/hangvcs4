package Tiger01936

import Tiger01936.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01936")
    name = "Tiger01936"

    vcsRoot(Tiger01936_cVCSroot)
})
