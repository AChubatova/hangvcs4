package Tiger01636

import Tiger01636.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01636")
    name = "Tiger01636"

    vcsRoot(Tiger01636_cVCSroot)
})
