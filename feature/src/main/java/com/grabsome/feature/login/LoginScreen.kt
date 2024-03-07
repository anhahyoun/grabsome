package com.grabsome.feature.login

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.grabsome.core.designsystem.R
import com.grabsome.core.designsystem.theme.color.color
import com.grabsome.core.designsystem.theme.typography.typography

@Composable
fun LoginRoute() {
    LoginScreen()
}

@Composable
fun LoginScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 40.dp, start = 16.dp, end = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            imageVector = ImageVector.vectorResource(R.drawable.horizontal_grabsome_logo),
            contentDescription = ""
        )
        Spacer(modifier = Modifier.height(24.dp))
        Image(
            modifier = Modifier.fillMaxWidth(),
            imageVector = ImageVector.vectorResource(R.drawable.ic_custom_area),
            contentDescription = ""
        )
        Spacer(modifier = Modifier.height(24.dp))
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "안녕하세요\n그랩썸입니다",
            style = typography.headlineLarge,
            color = color.neutral900
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "그랩썸 회원이 되고 만남의 자리를 훨씬 쉽게 모집하고 관리해보세요!",
            style = typography.bodyLarge,
            color = color.neutral300
        )
        Spacer(modifier = Modifier.height(24.dp))
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { /*TODO*/ },
            colors = ButtonColors(
                containerColor = Color(0xFFFEE500),
                contentColor = Color.Black,
                disabledContainerColor = color.neutral100,
                disabledContentColor = color.neutral700
            ),
            contentPadding = PaddingValues(vertical = 16.dp),
            shape = RoundedCornerShape(12.dp)
        ) {
            Image(
                modifier = Modifier.size(24.dp),
                imageVector = ImageVector.vectorResource(R.drawable.ic_kakao),
                contentDescription = "카카오 시작하기"
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "카카오 시작하기", style = typography.titleLarge)
        }
        Spacer(modifier = Modifier.height(8.dp))
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { /*TODO*/ },
            colors = ButtonColors(
                containerColor = Color.White,
                contentColor = Color.Black,
                disabledContainerColor = color.neutral100,
                disabledContentColor = color.neutral700
            ),
            border = BorderStroke(1.dp, color.neutral100),
            contentPadding = PaddingValues(vertical = 16.dp),
            shape = RoundedCornerShape(12.dp)
        ) {
            Image(
                modifier = Modifier.size(24.dp),
                imageVector = ImageVector.vectorResource(R.drawable.ic_google),
                contentDescription = "Google로 시작하기"
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Google로 시작하기", style = typography.titleLarge)
        }
        Spacer(modifier = Modifier.height(8.dp))
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { /*TODO*/ },
            colors = ButtonColors(
                containerColor = Color.Black,
                contentColor = Color.White,
                disabledContainerColor = color.neutral100,
                disabledContentColor = color.neutral700
            ),
            contentPadding = PaddingValues(vertical = 16.dp),
            shape = RoundedCornerShape(12.dp)
        ) {
            Image(
                modifier = Modifier.size(24.dp),
                imageVector = ImageVector.vectorResource(R.drawable.ic_apple),
                contentDescription = "Apple로 시작하기",
                colorFilter = ColorFilter.tint(Color.White)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Apple로 시작하기", style = typography.titleLarge)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}