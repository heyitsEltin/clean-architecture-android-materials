package com.raywenderlich.android.majesticereader.interactors

import com.raywenderlich.android.majesticereader.data.DocumentRepository

class GetOpenDocument(private val documentRepository: DocumentRepository) {

    operator fun invoke() = documentRepository.getOpenDocument()
}