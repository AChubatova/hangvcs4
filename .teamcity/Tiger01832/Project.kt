package Tiger01832

import Tiger01832.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01832")
    name = "Tiger01832"

    vcsRoot(Tiger01832_cVCSroot)
})
