package com.raywenderlich.android.majesticereader.interactors

import com.raywenderlich.android.majesticereader.data.DocumentRepository
import com.raywenderlich.android.majesticereader.domain.Document

class AddDocument(private val documentRepository: DocumentRepository) {

    suspend operator fun invoke(document: Document) = documentRepository.addDocument(document)
}