package Tiger01536

import Tiger01536.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01536")
    name = "Tiger01536"

    vcsRoot(Tiger01536_cVCSroot)
})
