package Tiger01519

import Tiger01519.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01519")
    name = "Tiger01519"

    vcsRoot(Tiger01519_cVCSroot)
})
