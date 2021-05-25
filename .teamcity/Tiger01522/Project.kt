package Tiger01522

import Tiger01522.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01522")
    name = "Tiger01522"

    vcsRoot(Tiger01522_cVCSroot)
})
