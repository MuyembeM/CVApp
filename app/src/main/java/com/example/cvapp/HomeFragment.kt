package com.example.cvapp

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
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
        var view: View = inflater.inflate(R.layout.fragment_home, container, false)

        (view.findViewById<TextView>(R.id.fullname))!!.text = spf.getString("name","")
        (view.findViewById<TextView>(R.id.title))!!.text = spf.getString("title","")
        (view.findViewById<TextView>(R.id.career_note))!!.text = spf.getString("career_note","")
        (view.findViewById<TextView>(R.id.note_details))!!.text = spf.getString("languages","")
        (view.findViewById<TextView>(R.id.web))!!.text = spf.getString("web","")
        (view.findViewById<TextView>(R.id.servers))!!.text = spf.getString("servers","")
        (view.findViewById<TextView>(R.id.frameworks))!!.text = spf.getString("frameworks","")
        (view.findViewById<TextView>(R.id.databases))!!.text = spf.getString("databases","")

        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}