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
 * Use the [WorkFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class WorkFragment : Fragment() {
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
        var view: View = inflater.inflate(R.layout.fragment_work, container, false)

        (view.findViewById<TextView>(R.id.work_experience_one_company))!!.text = spf.getString("work_experience_one_company","")
        (view.findViewById<TextView>(R.id.work_experience_one_title))!!.text = spf.getString("work_experience_one_title","")
        (view.findViewById<TextView>(R.id.work_experience_one_date_range))!!.text = spf.getString("work_experience_one_date_range","")
        (view.findViewById<TextView>(R.id.work_experience_one_city_state))!!.text = spf.getString("work_experience_one_city_state","")

        (view.findViewById<TextView>(R.id.work_experience_two_company))!!.text = spf.getString("work_experience_two_company","")
        (view.findViewById<TextView>(R.id.work_experience_two_title))!!.text = spf.getString("work_experience_two_title","")
        (view.findViewById<TextView>(R.id.work_experience_two_date_range))!!.text = spf.getString("work_experience_two_date_range","")
        (view.findViewById<TextView>(R.id.work_experience_two_city_state))!!.text = spf.getString("work_experience_two_city_state","")

        (view.findViewById<TextView>(R.id.work_experience_three_company))!!.text = spf.getString("work_experience_three_company","")
        (view.findViewById<TextView>(R.id.work_experience_three_title))!!.text = spf.getString("work_experience_three_title","")
        (view.findViewById<TextView>(R.id.work_experience_three_date_range))!!.text = spf.getString("work_experience_three_date_range","")
        (view.findViewById<TextView>(R.id.work_experience_three_city_state))!!.text = spf.getString("work_experience_three_city_state","")

        (view.findViewById<TextView>(R.id.work_experience_four_company))!!.text = spf.getString("work_experience_four_company","")
        (view.findViewById<TextView>(R.id.work_experience_four_title))!!.text = spf.getString("work_experience_four_title","")
        (view.findViewById<TextView>(R.id.work_experience_four_date_range))!!.text = spf.getString("work_experience_four_date_range","")
        (view.findViewById<TextView>(R.id.work_experience_four_city_state))!!.text = spf.getString("work_experience_four_city_state","")


        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment WorkFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            WorkFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}