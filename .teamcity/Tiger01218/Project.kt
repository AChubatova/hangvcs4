package Tiger01218

import Tiger01218.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01218")
    name = "Tiger01218"

    vcsRoot(Tiger01218_cVCSroot)
})
