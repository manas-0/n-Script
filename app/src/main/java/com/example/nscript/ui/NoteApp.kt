package com.example.nscript.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.nscript.data.Note
import com.example.nscript.viewmodel.NoteViewModel

private object Routes {
    const val LIST = "list"
    const val EDIT = "edit"
}

@Composable
fun NoteApp(viewModel: NoteViewModel) {
    val navController = rememberNavController()
    var selectedNote by remember { mutableStateOf<Note?>(null) }

    NavHost(navController = navController, startDestination = Routes.LIST) {
        composable(Routes.LIST) {
            NoteListScreen(
                viewModel = viewModel,
                onAddNote = {
                    selectedNote = null
                    navController.navigate(Routes.EDIT)
                },
                onNoteClick = { note ->
                    selectedNote = note
                    navController.navigate(Routes.EDIT)
                }
            )
        }
        composable(Routes.EDIT) {
            AddEditNoteScreen(
                viewModel = viewModel,
                note = selectedNote,
                onDone = { navController.popBackStack() }
            )
        }
    }
}
