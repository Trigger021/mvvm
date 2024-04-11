package com.example.firebasestorage.ui.theme.screens.dashboard


import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.R
import com.example.firebasestorage.navigation.ROUT_CLOTHING

@Composable
fun DashboardScreen(navController: NavHostController){
    Column (
        modifier = Modifier.fillMaxSize()
    ) {
        //TopAppBar
        TopAppBar(
            title = { Text(text = "Amazon Shop", color = Color.White)},
            backgroundColor = Color.Cyan
        )
        //End of top app bar
        Spacer(modifier = Modifier.height(30.dp))
        //Start of row
        Row (modifier = Modifier.padding(start = 20.dp)) {
            Column {
                Text(
                    text = "Amazon",
                    fontSize = 30.sp,
                    color = Color.Cyan,
                    fontFamily = FontFamily.Serif, )
                Text(text = "Shop from A to Z")
            }
            Spacer(modifier = Modifier.width(80.dp))
            Image(
                painter = painterResource(id = R.drawable.img),
                contentDescription = "amazon",
                modifier = Modifier.size(100.dp))
        }
        //End of row
        //Scrollable column
        Column (modifier = Modifier.padding(start = 20.dp)) {
            //Row1
            Row {
                Card (
                    modifier = Modifier
                        .size(width = 160.dp, height = 120.dp).clickable{navController.navigate(ROUT_CLOTHING)},
                    elevation = 10.dp,
                ){
                    Column (modifier = Modifier.padding(15.dp)){
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.img_1),
                                contentDescription = "amazon",
                                modifier = Modifier.size(50.dp))
                        }
                        Text(
                            text = "Clothing",
                            fontSize = 20.sp,
                            color = Color.Cyan,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                    }
                }
                Spacer(modifier = Modifier.width(40.dp))
                Card (
                    modifier = Modifier
                        .size(width = 160.dp, height = 120.dp),
                    elevation = 10.dp
                ){
                    Column (modifier = Modifier.padding(15.dp)){
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.img_2),
                                contentDescription = "amazon",
                                modifier = Modifier.size(50.dp))
                        }
                        Text(
                            text = "Electronics",
                            fontSize = 20.sp,
                            color = Color.Cyan,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
            //End of row 1
            Spacer(modifier = Modifier.height(20.dp))
            //Row2
            Row {
                Card (
                    modifier = Modifier
                        .size(width = 160.dp, height = 120.dp),
                    elevation = 10.dp
                ){
                    Column (modifier = Modifier.padding(15.dp)){
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.img_3),
                                contentDescription = "amazon",
                                modifier = Modifier.size(50.dp))
                        }
                        Text(
                            text = "Home",
                            fontSize = 20.sp,
                            color = Color.Cyan,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                    }
                }
                Spacer(modifier = Modifier.width(40.dp))
                Card (
                    modifier = Modifier
                        .size(width = 160.dp, height = 120.dp),
                    elevation = 10.dp
                ){
                    Column (modifier = Modifier.padding(15.dp)){
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.img_4),
                                contentDescription = "amazon",
                                modifier = Modifier.size(50.dp))
                        }
                        Text(
                            text = "Beauty",
                            fontSize = 20.sp,
                            color = Color.Cyan,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
            //End of row 2
            Spacer(modifier = Modifier.height(20.dp))
            //Row1
            Row {
                Card (
                    modifier = Modifier
                        .size(width = 160.dp, height = 120.dp),
                    elevation = 10.dp
                ){
                    Column (modifier = Modifier.padding(15.dp)) {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.img_5),
                                contentDescription = "amazon",
                                modifier = Modifier.size(50.dp))
                        }
                        Text(
                            text = "Pharmacy",
                            fontSize = 20.sp,
                            color = Color.Cyan,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                    }
                }
                Spacer(modifier = Modifier.width(40.dp))
                Card (
                    modifier = Modifier
                        .size(width = 160.dp, height = 120.dp),
                    elevation = 10.dp
                ){
                    Column (modifier = Modifier.padding(15.dp)){
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.img_6),
                                contentDescription = "amazon",
                                modifier = Modifier.size(50.dp))
                        }
                        Text(
                            text = "Groceries",
                            fontSize = 20.sp,
                            color = Color.Cyan,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
            //End of row 1
            Spacer(modifier = Modifier.height(20.dp))
        }//End of scrollable column
    }
}

@Preview(showBackground = true)
@Composable
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())
}