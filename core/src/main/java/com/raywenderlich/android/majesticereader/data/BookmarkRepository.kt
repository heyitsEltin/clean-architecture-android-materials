package com.raywenderlich.android.majesticereader.data

import com.raywenderlich.android.majesticereader.domain.Bookmark
import com.raywenderlich.android.majesticereader.domain.Document

class BookmarkRepository(private val dataSource: BookmarkDataSource) {
    suspend fun addBookmark(document: Document, bookmark: Bookmark) = dataSource.add(document, bookmark)
    suspend fun getBookmarks(document: Document) = dataSource.read(document)
    suspend fun removeBookmark(document: Document, bookmark: Bookmark) = dataSource.remove(document, bookmark)
}