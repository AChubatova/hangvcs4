package Tiger01319

import Tiger01319.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01319")
    name = "Tiger01319"

    vcsRoot(Tiger01319_cVCSroot)
})
