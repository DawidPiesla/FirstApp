package com.example.firstapp

import androidx.compose.ui.graphics.vector.ImageVector

data class DrawerItem(

    val icon: ImageVector,
    val option: String,
    val count: Int,
    val hasCount: Boolean
)
