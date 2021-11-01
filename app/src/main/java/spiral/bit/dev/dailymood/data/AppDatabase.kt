package spiral.bit.dev.dailymood.data

import androidx.room.Database
import androidx.room.RoomDatabase
import spiral.bit.dev.dailymood.data.mood.MoodEntity
import spiral.bit.dev.dailymood.data.mood.MoodDao

//TODO CHANGE BD VERSION TO 1
@Database(entities = [MoodEntity::class], version = 8, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun emotionDao(): MoodDao
}