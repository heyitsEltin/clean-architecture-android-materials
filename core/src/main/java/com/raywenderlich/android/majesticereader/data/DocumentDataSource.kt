package com.raywenderlich.android.majesticereader.data

import com.raywenderlich.android.majesticereader.domain.Document

interface DocumentDataSource {
    suspend fun add(document: Document)
    suspend fun readAll(): List<Document>
    suspend fun remove(document: Document)
}