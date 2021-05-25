package Tiger01921

import Tiger01921.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01921")
    name = "Tiger01921"

    vcsRoot(Tiger01921_cVCSroot)
})
