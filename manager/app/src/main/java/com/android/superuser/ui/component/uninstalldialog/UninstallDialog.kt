package com.android.superuser.ui.component.uninstalldialog

import androidx.compose.runtime.Composable
import com.android.superuser.ui.LocalUiMode
import com.android.superuser.ui.UiMode

@Composable
fun UninstallDialog(
    show: Boolean,
    onDismissRequest: () -> Unit
) {
    when (LocalUiMode.current) {
        UiMode.Miuix -> UninstallDialogMiuix(show, onDismissRequest)
        UiMode.Material -> UninstallDialogMaterial(show, onDismissRequest)
    }
}
