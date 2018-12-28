package academy_sdk

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity

class EntryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entry)
        showAuth()
    }

    private fun showAuth() {
        val fragment = AuthFragment()
        supportFragmentManager.beginTransaction()
                .add(R.id.entry_container, fragment)
                .addToBackStack(null)
                .commit()
    }

    private fun showMain() {
        // TODO(“show main fragment”)
    }
}

class AuthFragment : Fragment() {

    fun onAuthSuccess(){
        // TODO(“show main fragment”)
    }
}

class MainFragment : Fragment()