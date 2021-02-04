package com.example.pdm.payment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.craftman.cardform.Card
import com.craftman.cardform.CardForm
import com.craftman.cardform.OnPayBtnClickListner
import com.example.pdm.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [CardFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CardFragment : Fragment() {

    private lateinit var cardForm : CardForm
    private lateinit var textDesc: TextView
    private lateinit var payBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val rootView = inflater.inflate(R.layout.fragment_card, container, false)
        cardForm = rootView.findViewById(R.id.card_form)
        textDesc = rootView.findViewById(R.id.payment_amount)
        payBtn = rootView.findViewById(R.id.btn_pay)


        textDesc.text = "$10,000"
        payBtn.text = String.format("Payer %s", textDesc.text)

        cardForm.setPayBtnClickListner { card -> Toast.makeText(context, "Name: " + card?.name+ "Last 4 digits: " + card?.last4, Toast.LENGTH_SHORT).show() }

        return rootView
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment CardFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            CardFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
