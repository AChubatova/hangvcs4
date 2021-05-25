package Tiger01717

import Tiger01717.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01717")
    name = "Tiger01717"

    vcsRoot(Tiger01717_cVCSroot)
})
