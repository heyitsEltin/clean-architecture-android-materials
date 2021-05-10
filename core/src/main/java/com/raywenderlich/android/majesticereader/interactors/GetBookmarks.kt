package com.raywenderlich.android.majesticereader.interactors

import com.raywenderlich.android.majesticereader.data.BookmarkRepository
import com.raywenderlich.android.majesticereader.domain.Document

class GetBookmarks(private val bookmarkRepository: BookmarkRepository) {
    suspend operator fun invoke(document: Document) = bookmarkRepository.getBookmarks(document)
}