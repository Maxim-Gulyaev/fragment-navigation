package android.maxim.fragmentnavigation2701.fragments

import android.maxim.fragmentnavigation2701.databinding.FragmentTextBinding
import android.maxim.fragmentnavigation2701.navigator
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.github.javafaker.Faker

class TextFragment: Fragment() {

    private lateinit var binding: FragmentTextBinding
    private val faker = Faker.instance()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTextBinding.inflate(inflater, container, false)
        binding.textView.text = createQuote()
        binding.btnBack.setOnClickListener { backToMenu() }
        return binding.root
    }

    private fun backToMenu() {
        navigator().backToMenuScreen()
    }

    private fun createQuote(): String {
        return faker.lebowski().quote()
    }
}