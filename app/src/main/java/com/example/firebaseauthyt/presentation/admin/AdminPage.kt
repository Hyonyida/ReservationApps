package com.example.firebaseauthyt.presentation.admin

sealed class AdminPage(val route: String) {

    object AdminRefuseAppro : AdminPage("Admin_RefuseAppro")

    object LectureRoomManage : AdminPage("LectureRoom_Manage")
}