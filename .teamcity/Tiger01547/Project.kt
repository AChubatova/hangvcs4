package Tiger01547

import Tiger01547.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01547")
    name = "Tiger01547"

    vcsRoot(Tiger01547_cVCSroot)
})
