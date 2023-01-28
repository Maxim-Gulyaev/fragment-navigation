package android.maxim.fragmentnavigation2701.fragments

import android.maxim.fragmentnavigation2701.databinding.FragmentPictureBinding
import android.maxim.fragmentnavigation2701.navigator
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class PictureFragment: Fragment() {

    private lateinit var binding: FragmentPictureBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPictureBinding.inflate(inflater, container, false)
        binding.btnBack.setOnClickListener { backToMenu() }
        return binding.root
    }

    private fun backToMenu() {
        navigator().backToHomeScreen()
    }
}