package Tiger01238

import Tiger01238.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01238")
    name = "Tiger01238"

    vcsRoot(Tiger01238_cVCSroot)
})
