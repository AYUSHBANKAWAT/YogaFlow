package com.example.myapplication.localData

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.myapplication.models.LocalResponse

@Dao
interface YogaDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertData(data:LocalResponse):Long

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertDataList(data:List<LocalResponse>)

    @Query("Select * from yogaTable")
    fun getData():LiveData<List<LocalResponse>>

    @Delete
    suspend fun deleteData(data:LocalResponse):Int
}