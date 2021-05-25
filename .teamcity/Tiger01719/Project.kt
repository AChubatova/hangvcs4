package Tiger01719

import Tiger01719.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01719")
    name = "Tiger01719"

    vcsRoot(Tiger01719_cVCSroot)
})
