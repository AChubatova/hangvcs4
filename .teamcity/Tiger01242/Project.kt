package Tiger01242

import Tiger01242.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01242")
    name = "Tiger01242"

    vcsRoot(Tiger01242_cVCSroot)
})
