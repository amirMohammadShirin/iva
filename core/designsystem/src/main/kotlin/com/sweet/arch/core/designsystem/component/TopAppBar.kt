package com.sweet.arch.core.designsystem.component

import androidx.annotation.StringRes
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.sweet.task.core.designsystem.R
import com.sweet.arch.core.designsystem.icon.AppIcons
import com.sweet.arch.core.designsystem.theme.AppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar(
    @StringRes titleRes: Int? = null,
    title: String? = null,
    navigationIcon: ImageVector? = null,
    navigationIconContentDescription: String = "navigationIconContentDescription",
    actionIcon: ImageVector? = null,
    actionIconContentDescription: String = "actionIconContentDescription",
    modifier: Modifier = Modifier,
    colors: TopAppBarColors = TopAppBarDefaults.centerAlignedTopAppBarColors(
        containerColor = MaterialTheme.colorScheme.primary,
        actionIconContentColor = MaterialTheme.colorScheme.onPrimary,
        titleContentColor = MaterialTheme.colorScheme.onPrimary,
        navigationIconContentColor = MaterialTheme.colorScheme.onPrimary,
        scrolledContainerColor = MaterialTheme.colorScheme.onPrimary
    ),
    onNavigationClick: () -> Unit = {},
    onActionClick: () -> Unit = {},
) {

    CenterAlignedTopAppBar(
        title = {
            ProvideTextStyle(value = MaterialTheme.typography.bodyMedium) {
                Text(
                    text = if (titleRes != null) stringResource(id = titleRes) else title ?: ""
                )
            }
        },
        navigationIcon = {
            navigationIcon?.let {
                IconButton(onClick = onNavigationClick) {
                    Icon(
                        imageVector = it,
                        contentDescription = navigationIconContentDescription
                    )
                }
            }
        },
        actions = {
            actionIcon?.let {
                IconButton(onClick = onActionClick) {
                    Icon(
                        imageVector = it,
                        contentDescription = actionIconContentDescription
                    )
                }
            }
        },
        colors = colors,
        modifier = modifier
            .clip(
                RoundedCornerShape(bottomStart = 10.dp, bottomEnd = 10.dp)
            ),
        scrollBehavior = TopAppBarDefaults.exitUntilCollapsedScrollBehavior()
    )

}

@OptIn(ExperimentalMaterial3Api::class)
@ThemePreviews
@Composable
private fun AppTopAppBarPreview() {
    AppTheme {
        TopAppBar(
            titleRes = R.string.untitled,
            navigationIcon = AppIcons.Add,
            navigationIconContentDescription = "Navigation icon",
            actionIcon = AppIcons.MoreVert,
            actionIconContentDescription = "Action icon",
        )
    }
}

