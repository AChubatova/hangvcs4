package Tiger01333

import Tiger01333.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01333")
    name = "Tiger01333"

    vcsRoot(Tiger01333_cVCSroot)
})
