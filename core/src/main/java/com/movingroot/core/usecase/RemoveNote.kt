package com.movingroot.core.usecase

import com.movingroot.core.data.Note
import com.movingroot.core.repository.NoteRepository

class RemoveNote(private val repository: NoteRepository) {
    suspend operator fun invoke(note: Note) = repository.removeNote(note)
}