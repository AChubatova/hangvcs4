package Tiger0184

import Tiger0184.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0184")
    name = "Tiger0184"

    vcsRoot(Tiger0184_cVCSroot)
})
