package Tiger01340

import Tiger01340.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01340")
    name = "Tiger01340"

    vcsRoot(Tiger01340_cVCSroot)
})
