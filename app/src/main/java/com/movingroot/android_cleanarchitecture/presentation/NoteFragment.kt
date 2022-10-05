package com.movingroot.android_cleanarchitecture.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.movingroot.android_cleanarchitecture.databinding.FragmentNoteBinding
import com.movingroot.android_cleanarchitecture.presentation.base.BaseFragment

class NoteFragment : BaseFragment() {
    private var _binding: FragmentNoteBinding? = null
    private val binding: FragmentNoteBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentNoteBinding.inflate(inflater, container, false)
            .apply {

            }

        return binding.root
    }
}