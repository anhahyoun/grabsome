package com.grabsome.core.designsystem.theme.typography

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.grabsome.core.designsystem.theme.color.color

val typography = GDSTypography(
    headlineSmall = TextStyle(
        color = color.neutral700,
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold,
        lineHeight = 32.sp,
        letterSpacing = 0.sp
    ),
    headlineMedium = TextStyle(
        color = color.neutral700,
        fontSize = 28.sp,
        fontWeight = FontWeight.Bold,
        lineHeight = 36.sp,
        letterSpacing = 0.sp
    ),
    headlineLarge = TextStyle(
        color = color.neutral700,
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold,
        lineHeight = 40.sp,
        letterSpacing = 0.sp
    ),
    titleXSmall = TextStyle(
        color = color.neutral700,
        fontSize = 14.sp,
        fontWeight = FontWeight.Medium,
        lineHeight = 20.sp,
        letterSpacing = 0.1.sp
    ),
    titleSmall = TextStyle(
        color = color.neutral700,
        fontSize = 14.sp,
        fontWeight = FontWeight.Bold,
        lineHeight = 20.sp,
        letterSpacing = 0.1.sp
    ),
    titleMedium = TextStyle(
        color = color.neutral700,
        fontSize = 16.sp,
        fontWeight = FontWeight.Medium,
        lineHeight = 24.sp,
        letterSpacing = 0.15.sp
    ),
    titleLarge = TextStyle(
        color = color.neutral700,
        fontSize = 18.sp,
        fontWeight = FontWeight.Bold,
        lineHeight = 26.sp,
        letterSpacing = 0.sp
    ),
    titleXLarge = TextStyle(
        color = color.neutral700,
        fontSize = 22.sp,
        fontWeight = FontWeight.Bold,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelXXSmall = TextStyle(
        color = color.neutral700,
        fontSize = 10.sp,
        fontWeight = FontWeight.Bold,
        letterSpacing = 0.1.sp
    ),
    labelXSmall = TextStyle(
        color = color.neutral700,
        fontSize = 12.sp,
        fontWeight = FontWeight.Bold,
        letterSpacing = 0.1.sp
    ),
    labelSmall = TextStyle(
        color = color.neutral700,
        fontSize = 14.sp,
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.25.sp
    ),
    labelMedium = TextStyle(
        color = color.neutral700,
        fontSize = 14.sp,
        fontWeight = FontWeight.Bold,
        letterSpacing = 0.25.sp
    ),
    labelLarge = TextStyle(
        color = color.neutral700,
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold,
        letterSpacing = 0.15.sp
    ),
    labelXLarge = TextStyle(
        color = color.neutral700,
        fontSize = 18.sp,
        fontWeight = FontWeight.Bold,
        letterSpacing = 0.15.sp
    ),
    bodyXSmall = TextStyle(
        color = color.neutral700,
        fontSize = 10.sp,
        fontWeight = FontWeight.Normal,
        lineHeight = 14.sp,
        letterSpacing = 0.4.sp
    ),
    bodySmall = TextStyle(
        color = color.neutral700,
        fontSize = 12.sp,
        fontWeight = FontWeight.Normal,
        lineHeight = 16.sp,
        letterSpacing = 0.4.sp
    ),
    bodyMedium = TextStyle(
        color = color.neutral700,
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        lineHeight = 20.sp,
        letterSpacing = 0.25.sp
    ),
    bodyLarge = TextStyle(
        color = color.neutral700,
        fontSize = 16.sp,
        fontWeight = FontWeight.Normal,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
)
