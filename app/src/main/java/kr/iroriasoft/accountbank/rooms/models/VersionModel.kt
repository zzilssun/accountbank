package kr.iroriasoft.accountbank.rooms.models

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import kr.iroriasoft.accountbank.rooms.models.bases.BaseModel

@Entity(
        tableName = "versions",
        indices = [(Index(value = arrayOf("name"), unique = true))]
)
class VersionModel(var name: String, @PrimaryKey var version: Int) : BaseModel()