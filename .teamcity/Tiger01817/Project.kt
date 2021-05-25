package Tiger01817

import Tiger01817.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01817")
    name = "Tiger01817"

    vcsRoot(Tiger01817_cVCSroot)
})
