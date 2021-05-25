package Tiger01428

import Tiger01428.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01428")
    name = "Tiger01428"

    vcsRoot(Tiger01428_cVCSroot)
})
