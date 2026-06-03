package com.devin.virtuetracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.devin.virtuetracker.data.TrackerRepository
import com.devin.virtuetracker.ui.TrackerScreen
import com.devin.virtuetracker.ui.theme.VirtueTrackerTheme

class MainActivity : ComponentActivity() {

    private val viewModel: TrackerViewModel by viewModels {
        TrackerViewModel.Factory(TrackerRepository(applicationContext))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VirtueTrackerTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TrackerScreen(viewModel = viewModel)
                }
            }
        }
    }
}
