package com.raywenderlich.android.majesticereader.interactors

import com.raywenderlich.android.majesticereader.data.DocumentRepository
import com.raywenderlich.android.majesticereader.domain.Document

class SetOpenDocument(private val documentRepository: DocumentRepository) {

    operator fun invoke(document: Document) = documentRepository.setOpenDocument(document)
}