package Tiger01324

import Tiger01324.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01324")
    name = "Tiger01324"

    vcsRoot(Tiger01324_cVCSroot)
})
