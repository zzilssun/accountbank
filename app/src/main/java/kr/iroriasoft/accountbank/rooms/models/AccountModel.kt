package kr.iroriasoft.accountbank.rooms.models

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
        tableName = "accounts",
        indices = [(Index(value = arrayOf("_id"), unique = true)), (Index(value = arrayOf("name"), unique = true))]
)
class AccountModel(var name: String,
                   var balance: Int = 0,
                   var pos: Int) {

    @PrimaryKey(autoGenerate = true)
    var _id: Int = 0
}