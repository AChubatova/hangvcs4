package Tiger01524

import Tiger01524.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01524")
    name = "Tiger01524"

    vcsRoot(Tiger01524_cVCSroot)
})
