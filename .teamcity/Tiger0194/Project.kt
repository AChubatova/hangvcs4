package Tiger0194

import Tiger0194.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0194")
    name = "Tiger0194"

    vcsRoot(Tiger0194_cVCSroot)
})
