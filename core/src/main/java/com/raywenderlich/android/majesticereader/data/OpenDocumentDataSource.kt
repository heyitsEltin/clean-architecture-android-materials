package com.raywenderlich.android.majesticereader.data

import com.raywenderlich.android.majesticereader.domain.Document

interface OpenDocumentDataSource {
    fun setOpenDocument(document: Document)
    fun getOpenDocument(): Document
}