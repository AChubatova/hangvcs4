package Tiger01836

import Tiger01836.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01836")
    name = "Tiger01836"

    vcsRoot(Tiger01836_cVCSroot)
})
