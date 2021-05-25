package Tiger01915

import Tiger01915.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01915")
    name = "Tiger01915"

    vcsRoot(Tiger01915_cVCSroot)
})
