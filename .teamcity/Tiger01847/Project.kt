package Tiger01847

import Tiger01847.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01847")
    name = "Tiger01847"

    vcsRoot(Tiger01847_cVCSroot)
})
