package Tiger0179

import Tiger0179.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0179")
    name = "Tiger0179"

    vcsRoot(Tiger0179_cVCSroot)
})
