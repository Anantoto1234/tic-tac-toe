package com.chocolate.tic_tac_toe.presentation.screens.game.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.chocolate.tic_tac_toe.R
import com.chocolate.tic_tac_toe.presentation.screens.game.view_model.GameUiState
import com.chocolate.tic_tac_toe.presentation.theme.TicTacCustomColors
import com.chocolate.tic_tac_toe.presentation.theme.TicTacToeTheme

@Composable
fun CardPlayer(
    player: GameUiState.Player,
    colorType: Color,
    modifier: Modifier = Modifier,
    border: BorderStroke? = null,
    ) {
    val color = TicTacCustomColors.current
    Card(
        modifier = modifier
            .width(118.dp)
            .height(214.dp),
        colors = CardDefaults.cardColors(
            containerColor = color.darkOnBorder,
        ),
        elevation = CardDefaults.cardElevation(0.dp),
        shape = RoundedCornerShape(16.dp),
        border = border

    ) {
        Column(
            modifier = Modifier.fillMaxSize().padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Image(
                painter = rememberAsyncImagePainter(model = player.imageUrl),
                contentDescription = null,
            )

            Text(
                text = player.name,
                style = MaterialTheme.typography.titleMedium,
                color = color.darkSecondary,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )

            Text(
                text = player.symbol,
                color = colorType,
                style = MaterialTheme.typography.titleLarge.copy(
                    fontSize = 30.sp
                )
            )

        }
    }
}

@Preview
@Composable
fun CardPlayerPreview() {
    TicTacToeTheme {
        CardPlayer(
            player = GameUiState.Player(
                name = "aboooodx3x",
                score = 300
            ),
            colorType = TicTacCustomColors.current.darkSecondary,
            border = BorderStroke(2.dp, TicTacCustomColors.current.darkSecondary)
        )
    }
}