package Tiger0726

import Tiger0726.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0726")
    name = "Tiger0726"

    vcsRoot(Tiger0726_cVCSroot)
})
