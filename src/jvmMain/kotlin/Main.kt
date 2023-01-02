import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.runtime.setValue
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
