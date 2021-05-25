package Tiger01441

import Tiger01441.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01441")
    name = "Tiger01441"

    vcsRoot(Tiger01441_cVCSroot)
})
