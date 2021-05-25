package Tiger01941

import Tiger01941.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01941")
    name = "Tiger01941"

    vcsRoot(Tiger01941_cVCSroot)
})
