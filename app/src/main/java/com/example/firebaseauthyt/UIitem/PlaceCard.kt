package com.example.firebaseauthyt.UIitem

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firebaseauthyt.presentation.booking.BookingUser
import com.example.firebaseauthyt.presentation.lecture.Place
import java.text.DecimalFormat

val decimalFormat = DecimalFormat("0.0")


@Composable
fun PlaceContent(place: Place, modifier: Modifier =  Modifier) {

    val rating = place.rating

//    val triple = getPlaceProperties(rating)
//
//    val color = triple.first
//    val text = triple.second
//    val startCount = triple.third

    Column(
        modifier = modifier
            .height(140.dp)
            .padding(8.dp)
    ) {

        // 🔥 This weight pushes price text to bottom
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = place.description,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                overflow = TextOverflow.Ellipsis
            )

            Spacer(modifier = Modifier.height(4.dp))

            Row(verticalAlignment = Alignment.CenterVertically) {
                Surface(
                    shape = RoundedCornerShape(2.dp),
//                    color = color

                ) {
                    Column() {
//                        Text(
//                            modifier = Modifier.padding(2.dp),
//                            text = decimalFormat.format(rating),
//                            fontSize = 12.sp,
//                            color = Color.White
//                        )
                        Text(
                            text = "컴퓨터 유무 : ${place.istherecomputer}",
                            modifier = Modifier.padding(2.dp),
                            fontSize = 12.sp,
                            color = Color.Black
                        )
                        Text(
                            text = "빔프로젝트 유무 : ${place.istherebeamproject}",
                            modifier = Modifier.padding(2.dp),
                            fontSize = 12.sp,
                            color = Color.Black
                        )
                        Text(
                            text = "실험장비 유무 : ${place.istherelabequipment}",
                            modifier = Modifier.padding(2.dp),
                            fontSize = 12.sp,
                            color = Color.Black
                        )
                    }

                }
                Spacer(modifier = Modifier.width(4.dp))
//                Text(text = text, color = color, fontSize = 12.sp)
            }
        }

//        Row {
//            // 🔥 This Spacer with weight pushes price tag to most right of this context
//            Spacer(modifier = Modifier.weight(1f))
//            Text(
//                text = "",
//                color = Color(0xff4CAF50)
//            )
//        }
    }
}

@Composable
fun BookedRoomContent(bookinguser: BookingUser, modifier: Modifier = Modifier) {

//    val rating = place.rating

    Column(
        modifier = modifier
            .height(140.dp)
            .padding(8.dp)
    ) {

        // 🔥 This weight pushes price text to bottom
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = bookinguser.bookedroom,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                overflow = TextOverflow.Ellipsis
            )

            Spacer(modifier = Modifier.height(4.dp))

            Row(verticalAlignment = Alignment.CenterVertically) {
                Surface(
                    shape = RoundedCornerShape(2.dp),
//                    color = color

                ) {
                    Column() {
//
                        Text(
                            text = "예약 날짜 : ${bookinguser.bookingdate}",
                            modifier = Modifier.padding(2.dp),
                            fontSize = 12.sp,
                            color = Color.Black
                        )
                        Text(
                            text = "예약 시간 : ${bookinguser.bookingtime}",
                            modifier = Modifier.padding(2.dp),
                            fontSize = 12.sp,
                            color = Color.Black
                        )
                    }

                }
//                Spacer(modifier = Modifier.width(4.dp))
//                Text(text = text, color = color, fontSize = 12.sp)
            }
        }

    }
}