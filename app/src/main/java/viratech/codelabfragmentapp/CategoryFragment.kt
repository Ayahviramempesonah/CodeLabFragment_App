package viratech.codelabfragmentapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

/**
 * A simple [Fragment] subclass.
 * Use the [CategoryFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CategoryFragment : Fragment(), View.OnClickListener {
    // TODO: Rename and change types of parameters

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_category, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnDtlCategory: Button = view.findViewById(R.id.btn_ctg_lifestyle)
        btnDtlCategory.setOnClickListener(this)

    }

    override fun onClick(p0: View) {

        if (p0.id == R.id.btn_ctg_lifestyle) {

            val mdetailcategoryFragment = DetailCategoryFragment()

            val mbundle = Bundle()
            mbundle.putString(DetailCategoryFragment.EXTRA_NAME, "LifeStyle")
            val description = " kategori ini akan berisi produk lifestyle:"


            mdetailcategoryFragment.arguments = mbundle
            mdetailcategoryFragment.description = description

            val mFragmentmanager = parentFragmentManager
            mFragmentmanager?.beginTransaction()?.apply {
                replace(R.id.frame_layout, mdetailcategoryFragment, DetailCategoryFragment::class.java.simpleName)
                addToBackStack(null)
                commit()

            }

        }


    }


}


