package com.example.myapplication.localData

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.myapplication.models.LocalResponse

@Database(entities =[LocalResponse::class], exportSchema = false, version = 1 )
abstract class YogaDatabase:RoomDatabase() {
    abstract fun getDao():YogaDao

    companion object{
        private var INSTANCE:YogaDatabase?=null

        private fun getInstance(context:Context):YogaDatabase{
            val tempInstance = INSTANCE
            if( tempInstance !=null ){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    YogaDatabase::class.java,
                    DatabasePoint.DB_NAME
                ).build()
                INSTANCE=instance
                return instance
            }
        }
    }

}