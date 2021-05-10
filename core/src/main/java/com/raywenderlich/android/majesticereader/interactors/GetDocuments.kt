package com.raywenderlich.android.majesticereader.interactors

import com.raywenderlich.android.majesticereader.data.DocumentRepository

class GetDocuments(private val documentRepository: DocumentRepository) {

    suspend operator fun invoke() = documentRepository.getDocuments()
}