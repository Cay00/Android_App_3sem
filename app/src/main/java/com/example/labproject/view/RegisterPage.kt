package com.example.labproject.view

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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.labproject.R
import com.example.labproject.utils.Routes

@Composable
fun RegisterPage(navController: NavController) {
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Back button
        Text(text = "< Back",
            textAlign = TextAlign.Left,
            style = MaterialTheme.typography.bodyLarge.copy(
                fontSize = 15.sp, color = Color(0xFF471AA0)
            ),
            modifier = Modifier
                .fillMaxWidth()
                .clickable { navController.popBackStack() } // This navigates to the previous screen
        )

        Spacer(modifier = Modifier.height(46.dp))

        // Title
        Text(
            text = "Sign Up",
            textAlign = TextAlign.Left,
            style = MaterialTheme.typography.bodyLarge.copy(
                fontWeight = FontWeight.W700, fontSize = 30.sp, color = Color(0xFF6200EE)
            ),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(46.dp))


        // Full Name
        OutlinedTextField(
            value = email,
            onValueChange = { name = it },
            label = { Text("Full Name") },
            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_user),
                    contentDescription = "User Icon",
                    modifier = Modifier.size(25.dp),
                    tint = Color(0xFF471AA0)
                )
            },
            shape = RoundedCornerShape(15.dp),
            modifier = Modifier.fillMaxWidth(),
        )

        Spacer(modifier = Modifier.height(40.dp))

        // Username
        OutlinedTextField(value = email,
            onValueChange = { email = it },
            label = { Text("Username") },
            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_email),
                    contentDescription = "Username Icon",
                    modifier = Modifier.size(25.dp),
                    tint = Color(0xFF471AA0)

                )
            },
            shape = RoundedCornerShape(15.dp),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(40.dp))

        // Password
        OutlinedTextField(value = password,
            onValueChange = { password = it },
            label = { Text("Password") },
            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_lock),
                    contentDescription = "Password Icon",
                    modifier = Modifier.size(25.dp),
                    tint = Color(0xFF471AA0)
                )
            },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier
                .fillMaxWidth()
                .border(2.dp, Color(0xFF9747FF), RoundedCornerShape(15.dp))
        )

        Spacer(modifier = Modifier.height(40.dp))

        // Confirm Password
        OutlinedTextField(value = password,
            onValueChange = { confirmPassword = it },
            label = { Text("Confirm Password") },
            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_lock),
                    contentDescription = "Password Icon",
                    modifier = Modifier.size(25.dp),
                    tint = Color(0xFF471AA0)
                )
            },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier
                .fillMaxWidth()
                .border(2.dp, Color(0xFF9747FF), RoundedCornerShape(15.dp))
        )


        Spacer(modifier = Modifier.height(80.dp))

        // Sign Up Button
        Button(
            onClick = { navController.navigate(Routes.loginPage) },
            modifier = Modifier
                .fillMaxWidth()
                .height(55.dp)
            //.clip(RoundedCornerShape(1.dp))
        ) {
            Text(
                text = "Sign Up", style = MaterialTheme.typography.bodyLarge.copy(
                    fontWeight = FontWeight.W700, fontSize = 15.sp, color = Color(0xFFFFFFFF)
                )
            )
        }

        Spacer(modifier = Modifier.height(40.dp))

        // Sign In Text Link
        Row(
            modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Already have an account?",
                textAlign = TextAlign.Left,
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontWeight = FontWeight.W400, fontSize = 15.sp, color = Color(0xFF471AA0)
                )
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Sign In",
                textAlign = TextAlign.Left,
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontWeight = FontWeight.W700, fontSize = 15.sp, color = Color(0xFF471AA0)
                ),
                modifier = Modifier.clickable { navController.navigate(Routes.loginPage) } // Navigate to login page
            )
        }
    }
}
