package com.example.cvapp

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AboutFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AboutFragment : Fragment() {
    // TODO: Rename and change types of parameters
    lateinit var spf: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        spf = requireActivity().getSharedPreferences("cv", Context.MODE_PRIVATE)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view: View = inflater.inflate(R.layout.fragment_about, container, false)

        (view.findViewById<TextView>(R.id.about_me))!!.text = spf.getString("about_me","")
        (view.findViewById<TextView>(R.id.education_one_name))!!.text = spf.getString("education_one_name","")
        (view.findViewById<TextView>(R.id.education_one_program))!!.text = spf.getString("education_one_program","")
        (view.findViewById<TextView>(R.id.education_two_name))!!.text = spf.getString("education_two_name","")
        (view.findViewById<TextView>(R.id.education_two_program))!!.text = spf.getString("education_two_program","")
        (view.findViewById<TextView>(R.id.certification_one_name))!!.text = spf.getString("certification_one_name","")
        (view.findViewById<TextView>(R.id.certification_two_name))!!.text = spf.getString("certification_two_name","")


        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment AboutFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            AboutFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}