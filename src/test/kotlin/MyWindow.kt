import javafx.application.Application
import javafx.scene.input.KeyCode
import javafx.scene.input.KeyEvent
import org.itheima.kotlin.game.core.Window

class MyWindow: Window(){
    override fun onCreate() {
        TODO("Not yet implemented")
    }

    override fun onDisplay() {
        TODO("Not yet implemented")
    }

    override fun onKeyPressed(event: KeyEvent) {
        TODO("Not yet implemented")

        when(event.code){
            KeyCode.ENTER-> print("enmter")


        }
    }

    override fun onRefresh() {
        TODO("Not yet implemented")
    }

    fun main(args:Array<String>){
        Application.launch(MyWindow::class.java)
    }
}