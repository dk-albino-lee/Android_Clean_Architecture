package com.movingroot.core.usecase

import com.movingroot.core.repository.NoteRepository

class GetAllNotes(private val repository: NoteRepository) {
    suspend operator fun invoke() = repository.getAllNotes()
}