package kr.iroriasoft.accountbank.rooms.models.bases

import com.google.gson.Gson

open class BaseModel {
    fun toJsonString(): String {
        return Gson().toJson(this)
    }
}