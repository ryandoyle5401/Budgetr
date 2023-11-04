package com.example.budgetr.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// Define the typography styles for the application
val Typography = Typography(
  // Body text with a medium size and normal weight
  bodyMedium = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.Normal,
    fontSize = 17.sp,
    lineHeight = 22.sp
  ),
  // Smaller body text with slightly bolder weight for emphasis
  bodySmall = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.SemiBold,
    fontSize = 16.sp,
    lineHeight = 21.sp
  ),
  // Headline text, typically used for titles or headings in content
  headlineMedium = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.Bold,
    fontSize = 20.sp,
    lineHeight = 25.sp
  ),
  // Large title text, for prominent display
  titleLarge = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.Normal,
    fontSize = 28.sp,
    lineHeight = 34.sp
  ),
  // Medium title text, for secondary headings or sub-titles
  titleMedium = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.Normal,
    fontSize = 22.sp,
    lineHeight = 28.sp
  ),
  // Smaller title text, for tertiary headings or smaller sub-titles
  titleSmall = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.Normal,
    fontSize = 20.sp,
    lineHeight = 24.sp
  ),
  // Label text, for small annotations or meta-information
  labelMedium = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.Normal,
    fontSize = 13.sp,
    lineHeight = 18.sp
  )
)
