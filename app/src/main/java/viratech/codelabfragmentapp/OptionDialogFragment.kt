package viratech.codelabfragmentapp

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.fragment.app.DialogFragment


class OptionDialogFragment : DialogFragment(){
    
    lateinit var rdGroup : RadioGroup
    lateinit var rbSatu : RadioButton
    lateinit var rbDua : RadioButton
    lateinit var rbTiga : RadioButton
    lateinit var rbEmpat: RadioButton
    lateinit var btPilih : Button
    lateinit var btClose : Button
     private var optionDialogListener : OnOptionDialogListener?  = null





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

       btPilih = view.findViewById(R.id.btn_choose)
       btClose = view.findViewById(R.id.btn_close)
       rdGroup= view.findViewById(R.id.rd_group)
        rbSatu = view.findViewById(R.id.rb_satu)
        rbDua = view.findViewById(R.id.rb_dua)
        rbTiga = view.findViewById(R.id.rb_tiga)
        rbEmpat = view.findViewById(R.id.rb_empat)

        btPilih.setOnClickListener{
            val checkedRadioButtonId = rdGroup.checkedRadioButtonId

           if ( checkedRadioButtonId != -1 ){

               var coach : String? = when (checkedRadioButtonId){

                   R.id.rb_satu -> rbSatu.text.toString().trim()

                   R.id.rb_dua -> rbDua.text.toString().trim()

                   R.id.rb_tiga -> rbTiga.text.toString().trim()

                   R.id.rb_empat -> rbEmpat.text.toString().trim()

                   else -> null
               }

                optionDialogListener?.onOptionCHosen(coach)
               dialog?.dismiss()
            }


        }


btClose.setOnClickListener{
    dialog?.cancel()
}
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_option_dialog, container, false)
    }
    interface OnOptionDialogListener {


        fun onOptionCHosen(text:String?)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        val fragment = parentFragment
        if (fragment is DetailCategoryFragment){


            // error disini fragment.optionDialogListener
          //   this.optionDialogListener = fragment.optionDialogListener


        }



    }


    override fun onDetach() {
        super.onDetach()

        this.optionDialogListener = null



    }


}

