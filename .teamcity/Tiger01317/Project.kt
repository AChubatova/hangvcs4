package Tiger01317

import Tiger01317.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01317")
    name = "Tiger01317"

    vcsRoot(Tiger01317_cVCSroot)
})
