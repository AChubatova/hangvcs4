package Tiger01724

import Tiger01724.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01724")
    name = "Tiger01724"

    vcsRoot(Tiger01724_cVCSroot)
})
