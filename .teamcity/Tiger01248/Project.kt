package Tiger01248

import Tiger01248.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01248")
    name = "Tiger01248"

    vcsRoot(Tiger01248_cVCSroot)
})
