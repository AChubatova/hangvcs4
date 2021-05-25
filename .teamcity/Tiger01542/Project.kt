package Tiger01542

import Tiger01542.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01542")
    name = "Tiger01542"

    vcsRoot(Tiger01542_cVCSroot)
})
