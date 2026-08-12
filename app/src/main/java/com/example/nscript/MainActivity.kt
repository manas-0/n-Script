package com.example.nscript

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.example.nscript.ui.NoteApp
import com.example.nscript.ui.theme.NScriptTheme
import com.example.nscript.viewmodel.NoteViewModel
import com.example.nscript.viewmodel.NoteViewModelFactory

class MainActivity : ComponentActivity() {

    private val viewModel: NoteViewModel by viewModels {
        NoteViewModelFactory((application as NScriptApplication).repository)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NScriptTheme {
                NoteApp(viewModel = viewModel)
            }
        }
    }
}