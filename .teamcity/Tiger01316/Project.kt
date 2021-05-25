package Tiger01316

import Tiger01316.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01316")
    name = "Tiger01316"

    vcsRoot(Tiger01316_cVCSroot)
})
