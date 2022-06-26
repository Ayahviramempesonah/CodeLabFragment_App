package viratech.codelabfragmentapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class DetailCategoryFragment : Fragment() {

    var description: String? = null

    companion object {

        var EXTRA_NAME = "extra_name"
        var EXTRA_DESCRIPTION = "extra_description"

    }

    lateinit var tv_satu: TextView
    lateinit var tv_dua: TextView
    lateinit var btnProfile: Button
    lateinit var btnShow: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tv_satu = view.findViewById(R.id.tv_dtl_satu)
        tv_dua = view.findViewById(R.id.tv_dtl_dua)
        btnProfile = view.findViewById(R.id.btn_dtl_satu)
        btnShow = view.findViewById(R.id.btn_dtl_dua)

        btnShow.setOnClickListener {

            val mOptionDialogFragment = OptionDialogFragment()

            val mFragmentManager = childFragmentManager
            mOptionDialogFragment.show(mFragmentManager, OptionDialogFragment::class.java.simpleName)


        }





        if (savedInstanceState != null) {

            val descFromBundle = savedInstanceState.getString(EXTRA_DESCRIPTION)
            description = descFromBundle


        }

        if (arguments != null) {

            val categoryName = arguments?.getString(EXTRA_NAME)
            tv_satu.text = categoryName
            tv_dua.text = description
        }


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_category, container, false)
    }


    internal var optionDialogFragment: OptionDialogFragment.OnOptionDialogListener =
        object : OptionDialogFragment.OnOptionDialogListener {


            override fun onOptionCHosen(text: String?) {
                //val text ="bhddbdjj"
                Toast.makeText(requireActivity(), text, Toast.LENGTH_SHORT).show()
            }
        }


}