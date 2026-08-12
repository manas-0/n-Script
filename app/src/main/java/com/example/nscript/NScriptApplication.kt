package com.example.nscript

import android.app.Application
import com.example.nscript.data.NoteDatabase
import com.example.nscript.repository.NoteRepository

class NScriptApplication : Application() {
    val database by lazy { NoteDatabase.getDatabase(this) }
    val repository by lazy { NoteRepository(database.noteDao()) }
}