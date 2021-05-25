package Tiger01821

import Tiger01821.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01821")
    name = "Tiger01821"

    vcsRoot(Tiger01821_cVCSroot)
})
