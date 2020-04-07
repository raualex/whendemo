package android.alexkotlinandroidprojects.whendemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name:String = "Atlantic"
        when(name) {
            "Atlantic", "Pacific", "Arctic" ->
                printFullDetailsOfOcean(name)
            "Thames", "Nile", "Mississippi" ->
                Log.i("Found:", "$name is a river")
            "Labrador", "Beagle", "JAck Russel" ->
                Log.i("Found:", "$name is a dog")
            else -> {
                Log.i("Not found:", "$name is not in database")
            }
        }
    }

    fun printFullDetailsOfOcean(name: String) {
        Log.i("Found:", "$name is an ocean")
    }
}
