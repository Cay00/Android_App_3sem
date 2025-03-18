package com.example.labproject.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.labproject.R
import com.example.labproject.utils.Routes

@Composable
fun LoginPage(navController: NavController) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo aplikacji",
            modifier = Modifier.size(175.dp)
        )

        Spacer(modifier = Modifier.height(21.dp))

        Text(
            text = "Sign In",
            textAlign = TextAlign.Left,
            style = MaterialTheme.typography.bodyLarge.copy(
                fontWeight = FontWeight.W700,
                fontSize = 40.sp,
                color = Color(0xFF6200EE)
            ),
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(46.dp))

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email or Username") },
            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_email),
                    contentDescription = "Confirm Password Icon",
                    modifier = Modifier.size(25.dp),
                    tint = Color(0xFF471AA0)
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .border(2.dp, Color(0xFF6200EE), RoundedCornerShape(8.dp))
        )

        Spacer(modifier = Modifier.height(40.dp))

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password") },
            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_lock),
                    contentDescription = "Confirm Password Icon",
                    modifier = Modifier.size(25.dp),
                    tint = Color(0xFF471AA0)
                )
            },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier
                .fillMaxWidth()
                .border(2.dp, Color(0xFF6200EE), RoundedCornerShape(8.dp))
        )

        Spacer(modifier = Modifier.height(40.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            Text(
                text = "Forget Password?",
                textAlign = TextAlign.Right,
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontWeight = FontWeight.W700,
                    fontSize = 15.sp,
                    color = Color(0xFF471AA0)
                ),
                modifier = Modifier
                    .clickable { navController.navigate(Routes.registerPage) } // Navigate to login page
            )
        }

        Spacer(modifier = Modifier.height(40.dp))

        // Sign Up Button
        Button(
            onClick = { navController.navigate(Routes.registerPage) },
            modifier = Modifier
                .fillMaxWidth()
                .height(55.dp)
            //.clip(RoundedCornerShape(1.dp))
        ) {
            Text(
                text = "Sign In",
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontWeight = FontWeight.W700,
                    fontSize = 15.sp,
                    color = Color(0xFFFFFFFF)
                )
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(horizontalArrangement = Arrangement.Center) {
            Button(onClick = { /* TODO: Implement Google login */ }) {
                Text(text = "Google")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = { /* TODO: Implement Facebook login */ }) {
                Text(text = "Facebook")
            }
        }
    }
}
