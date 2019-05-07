package kr.iroriasoft.accountbank.rooms.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import kr.iroriasoft.accountbank.rooms.models.bases.BaseModel

@Entity(
        tableName = "subcategories",
        indices = [(Index(value = arrayOf("_id"), unique = true))]
)
class SubCategoryModel(
        var name: String,
        @field:ColumnInfo(name = "parent_id") var parentId: Int,
        var pos: Int
) : BaseModel() {

    @PrimaryKey(autoGenerate = true)
    var _id: Int = 0
}