package com.example.firebaseauthyt.UIitem

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.firebaseauthyt.presentation.booking.BookingUser

@Composable
fun BookedRoomInforCard(bookingUser: BookingUser) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        elevation = 2.dp,
        shape = RoundedCornerShape(16.dp)
    ) {
        Row(modifier = Modifier.clickable { }) {
            BookedRoomContent(bookingUser , Modifier.weight(1f))
            Row(
                modifier = Modifier
                    .padding(8.dp),
                horizontalArrangement = Arrangement.End, Alignment.Bottom
            ) {
                Button(
                    onClick = {},

                    ) {
                    Text(text = "예약취소")
                }
            }
        }
    }
}