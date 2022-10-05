package com.movingroot.android_cleanarchitecture.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.movingroot.android_cleanarchitecture.R
import com.movingroot.android_cleanarchitecture.databinding.FragmentListBinding
import com.movingroot.android_cleanarchitecture.presentation.base.BaseFragment

class ListFragment : BaseFragment() {

    private var _binding: FragmentListBinding? = null
    private val binding: FragmentListBinding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentListBinding.inflate(inflater, container, false)
            .apply {

            }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNewNote.setOnClickListener {
            goToNote()
        }
    }

    private fun goToNote(id: Long = 0L) {
        val action = ListFragmentDirections.actionFromListToNote(noteId = id)
        Navigation.findNavController(binding.noteListView).navigate(action)
    }
}