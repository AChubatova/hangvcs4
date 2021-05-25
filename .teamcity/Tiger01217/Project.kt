package Tiger01217

import Tiger01217.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01217")
    name = "Tiger01217"

    vcsRoot(Tiger01217_cVCSroot)
})
