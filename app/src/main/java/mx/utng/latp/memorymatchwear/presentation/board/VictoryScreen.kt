package mx.utng.latp.memorymatchwear.presentation.board

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material3.Button
import androidx.wear.compose.material3.MaterialTheme
import androidx.wear.compose.material3.Text
import mx.utng.latp.memorymatchwear.domain.model.GameState

@Composable
fun VictoryScreen(state: GameState, onRestart: () -> Unit) {
    Box(
        Modifier
            .fillMaxSize()
            .background(Color(0xFF0A2A0A)),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                "🏆 Completado!",
                style = MaterialTheme.typography.titleMedium,
                color = Color(0xFFF9A825),
                fontWeight = FontWeight.Bold
            )
            Text(
                "⏱ ${state.elapsedSeconds}s · 🎯 ${state.moves} mov",
                style = MaterialTheme.typography.bodyMedium,
                color = Color.White
            )
            if (state.bestTime < Long.MAX_VALUE) {
                val isNewRecord = state.elapsedSeconds <= state.bestTime
                Text(
                    if (isNewRecord) "⭐ ¡Nuevo récord!"
                    else "🏅 Mejor: ${state.bestTime}s",
                    color = Color(0xFFA5D6A7),
                    style = MaterialTheme.typography.labelSmall
                )
            }
            Button(
                onClick = onRestart,
                modifier = Modifier.fillMaxWidth(0.85f)
            ) {
                Text("↺ Jugar de nuevo")
            }
        }
    }
}
