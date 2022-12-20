package com.example.firebaseauthyt.bottombar

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.firebaseauthyt.UIitem.BookedRoomInforCard
import com.example.firebaseauthyt.presentation.booking.bookingusers


@Composable
fun ReservingInfor() {

    Scaffold(content = {

        Column(
            modifier = Modifier
                .padding(it)
        ) {
            Spacer(modifier = Modifier.height(10.dp))

            Text(text = "Booked Infor")

            LazyColumn(
                contentPadding = PaddingValues(8.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
                content = {
                    items(bookingusers) { bookingusers ->
                        BookedRoomInforCard(bookingUser = bookingusers)
                    }
                }

            )

        }
    })
}