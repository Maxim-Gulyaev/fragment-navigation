package android.maxim.fragmentnavigation2701

import androidx.fragment.app.Fragment

fun Fragment.navigator(): Navigator {
    return requireActivity() as Navigator
}

interface Navigator {

    fun showPictureScreen()

    fun showTextScreen()

    fun backToMenuScreen()

    fun backToHomeScreen()
}