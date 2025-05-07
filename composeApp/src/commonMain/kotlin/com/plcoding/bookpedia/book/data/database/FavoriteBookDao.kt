package com.plcoding.bookpedia.book.data.database

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface FavoriteBookDao {

    @Upsert
    suspend fun upsert(book: BookEntity)

    @Query("SELECT * FROM book_table")
    fun getFavoriteBooks(): Flow<List<BookEntity>>

    @Query("SELECT * FROM book_table WHERE id = :id")
    suspend fun getFavoriteBook(id: String): BookEntity?

    @Query("DELETE FROM book_table WHERE id = :id")
    suspend fun deleteFavoriteBook(id: String)

}