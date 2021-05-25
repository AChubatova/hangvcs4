package Tiger01245

import Tiger01245.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01245")
    name = "Tiger01245"

    vcsRoot(Tiger01245_cVCSroot)
})
