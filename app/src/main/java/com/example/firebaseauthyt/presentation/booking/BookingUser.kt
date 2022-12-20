package com.example.firebaseauthyt.presentation.booking

class BookingUser(
    val id: Long,
    val name :String,
    var bookingdate : String,
    var bookingtime : String,
    var bookedroom : String,
) {
}

var bookingusers = listOf(
    BookingUser(1,"김요한","2022-12-03","16:00-17:00","A13-425")
)