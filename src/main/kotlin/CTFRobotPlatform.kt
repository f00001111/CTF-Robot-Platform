package tk.mcsog

import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescription
import net.mamoe.mirai.console.plugin.jvm.KotlinPlugin
import net.mamoe.mirai.utils.info
object CTFRobotPlatform : KotlinPlugin(
    JvmPluginDescription(
        id = "tk.mcsog.CTF-Robot-Platform",
        name = "CTF Robot Platform",
        version = "0.1.0",
    ) {
author("f00001111")
info("""机器人的CTF平台""")
    }
) {
    override fun onEnable() {
        logger.info { "Plugin loaded" }
    }
}