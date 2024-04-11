package com.example.firebasestorage.ui.theme.screens.clothing

import android.content.Intent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.R

@Composable
fun ClothingScreen(navController: NavHostController){
    Column (modifier = Modifier.fillMaxSize()){
        val mContext = LocalContext.current
        TopAppBar(
            title = { Text(text = "Clothing section", color = Color.White) },
            backgroundColor = Color.Cyan
        )
        //Box
        Box (
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp),
            contentAlignment = Alignment.BottomStart
        ){
            Image(
                painter = painterResource(id = R.drawable.img_7),
                contentDescription = "Newyork",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Column {
                Text(
                    text = "Winter Collection",
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color.White

                    )
                Text(
                    text = "Purchase your product",
                    color = Color.White,
                    fontSize = 15.sp
                )
                Spacer(modifier = Modifier.height(10.dp))
            }
        }
        //End of box
        Column (
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(10.dp),
        ){
            //Row 1
            Row (modifier = Modifier.fillMaxWidth()){
                Card {
                    Column (modifier = Modifier.padding(5.dp)){
                        Box(
                            modifier = Modifier.size(width = 180.dp, height = 200.dp),

                            ){
                            Image(
                                painter = painterResource(id = R.drawable.img_10),
                                contentDescription = "Shirt",
                                contentScale = ContentScale.FillBounds,
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(text = "Shirt 1", fontSize = 20.sp)
                        Text(text = "Ksh 680", fontSize = 20.sp, color = Color.LightGray)
                        Row (Modifier.padding(2.dp)) {
                            OutlinedButton(
                                onClick = {   val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                                },
                                shape = RoundedCornerShape(5.dp),
                                border = BorderStroke(1.dp, Color.Black),
                            ) {
                                Text(text = "PAY", color = Color.Black)
                            }
                            Spacer(modifier = Modifier.width(36.dp))
                            OutlinedButton(
                                onClick = {
                                    val callIntent= Intent(Intent.ACTION_DIAL)
                                    callIntent.data="tel:0791923440".toUri()
                                    mContext.startActivity(callIntent)
                                },
                                shape = RoundedCornerShape(5.dp),
                                border = BorderStroke(1.dp, Color.Black),
                            ) {
                                Text(text = "Call", color = Color.Black)
                            }
                        }
                    }
                }
                Spacer(modifier = Modifier.width(6.dp))
                Card {
                    Column (modifier = Modifier.padding(5.dp)){
                        Box(
                            modifier = Modifier.size(width = 180.dp, height = 200.dp),

                            ){
                            Image(
                                painter = painterResource(id = R.drawable.img_8),
                                contentDescription = "Shirt",
                                contentScale = ContentScale.FillBounds,
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(text = "Shirt 1", fontSize = 20.sp)
                        Text(text = "Ksh 680", fontSize = 20.sp, color = Color.LightGray)
                        Row (Modifier.padding(2.dp)) {
                            OutlinedButton(
                                onClick = {   val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                                },
                                shape = RoundedCornerShape(5.dp),
                                border = BorderStroke(1.dp, Color.Black),
                            ) {
                                Text(text = "PAY", color = Color.Black)
                            }
                            Spacer(modifier = Modifier.width(36.dp))
                            OutlinedButton(
                                onClick = {
                                    val callIntent= Intent(Intent.ACTION_DIAL)
                                    callIntent.data="tel:0791923440".toUri()
                                    mContext.startActivity(callIntent)
                                },
                                shape = RoundedCornerShape(5.dp),
                                border = BorderStroke(1.dp, Color.Black),
                            ) {
                                Text(text = "Call", color = Color.Black)
                            }
                        }
                    }
                }
            }
            //End of row 1
            Spacer(modifier = Modifier.height(6.dp))
            //Row 1
            Row (modifier = Modifier.fillMaxWidth()){
                Card {
                    Column (modifier = Modifier.padding(5.dp)){
                        Box(
                            modifier = Modifier.size(width = 180.dp, height = 200.dp),

                            ){
                            Image(
                                painter = painterResource(id = R.drawable.img_9),
                                contentDescription = "Shirt",
                                contentScale = ContentScale.FillBounds,
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(text = "Shirt 1", fontSize = 20.sp)
                        Text(text = "Ksh 680", fontSize = 20.sp, color = Color.LightGray)
                        Row (Modifier.padding(2.dp)) {
                            OutlinedButton(
                                onClick = {   val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                                },
                                shape = RoundedCornerShape(5.dp),
                                border = BorderStroke(1.dp, Color.Black),
                            ) {
                                Text(text = "PAY", color = Color.Black)
                            }
                            Spacer(modifier = Modifier.width(36.dp))
                            OutlinedButton(
                                onClick = {
                                    val callIntent= Intent(Intent.ACTION_DIAL)
                                    callIntent.data="tel:0791923440".toUri()
                                    mContext.startActivity(callIntent)
                                },
                                shape = RoundedCornerShape(5.dp),
                                border = BorderStroke(1.dp, Color.Black),
                            ) {
                                Text(text = "Call", color = Color.Black)
                            }
                        }
                    }
                }
                Spacer(modifier = Modifier.width(6.dp))
                Card {
                    Column (modifier = Modifier.padding(5.dp)){
                        Box(
                            modifier = Modifier.size(width = 180.dp, height = 200.dp),

                            ){
                            Image(
                                painter = painterResource(id = R.drawable.img_11),
                                contentDescription = "Shirt",
                                contentScale = ContentScale.FillBounds,
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(text = "Shirt 1", fontSize = 20.sp)
                        Text(text = "Ksh 680", fontSize = 20.sp, color = Color.LightGray)
                        Row (Modifier.padding(2.dp)) {
                            OutlinedButton(
                                onClick = {   val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                                },
                                shape = RoundedCornerShape(5.dp),
                                border = BorderStroke(1.dp, Color.Black),
                            ) {
                                Text(text = "PAY", color = Color.Black)
                            }
                            Spacer(modifier = Modifier.width(36.dp))
                            OutlinedButton(
                                onClick = {
                                    val callIntent= Intent(Intent.ACTION_DIAL)
                                    callIntent.data="tel:0791923440".toUri()
                                    mContext.startActivity(callIntent)
                                },
                                shape = RoundedCornerShape(5.dp),
                                border = BorderStroke(1.dp, Color.Black),
                            ) {
                                Text(text = "Call", color = Color.Black)
                            }
                        }
                    }
                }
            }
            //End of row 1
            Spacer(modifier = Modifier.height(6.dp))
            //Row 1
            Row (modifier = Modifier.fillMaxWidth()){
                Card {
                    Column (modifier = Modifier.padding(5.dp)){
                        Box(
                            modifier = Modifier.size(width = 180.dp, height = 200.dp),

                            ){
                            Image(
                                painter = painterResource(id = R.drawable.img_12),
                                contentDescription = "Shirt",
                                contentScale = ContentScale.FillBounds,
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(text = "Shirt 1", fontSize = 20.sp)
                        Text(text = "Ksh 680", fontSize = 20.sp, color = Color.LightGray)
                        Row (Modifier.padding(2.dp)) {
                            OutlinedButton(
                                onClick = {   val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                                },
                                shape = RoundedCornerShape(5.dp),
                                border = BorderStroke(1.dp, Color.Black),
                            ) {
                                Text(text = "PAY", color = Color.Black)
                            }
                            Spacer(modifier = Modifier.width(36.dp))
                            OutlinedButton(
                                onClick = {
                                    val callIntent= Intent(Intent.ACTION_DIAL)
                                    callIntent.data="tel:0791923440".toUri()
                                    mContext.startActivity(callIntent)
                                },
                                shape = RoundedCornerShape(5.dp),
                                border = BorderStroke(1.dp, Color.Black),
                            ) {
                                Text(text = "Call", color = Color.Black)
                            }
                        }
                    }
                }
                Spacer(modifier = Modifier.width(6.dp))
                Card {
                    Column (modifier = Modifier.padding(5.dp)){
                        Box(
                            modifier = Modifier.size(width = 180.dp, height = 200.dp),

                            ){
                            Image(
                                painter = painterResource(id = R.drawable.img_13),
                                contentDescription = "Shirt",
                                contentScale = ContentScale.FillBounds,
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(text = "Shirt 1", fontSize = 20.sp)
                        Text(text = "Ksh 680", fontSize = 20.sp, color = Color.LightGray)
                        Row (Modifier.padding(2.dp)) {
                            OutlinedButton(
                                onClick = {   val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                                },
                                shape = RoundedCornerShape(5.dp),
                                border = BorderStroke(1.dp, Color.Black),
                            ) {
                                Text(text = "PAY", color = Color.Black)
                            }
                            Spacer(modifier = Modifier.width(36.dp))
                            OutlinedButton(
                                onClick = {
                                    val callIntent= Intent(Intent.ACTION_DIAL)
                                    callIntent.data="tel:0791923440".toUri()
                                    mContext.startActivity(callIntent)
                                },
                                shape = RoundedCornerShape(5.dp),
                                border = BorderStroke(1.dp, Color.Black),
                            ) {
                                Text(text = "Call", color = Color.Black)
                            }
                        }
                    }
                }
            }
            //End of row 1
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ClothingScreenPreview(){
    com.example.firebasestorage.ui.theme.screens.clothing.ClothingScreen(rememberNavController())
}