package Tiger01746

import Tiger01746.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01746")
    name = "Tiger01746"

    vcsRoot(Tiger01746_cVCSroot)
})
