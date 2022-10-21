package io.github.sgpublic.bilidownload.core.forest

import com.google.gson.JsonArray
import com.google.gson.JsonObject
import io.github.sgpublic.bilidownload.core.forest.annotations.ApiStyle
import io.github.sgpublic.bilidownload.core.util.GsonException
import io.github.sgpublic.bilidownload.core.util.fromGson
import io.github.sgpublic.bilidownload.core.util.log
import io.github.sgpublic.bilidownload.core.util.toGson
import java.util.LinkedList

class ApiModule {
    companion object {
        val TS: Long get() = System.currentTimeMillis() / 1000
        val TS_FULL: Long get() = System.currentTimeMillis()
    }
}

inline fun <reified T: Any> JsonArray.find(): List<T> {
    val apiStyle = T::class.java.getAnnotation(ApiStyle::class.java)
        ?: throw GsonException("To invoke this function, you must add annotation ApiStyle to target type!")
    val result = LinkedList<T>()
    for (element in this) {
        val obj = element.asJsonObject
        if (!obj.has("style") || obj.get("style").asString == apiStyle.value) {
            result.add(T::class.java.fromGson(obj.toString()))
        }
    }
    if (result.isEmpty()) {
        log.debug("${T::class.java} find() empty")
    }
    return result
}

