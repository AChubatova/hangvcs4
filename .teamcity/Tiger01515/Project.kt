package Tiger01515

import Tiger01515.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01515")
    name = "Tiger01515"

    vcsRoot(Tiger01515_cVCSroot)
})
