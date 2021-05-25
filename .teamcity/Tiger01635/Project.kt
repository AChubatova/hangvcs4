package Tiger01635

import Tiger01635.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01635")
    name = "Tiger01635"

    vcsRoot(Tiger01635_cVCSroot)
})
