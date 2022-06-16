package viratech.codelabfragmentapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import androidx.fragment.app.DialogFragment


class OptionDialogFragment : DialogFragment(){
    
    lateinit var rbSatu : RadioButton
    lateinit var rbDua : RadioButton
    lateinit var rbTiga : RadioButton
    lateinit var rbEmpat : RadioButton
    lateinit var rbLima: RadioButton
    lateinit var btPilih : Button
    lateinit var btClose : Button
     var optionDialogListener : OnOptionDialogListener?  = null





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

  //      btPilih = view.findViewById(R.id.btn_choose)
  //      btClose = view.findViewById(R.id.btn_close)
    //    rbSatu = view.findViewById(R.id.rd_satu)
      //  rbDua = view.findViewById(R.id.rd_dua)
        //rbTiga = view.findViewById(R.id.rd_tiga)
        //rbEmpat = view.findViewById(R.id.rd_empat)
        //rbLima = view.findViewById(R.id.rd_lima)

        btPilih.setOnClickListener{
            val checkedRadioButtonId = rbSatu.checkedRadioButtonId

            if ( checkedRadioButtonId != -1 ){

            }


        }



    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_option_dialog, container, false)
    }


}

interface OnOptionDialogListener {

}
