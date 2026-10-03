package com.au.pertemuan3

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TugasLogin() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {

        Image(
            painter = painterResource(id = R.drawable.bg),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 45.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "Login",
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue
            )

            Text(
                text = "Ini adalah halaman login",
                fontSize = 20.sp,
                color = Color.Black
            )

            Spacer(modifier = Modifier.height(60.dp))

            Image(
                painter = painterResource(id = R.drawable.logo_umy),
                contentDescription = null,
                modifier = Modifier.size(150.dp),
                contentScale = ContentScale.Fit
            )

            Spacer(modifier = Modifier.height(60.dp))

            Text(
                text = "Nama",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Red
            )

            Text(
                text = "Alvin Wahyu Pratama",
                fontSize = 21.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue
            )

            Text(
                text = "20240140259",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )

            Spacer(modifier = Modifier.height(25.dp))

            Box(
                modifier = Modifier
                    .size(460.dp)
                    .clip(CircleShape)
                    .border(
                        width = 5.dp,
                        color = Color.White,
                        shape = CircleShape
                    ),
                contentAlignment = Alignment.Center
            ) {


            }
        }
    }
}