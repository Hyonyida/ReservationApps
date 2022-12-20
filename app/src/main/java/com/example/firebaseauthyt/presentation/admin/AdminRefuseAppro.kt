package com.example.firebaseauthyt.presentation.admin

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.unit.dp
import com.example.firebaseauthyt.UIitem.BookedLectureRoomItem
import com.example.firebaseauthyt.UIitem.SelectableSettingGroupItem
import com.example.firebaseauthyt.presentation.lecture.places
import androidx.compose.material3.MaterialTheme
import androidx.compose.foundation.lazy.items

@Composable
fun AdminRefuseAppro(
//    navController: NavController,
    onBackClick: () -> Unit,
) {
    val scaffoldState = rememberScaffoldState()

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "")
                },
                navigationIcon = {
                    IconButton(onClick = {onBackClick()}) {
                        Icon(Icons.Filled.ArrowBack, "backIcon")
                    }
                },
                backgroundColor = MaterialTheme.colorScheme.onSurface,
                contentColor = LightGray,
                elevation = 10.dp
            )
        },
        content = {
            Column(modifier = Modifier
                .padding(it)
            ) {
                Spacer(modifier = Modifier.height(10.dp))
                SelectableSettingGroupItem(
                    title = "Open Door",
                ) {
                }
                Text(text = "Account")

                LazyColumn(
                    contentPadding = PaddingValues(8.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp),
                    content ={
                        items(places) { place ->
                            BookedLectureRoomItem(place= place)
                        }
                    }
                )

            }
        })

}