package com.test.howlook.ui.myinfo

import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import com.test.howlook.R
import com.test.howlook.databinding.FragmentMyInfoBinding
import com.test.howlook.ui.main.MainActivity

class MyInfoFragment : Fragment() {

    lateinit var fragmentMyInfoBinding: FragmentMyInfoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        fragmentMyInfoBinding = FragmentMyInfoBinding.inflate(layoutInflater)
        val mainActivity = activity as MainActivity

        val builder = AlertDialog.Builder(mainActivity)

        fragmentMyInfoBinding.run {
            logoutText.setOnClickListener {
                builder.run{
                    setTitle("로그아웃")
                    setMessage("정말 로그아웃 하시겠습니까?")
                    setPositiveButton("네"){ dialogInterface: DialogInterface, i: Int ->

                    }
                    setNegativeButton("아니오"){ dialogInterface: DialogInterface, i: Int ->

                    }
                    setNeutralButton("닫기"){ dialogInterface: DialogInterface, i: Int ->

                    }
                }.show()

            }

            deleteText.setOnClickListener {
                builder.run{
                    setTitle("회원탈퇴")
                    setMessage("정말 탈퇴 하시겠습니까?")
                    setPositiveButton("네"){ dialogInterface: DialogInterface, i: Int ->

                    }
                    setNegativeButton("아니오"){ dialogInterface: DialogInterface, i: Int ->

                    }
                    setNeutralButton("닫기") { dialogInterface: DialogInterface, i: Int ->
                    }
                }.show()

            }

            updateText.setOnClickListener {
                mainActivity.replaceFragment(UpdateMyInfoFragment())
            }
        }

        return fragmentMyInfoBinding.root
    }


}