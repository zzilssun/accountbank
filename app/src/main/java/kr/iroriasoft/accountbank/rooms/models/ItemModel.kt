package kr.iroriasoft.accountbank.rooms.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import java.util.*

@Entity(
        tableName = "items",
        indices = [(Index(value = arrayOf("_id"), unique = true))]
)
class ItemModel(
        @field:ColumnInfo(name = "account_id") var accountId: Int,
        var date: Date,
        @field:ColumnInfo(name = "category_id") var categoryId: Int,
        var amount: Int,
        var balance: Int,
        var desc: String,
        @field:ColumnInfo(name = "transfer_id") var transferId: Int?,
        @field:ColumnInfo(name = "subcategory_id") var subcategoryId: Int?
) {

    @PrimaryKey(autoGenerate = true)
    var _id: Int = 0
}