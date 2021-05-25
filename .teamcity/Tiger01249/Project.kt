package Tiger01249

import Tiger01249.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01249")
    name = "Tiger01249"

    vcsRoot(Tiger01249_cVCSroot)
})
