package com.uzb7.project1.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.uzb7.project1.model.Menu
import com.uzb7.project1.model.Ovqatlar


/*@Database(entities = [Menu::class],[Ovqatlar::class], version = 1)
abstract class MenuDatabase:RoomDatabase() {

    abstract fun getMenuDao():MenuDao

    companion object{
        private var DB_INSTANCE:MenuDatabase?=null

        fun getAppInstance(context:Context):MenuDatabase{
            if(DB_INSTANCE==null){
                DB_INSTANCE= Room.databaseBuilder(context.applicationContext,MenuDatabase::class.java,"users").allowMainThreadQueries().build()
            }
            return DB_INSTANCE!!
        }
    }

}*/