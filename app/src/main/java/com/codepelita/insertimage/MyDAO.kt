package com.codepelita.insertimage

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface MyDAO {

    @Query("SELECT * FROM my_table ORDER BY id ASC")
    fun readPerson(): LiveData<List<Person>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPerson(person: Person)

}