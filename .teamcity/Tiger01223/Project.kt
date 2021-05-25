package Tiger01223

import Tiger01223.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01223")
    name = "Tiger01223"

    vcsRoot(Tiger01223_cVCSroot)
})
