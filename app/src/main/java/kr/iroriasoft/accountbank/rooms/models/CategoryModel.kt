package kr.iroriasoft.accountbank.rooms.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
        tableName = "categories",
        indices = [(Index(value = arrayOf("_id"), unique = true)), (Index(value = arrayOf("name"), unique = true))]
)
class CategoryModel(var name: String,
                    @field:ColumnInfo(name = "icon_path") var iconPath: String = "",
                    var pos: Int,
                    var income: Int = 1,
                    var expense: Int = 1,
                    var transfer: Int = 1,
                    var show_in_graph: Int = 1) {

    @PrimaryKey(autoGenerate = true)
    var _id: Int = 0
}