package Tiger01241

import Tiger01241.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01241")
    name = "Tiger01241"

    vcsRoot(Tiger01241_cVCSroot)
})
