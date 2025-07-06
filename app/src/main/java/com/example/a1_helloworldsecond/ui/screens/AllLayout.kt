package com.example.a1_helloworldsecond.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.geometry.Offset
import com.example.a1_helloworldsecond.R

object AppColors {
    val color_Main_Shadow = Color(0xFF003A3C) // use your desired color
}



@Composable
fun AllLayout(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 440.dp)
            .requiredHeight(height = 956.dp)
            .background(brush = Brush.linearGradient(
                0.07f to Color(0xff929b9b),
                0.37f to Color(0xffe4f2f3),
                1f to Color(0xff848c8d),
                start = Offset(0f, 13f),
                end = Offset(385.5f, 935f)))
    ) {
        Button(
            onClick = { },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xffd9d9d9)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 348.dp,
                    y = 48.dp)
                .requiredWidth(width = 27.dp)
                .requiredHeight(height = 33.dp)
                .rotate(degrees = 6.88f)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 27.dp)
                    .requiredHeight(height = 33.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.magnifier_icon),
                    contentDescription = "Subtract",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 0.06.dp)
                        .requiredSize(size = 26.dp))
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 20.79.dp,
                            y = 22.61.dp)
                        .requiredWidth(width = 2.dp)
                        .requiredHeight(height = 11.dp)
                        .rotate(degrees = -34.54f)
                        .background(color = Color(0xffd9d9d9)))
            }
        }
        Text(
            text = "Search",
            color = Color(0xffc7c7c7),
            style = TextStyle(
                fontSize = 16.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 58.dp,
                    y = 56.dp))
        Button(
            onClick = { },
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xff003a3c)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 31.dp,
                    y = 34.dp)
                .requiredWidth(width = 61.dp)
                .requiredHeight(height = 372.dp)
                .rotate(degrees = 90f)){ }
        Button(
            onClick = { },
            shape = RoundedCornerShape(27.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xff003a3c)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 96.dp,
                    y = 307.dp)
                .requiredWidth(width = 248.dp)
                .requiredHeight(height = 356.dp)){ }
        TextButton(
            onClick = { },
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xffd9d9d9)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 129.dp,
                    y = 328.dp)
                .requiredWidth(width = 180.dp)
                .requiredHeight(height = 50.dp)){ }
        Text(
            text = "Hello World!",
            color = Color(0xff003a3c),
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 154.dp,
                    y = 342.dp))
        TextButton(
            onClick = { },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xffd9d9d9)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 129.dp,
                    y = 409.dp)
                .requiredWidth(width = 180.dp)
                .requiredHeight(height = 36.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 180.dp)
                    .requiredHeight(height = 36.dp)
            ) {
                OutlinedButton(
                    onClick = { },
                    shape = RoundedCornerShape(25.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xffd9d9d9)),
                    border = BorderStroke(2.dp, AppColors.color_Main_Shadow),
                    modifier = Modifier
                        .requiredWidth(width = 180.dp)
                        .requiredHeight(height = 36.dp)){ }
                Text(
                    text = "Nothing to see",
                    color = AppColors.color_Main_Shadow,
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 12.40694808959961.sp,
                        fontWeight = FontWeight.Light),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 45.dp,
                            y = 10.dp))
            }
        }
        TextButton(
            onClick = { },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xffd9d9d9)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 129.dp,
                    y = 457.dp)
                .requiredWidth(width = 180.dp)
                .requiredHeight(height = 36.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 180.dp)
                    .requiredHeight(height = 36.dp)
            ) {
                OutlinedButton(
                    onClick = { },
                    shape = RoundedCornerShape(25.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xffd9d9d9)),
                    border = BorderStroke(2.dp, AppColors.color_Main_Shadow),
                    modifier = Modifier
                        .requiredWidth(width = 180.dp)
                        .requiredHeight(height = 36.dp)){ }
                Text(
                    text = "Just an experiment",
                    color = AppColors.color_Main_Shadow,
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 12.40694808959961.sp,
                        fontWeight = FontWeight.Light),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 30.dp,
                            y = 10.dp))
            }
        }
        TextButton(
            onClick = { },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xffd9d9d9)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 129.dp,
                    y = 505.dp)
                .requiredWidth(width = 180.dp)
                .requiredHeight(height = 36.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 180.dp)
                    .requiredHeight(height = 36.dp)
            ) {
                OutlinedButton(
                    onClick = { },
                    shape = RoundedCornerShape(25.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xffd9d9d9)),
                    border = BorderStroke(2.dp, AppColors.color_Main_Shadow),
                    modifier = Modifier
                        .requiredWidth(width = 180.dp)
                        .requiredHeight(height = 36.dp)){ }
                Text(
                    text = "About how to design",
                    color = AppColors.color_Main_Shadow,
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 12.40694808959961.sp,
                        fontWeight = FontWeight.Light),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 25.dp,
                            y = 10.dp))
            }
        }
        TextButton(
            onClick = { },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xffd9d9d9)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 129.dp,
                    y = 553.dp)
                .requiredWidth(width = 180.dp)
                .requiredHeight(height = 36.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 180.dp)
                    .requiredHeight(height = 36.dp)
            ) {
                OutlinedButton(
                    onClick = { },
                    shape = RoundedCornerShape(25.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xffd9d9d9)),
                    border = BorderStroke(2.dp, AppColors.color_Main_Shadow),
                    modifier = Modifier
                        .requiredWidth(width = 180.dp)
                        .requiredHeight(height = 36.dp)){ }
                Text(
                    text = "In this Android Studio",
                    color = AppColors.color_Main_Shadow,
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 12.40694808959961.sp,
                        fontWeight = FontWeight.Light),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 25.dp,
                            y = 10.dp))
            }
        }
        TextButton(
            onClick = { },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xffd9d9d9)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 205.dp,
                    y = 612.dp)
                .requiredWidth(width = 123.dp)
                .requiredHeight(height = 27.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 123.dp)
                    .requiredHeight(height = 27.dp)
            ) {
                Button(
                    onClick = { },
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xffd9d9d9)),
                    modifier = Modifier
                        .requiredWidth(width = 123.dp)
                        .requiredHeight(height = 27.dp)){ }
                Text(
                    text = "Next Chapter >",
                    color = Color(0xff003a3c),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 12.40694808959961.sp),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 13.dp,
                            y = 6.dp))
            }
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 180.dp,
                    y = 799.dp)
                .requiredSize(size = 80.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 80.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color.White)
                    .border(border = BorderStroke(7.dp, Color(0xff023e3f)),
                        shape = CircleShape))
            Image(
                painter = painterResource(id = R.drawable.home_icon),
                contentDescription = "Group 1",
                colorFilter = ColorFilter.tint(Color(0xff023e3f)),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 14.dp,
                        y = 11.dp)
                    .requiredWidth(width = 53.dp)
                    .requiredHeight(height = 50.dp))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 31.dp,
                    y = 860.dp)
                .requiredWidth(width = 178.dp)
                .requiredHeight(height = 49.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.home_left),
                contentDescription = "Intersect",
                colorFilter = ColorFilter.tint(Color(red=0,green=58,blue=60)),
                modifier = Modifier
                    .requiredWidth(width = 178.dp)
                    .requiredHeight(height = 49.dp))
            Text(
                text = "Chapter",
                color = Color.White,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 36.dp,
                        y = 13.dp))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 229.89.dp,
                    y = 860.dp)
                .requiredWidth(width = 178.dp)
                .requiredHeight(height = 49.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.home_right),
                contentDescription = "Intersect",
                colorFilter = ColorFilter.tint(Color(red=0,green=58,blue=60)),
                modifier = Modifier
                    .requiredWidth(width = 178.dp)
                    .requiredHeight(height = 49.dp))
            Text(
                text = "One",
                color = Color.White,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 70.11.dp,
                        y = 13.dp))
        }
    }
}

@Preview(widthDp = 440, heightDp = 956)
@Composable
private fun AllLayoutPreview() {
    AllLayout(Modifier)
}