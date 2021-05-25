package Tiger01227

import Tiger01227.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01227")
    name = "Tiger01227"

    vcsRoot(Tiger01227_cVCSroot)
})
