package android.maxim.fragmentnavigation2701.fragments

import android.maxim.fragmentnavigation2701.databinding.FragmentMenuBinding
import android.maxim.fragmentnavigation2701.navigator
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class MenuFragment: Fragment() {

    private lateinit var binding: FragmentMenuBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentMenuBinding.inflate(inflater, container, false)
        binding.btnPicture.setOnClickListener { btnPictureClicked() }
        binding.btnText.setOnClickListener { btnTextClicked() }
        binding.btnExit.setOnClickListener { btnExitPressed() }
        return binding.root
    }

    private fun btnPictureClicked() {
        navigator().showPictureScreen()
    }

    private fun btnTextClicked() {
        navigator().showTextScreen()
    }

    private fun btnExitPressed() {
        navigator().backToHomeScreen()
    }
}