package Tiger0154

import Tiger0154.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0154")
    name = "Tiger0154"

    vcsRoot(Tiger0154_cVCSroot)
})
