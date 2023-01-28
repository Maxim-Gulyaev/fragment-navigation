package android.maxim.fragmentnavigation2701

import android.maxim.fragmentnavigation2701.databinding.ActivityMainBinding
import android.maxim.fragmentnavigation2701.fragments.MenuFragment
import android.maxim.fragmentnavigation2701.fragments.PictureFragment
import android.maxim.fragmentnavigation2701.fragments.TextFragment
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity(), Navigator {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }

        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragment_container, MenuFragment())
                .commit()
        }
    }

    override fun showPictureScreen() {
        launchFragment(PictureFragment())
    }

    override fun showTextScreen() {
        launchFragment(TextFragment())
    }

    override fun backToHomeScreen() {
        onBackPressedDispatcher.onBackPressed()
    }

    override fun backToMenuScreen() {
        supportFragmentManager.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE)
    }

    private fun launchFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .addToBackStack(null)
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}