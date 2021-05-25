package Tiger01443

import Tiger01443.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01443")
    name = "Tiger01443"

    vcsRoot(Tiger01443_cVCSroot)
})
