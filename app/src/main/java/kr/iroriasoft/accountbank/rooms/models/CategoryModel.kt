package kr.iroriasoft.accountbank.rooms.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import kr.iroriasoft.accountbank.rooms.models.bases.BaseModel

@Entity(
        tableName = "categories",
        indices = [(Index(value = arrayOf("_id", "name"), unique = true))]
)
class CategoryModel(
        var name: String,
        @field:ColumnInfo(name = "icon_path") var iconPath: String = "",
        var pos: Int,
        var income: Int = 1,
        var expense: Int = 1,
        var transfer: Int = 1,
        @field:ColumnInfo(name = "show_in_graph") var showInGraph: Int = 1
) : BaseModel() {

    @PrimaryKey(autoGenerate = true)
    var _id: Int = 0
}