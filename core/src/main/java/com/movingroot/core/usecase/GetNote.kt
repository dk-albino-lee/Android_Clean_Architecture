package com.movingroot.core.usecase

import com.movingroot.core.repository.NoteRepository

class GetNote(private val repository: NoteRepository) {
    suspend operator fun invoke(id: Long) = repository.getNote(id)
}