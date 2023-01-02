import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    var onSizeChangeLog by remember { mutableStateOf("") }
    Window(onCloseRequest = ::exitApplication) {
        Surface(modifier = Modifier.fillMaxSize().onSizeChanged {
            onSizeChangeLog += "$it \n"
        }) {
            Text(onSizeChangeLog)
        }
    }
}
