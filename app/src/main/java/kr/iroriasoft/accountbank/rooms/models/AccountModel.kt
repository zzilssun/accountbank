package kr.iroriasoft.accountbank.rooms.models

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import kr.iroriasoft.accountbank.rooms.models.bases.BaseModel

@Entity(
        tableName = "accounts",
        indices = [(Index(value = arrayOf("_id", "name"), unique = true))]
)
class AccountModel(
        var name: String,
        var balance: Int = 0,
        var pos: Int
) : BaseModel() {

    @PrimaryKey(autoGenerate = true)
    var _id: Int = 0
}