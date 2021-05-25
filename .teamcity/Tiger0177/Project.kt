package Tiger0177

import Tiger0177.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0177")
    name = "Tiger0177"

    vcsRoot(Tiger0177_cVCSroot)
})
