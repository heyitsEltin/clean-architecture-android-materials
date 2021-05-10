package com.raywenderlich.android.majesticereader.data

import com.raywenderlich.android.majesticereader.domain.Bookmark
import com.raywenderlich.android.majesticereader.domain.Document

interface BookmarkDataSource {
    suspend fun add(document: Document, bookmark: Bookmark)
    suspend fun read(document: Document): List<Bookmark>
    suspend fun remove(document: Document, bookmark: Bookmark)
}