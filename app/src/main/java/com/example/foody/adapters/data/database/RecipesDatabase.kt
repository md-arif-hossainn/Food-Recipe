package com.example.foody.adapters.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.foody.adapters.data.database.enteties.FavoritesEntity
import com.example.foody.adapters.data.database.enteties.FoodJokeEntity
import com.example.foody.adapters.data.database.enteties.RecipesEntity

@Database(
    entities = [RecipesEntity::class, FavoritesEntity::class, FoodJokeEntity::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(RecipesTypeConverter::class)
abstract class RecipesDatabase: RoomDatabase() {

    abstract fun recipesDao(): RecipesDao

}