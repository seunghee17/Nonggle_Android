package com.example.designsystem.component

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun RowScope.NiaNavigationBarItem(
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    alwaysShowLabel: Boolean = true,
    icon: @Composable () -> Unit,
    selectedIcon: @Composable () -> Unit = icon,
    label: @Composable (() -> Unit)? = null,
) {
    NavigationBarItem(
        selected = selected,
        onClick = onClick,
        icon = if (selected) selectedIcon else icon,
        modifier = modifier,
        enabled = enabled,
        label = label,
        alwaysShowLabel = alwaysShowLabel,
        colors = NavigationBarItemDefaults.colors(
            selectedIconColor = Color.Green,
            unselectedIconColor = Color.Gray,
            selectedTextColor = Color.Green,
            unselectedTextColor = Color.Gray,
            indicatorColor = Color.Green,
        ),
    )
}

@Composable
fun NiaNavigationBar(
    modifier: Modifier = Modifier,
    content: @Composable RowScope.() -> Unit,
) {
    NavigationBar(
        modifier = modifier,
        contentColor = Color.Green,
        tonalElevation = 0.dp,
        content = content,
    )
}

@Preview
@Composable
fun NiaNavigationBarPreview() {
    val items = listOf("For you", "Saved", "Interests")
    val icons = listOf(
        Icons.Filled,
        Icons.Outlined,
        Icons.AutoMirrored,
    )
    val selectedIcons = listOf(
        Icons.Filled,
        Icons.Outlined,
        Icons.AutoMirrored,
    )

    MaterialTheme {
        NiaNavigationBar {
            items.forEachIndexed { index, item ->
                NiaNavigationBarItem(
                    icon = {
                        Icon(
                            imageVector = icons[index] as ImageVector,
                            contentDescription = item,
                        )
                    },
                    selectedIcon = {
                        Icon(
                            imageVector = selectedIcons[index] as ImageVector,
                            contentDescription = item,
                        )
                    },
                    label = { Text(item) },
                    selected = index == 0,
                    onClick = { },
                )
            }
        }
    }
}