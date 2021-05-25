package Tiger01819

import Tiger01819.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01819")
    name = "Tiger01819"

    vcsRoot(Tiger01819_cVCSroot)
})
