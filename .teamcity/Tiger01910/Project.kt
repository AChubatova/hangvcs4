package Tiger01910

import Tiger01910.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01910")
    name = "Tiger01910"

    vcsRoot(Tiger01910_cVCSroot)
})
