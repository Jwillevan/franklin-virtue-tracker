package com.devin.virtuetracker.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val Brown = Color(0xFF6D4C2C)
private val BrownLight = Color(0xFF9C7A52)
private val Cream = Color(0xFFF7F1E6)
private val DarkBrown = Color(0xFF3E2A18)

private val LightColors = lightColorScheme(
    primary = Brown,
    onPrimary = Color.White,
    secondary = BrownLight,
    background = Cream,
    surface = Color.White,
    onBackground = DarkBrown,
    onSurface = DarkBrown
)

private val DarkColors = darkColorScheme(
    primary = BrownLight,
    onPrimary = Color.Black,
    secondary = Brown,
    background = Color(0xFF1C140D),
    surface = Color(0xFF2A1E14),
    onBackground = Cream,
    onSurface = Cream
)

@Composable
fun VirtueTrackerTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if (darkTheme) DarkColors else LightColors,
        content = content
    )
}
