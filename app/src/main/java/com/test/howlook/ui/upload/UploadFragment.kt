package com.test.howlook.ui.upload

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.test.howlook.R
import com.test.howlook.databinding.FragmentUploadBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [UploadFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class UploadFragment : Fragment() {

    lateinit var fragmentUploadBinding: FragmentUploadBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        fragmentUploadBinding = FragmentUploadBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        fragmentUploadBinding.run {
            scroll.run {
                materialToolbar.run {

                    inflateMenu(R.menu.upload_menu)


                    }
                }
            }
            return fragmentUploadBinding.root
        }


}