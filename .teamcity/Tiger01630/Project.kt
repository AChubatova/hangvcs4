package Tiger01630

import Tiger01630.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01630")
    name = "Tiger01630"

    vcsRoot(Tiger01630_cVCSroot)
})
