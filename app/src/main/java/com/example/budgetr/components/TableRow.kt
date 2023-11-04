package com.example.budgetr.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color // <- Import for Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.budgetr.ui.theme.Destructive
import com.example.budgetr.ui.theme.TextPrimary
import com.example.budgetr.ui.theme.Typography
import com.example.budgetr.R

@Composable
fun TableRow(
  modifier: Modifier = Modifier,
  label: String? = null,
  hasArrow: Boolean = false,
  isDestructive: Boolean = false,
  labelColor: Color = TextPrimary, // Add this line
  detailContent: (@Composable RowScope.() -> Unit)? = null,
  content: (@Composable RowScope.() -> Unit)? = null
) {
  val textColor = labelColor.takeIf { it != Color.Unspecified } ?: (if (isDestructive) Destructive else TextPrimary)

  Row(
    modifier = modifier.fillMaxWidth(),
    horizontalArrangement = Arrangement.SpaceBetween,
    verticalAlignment = Alignment.CenterVertically,
  ) {
    if (label != null) {
      Text(
        text = label,
        style = Typography.bodyMedium,
        color = textColor,
        modifier = Modifier.padding(horizontal = 16.dp, vertical = 10.dp)
      )
    }
    if (content != null) {
      content()
    }
    if (hasArrow) {
      Icon(
        painterResource(id = R.drawable.chevron_right),
        contentDescription = "Right arrow",
        modifier = Modifier.padding(horizontal = 16.dp, vertical = 10.dp)
      )
    }
    if (detailContent != null) {
      detailContent()
    }
  }
}

