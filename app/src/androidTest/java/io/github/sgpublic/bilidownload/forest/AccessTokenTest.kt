package io.github.sgpublic.bilidownload.forest

import io.github.sgpublic.bilidownload.core.util.ForestClients
import org.junit.Test

/**
 *
 * @author Madray Haven
 * @date 2022/10/20 15:22
 */
class AccessTokenTest {
    @Test
    fun accessToken() {
        ForestClients.PASSPORT.accessToken("36c6bc7823c2cbe215f48f65b1f275a1").execute()
    }
}