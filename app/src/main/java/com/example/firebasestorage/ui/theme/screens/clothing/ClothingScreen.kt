package com.example.firebasestorage.ui.theme.screens.clothing

import android.content.Intent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
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
            title = { Text(text = "Clothing section") },
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
                .padding(20.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            //Row 1
            Row {
                Column {
                    Image(painter = painterResource(id = R.drawable.img_10),
                        contentDescription = "Shirt",
                        modifier = Modifier.size(width = 180.dp, height = 200.dp),)
                    Text(text = "Shirt 1", fontSize = 20.sp)
                    Text(text = "Ksh 680", fontSize = 20.sp, color = Color.LightGray)
                    Row {
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
                        Spacer(modifier = Modifier.width(40.dp))
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
                Spacer(modifier = Modifier.width(20.dp))
                Column {
                    Image(painter = painterResource(id = R.drawable.img_10),
                        contentDescription = "Shirt",
                        modifier = Modifier.size(width = 180.dp, height = 200.dp),)
                    Text(text = "Shirt 1", fontSize = 20.sp)
                    Text(text = "Ksh 680", fontSize = 20.sp, color = Color.LightGray)
                    Row {
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
                        Spacer(modifier = Modifier.width(40.dp))
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
            //End of row 1
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ClothingScreenPreview(){
    com.example.firebasestorage.ui.theme.screens.clothing.ClothingScreen(rememberNavController())
}