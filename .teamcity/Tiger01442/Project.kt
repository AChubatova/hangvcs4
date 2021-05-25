package Tiger01442

import Tiger01442.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01442")
    name = "Tiger01442"

    vcsRoot(Tiger01442_cVCSroot)
})
