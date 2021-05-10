package com.raywenderlich.android.majesticereader.interactors

import com.raywenderlich.android.majesticereader.data.BookmarkRepository
import com.raywenderlich.android.majesticereader.domain.Bookmark
import com.raywenderlich.android.majesticereader.domain.Document

class AddBookmark(private val bookmarkRepository: BookmarkRepository) {
    suspend operator fun invoke(document: Document, bookmark: Bookmark) =
            bookmarkRepository.addBookmark(document, bookmark)
}