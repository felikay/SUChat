package com.example.splashscreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.splashscreen.databinding.FragmentSixthBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class SixthFragment : Fragment() {

    private var _binding: FragmentSixthBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSixthBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button2.setOnClickListener {
            findNavController().navigate(R.id.action_SixthFragment_to_FirstFragment)
        }

        binding.buttonThird.setOnClickListener {
            findNavController().navigate(R.id.action_SixthFragment_to_SecondFragment)
        }

        binding.buttonFourth.setOnClickListener {
            findNavController().navigate(R.id.action_SixthFragment_to_ThirdFragment)
        }

        binding.buttonFifth.setOnClickListener {
            findNavController().navigate(R.id.action_SixthFragment_to_FourthFragment)
        }

        binding.buttonSixth.setOnClickListener {
            findNavController().navigate(R.id.action_SixthFragment_to_FifthFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}