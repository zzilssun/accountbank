package kr.iroriasoft.accountbank.rooms.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import kr.iroriasoft.accountbank.rooms.models.bases.BaseModel

@Entity(
        tableName = "sms_patterns",
        indices = [(Index(value = arrayOf("_id"), unique = true))]
)
class SMSPatternModel(
        var message: String,
        var pattern: String,
        @field:ColumnInfo(name = "amount_index") var amountIndex: Int,
        @field:ColumnInfo(name = "desc_index") var descIndex: Int,
        @field:ColumnInfo(name = "account_id") var accountId: Int,
        @field:ColumnInfo(name = "category_id") var categoryId: Int,
        var pos: Int,
        var type: Int = 0,
        @field:ColumnInfo(name = "desc_fixed") var descFixed: String = "",
        @field:ColumnInfo(name = "amount_fixed") var amountFixed: Int = 0,
        @field:ColumnInfo(name = "subcategory_id") var subcategoryId: Int
) : BaseModel() {

    @PrimaryKey(autoGenerate = true)
    var _id: Int = 0
}