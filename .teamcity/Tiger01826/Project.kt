package Tiger01826

import Tiger01826.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01826")
    name = "Tiger01826"

    vcsRoot(Tiger01826_cVCSroot)
})
