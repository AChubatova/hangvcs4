package Tiger01229

import Tiger01229.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01229")
    name = "Tiger01229"

    vcsRoot(Tiger01229_cVCSroot)
})
