package com.plcoding.bookpedia

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.plcoding.bookpedia.book.domain.Book
import com.plcoding.bookpedia.book.presentation.book_list.BookListScreen
import com.plcoding.bookpedia.book.presentation.book_list.BookListState
import com.plcoding.bookpedia.book.presentation.book_list.components.BookSearchBar

@Preview
@Composable
private fun BookSearchBarPreview(){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
    ){
        BookSearchBar(
            searchQuery = "",
            onSearchQueryChange = {it -> },
            onImeSearch = {},
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Preview
@Composable
private fun BookListScreenPreview() {
    val books = (1 .. 100).map{
        Book(
            id = it.toString(),
            title = "Title $it",
            imageUrl = "test.com",
            authors = listOf("Philipp"),
            description = "Description $it",
            languages = listOf(""),
            ratingCount = 5,
            numPages = 100,
            numEditions = 3,
            averageRating = 4.67854,
            firstPublishYear = "2003"
        )
    }
    BookListScreen(
        state = BookListState(
            searchResults = books
        ),
        onAction = {}
    )
}