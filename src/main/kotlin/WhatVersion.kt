import org.slf4j.Logger
import org.slf4j.LoggerFactory

class WhatVersion {
    companion object {
        private val log: Logger = LoggerFactory.getLogger(WhatVersion::class.java)

        @JvmStatic fun main(args: Array<String>) {
            log.info("KotlinVersion = {}", KotlinVersion.CURRENT)
        }
    }
}
