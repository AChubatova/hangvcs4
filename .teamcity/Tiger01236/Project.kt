package Tiger01236

import Tiger01236.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01236")
    name = "Tiger01236"

    vcsRoot(Tiger01236_cVCSroot)
})
