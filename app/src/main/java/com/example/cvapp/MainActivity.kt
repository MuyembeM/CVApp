package com.example.cvapp

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.view.menu.MenuBuilder
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    lateinit var spf: SharedPreferences
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tabLayout = findViewById<TabLayout>(R.id.tab_layout)
        var viewPager = findViewById<ViewPager2>(R.id.view_pager)

        val tabAdapter = TabAdapter(this)

        viewPager.adapter = tabAdapter
        tabLayout.tabGravity = TabLayout.GRAVITY_FILL



        TabLayoutMediator( tabLayout,viewPager){tab,position->
            when(position){
                0->{
                    tab.text="Home"
                }
                1->{
                    tab.text="About"
                }
                2->{
                    tab.text="Work"
                }
                3->{
                    tab.text ="Contact"
                }
            }
        }.attach()

        spf = getSharedPreferences("cv", Context.MODE_PRIVATE)
        var edit = spf.edit()

        edit.putString("name","Mike Muyembe")
        edit.putString("title","Dot Net Developer")
        edit.putString("career_note","Completed on-campus studies and currently taking distance education courses to complete a Master's degree in Computer Science (Available for full-time W2 employment).")
        edit.putString("languages","Languages: C#, VB.NET, Kotlin, VB6, PHP, Python, Java")
        edit.putString("web","Web: JavaScript, HTML, CSS, Bootstrap")
        edit.putString("servers","Servers: IIS, Apache, Nginx")
        edit.putString("frameworks","Frameworks: ASP.NET Core, ASP.NET MVC, ASP.NET Web Forms, Blazor, Razor Pages, VueJS, NodeJS, React, Angular, Django, Symfony, CakePHP, Xamarin, Android, Syncfusion")
        edit.putString("databases","Databases: MS SQL Server, MySQL, PostgreSQL, SQLite")
        edit.putString("about_me","About Me")
        edit.putString("education_one_name","Maharishi International University")
        edit.putString("education_one_program","Master of Science in Computer Science")
        edit.putString("education_one_image","miu")
        edit.putString("education_two_name","Copperbelt University")
        edit.putString("education_two_program","Bachelor of Science in Computer Science")
        edit.putString("education_two_image","cbu")
        edit.putString("certification_one_name","Microsoft Certified Solutions Developer")
        edit.putString("certification_one_image","mcsd")
        edit.putString("certification_two_name","Microsoft Certified Professional")
        edit.putString("certification_two_image","mcp")
        edit.putString("work_experience_one_company","Mopani Copper Mines")
        edit.putString("work_experience_one_title","Senior Software Developer")
        edit.putString("work_experience_one_date_range","Mar 2021-Apr 2022")
        edit.putString("work_experience_one_city_state","KTW, ZAMBIA")
        edit.putString("work_experience_one_image","mcm")
        edit.putString("work_experience_two_company","Professionl Insurance Corporation")
        edit.putString("work_experience_two_title","Software Development Manager")
        edit.putString("work_experience_two_date_range","Oct 2019-Feb 2021")
        edit.putString("work_experience_two_city_state","LSK, ZAMBIA")
        edit.putString("work_experience_two_image","picz")
        edit.putString("work_experience_three_company","Dot Com Zambia Ltd")
        edit.putString("work_experience_three_title","Information Technology Manager")
        edit.putString("work_experience_three_date_range","Oct 2017-Oct 2019")
        edit.putString("work_experience_three_city_state","LSK, ZAMBIA")
        edit.putString("work_experience_three_image","dc")
        edit.putString("work_experience_four_company","Necor Zambia Ltd")
        edit.putString("work_experience_four_title","Lead Software Developer")
        edit.putString("work_experience_four_date_range","Dec 2016-Oct 2017")
        edit.putString("work_experience_four_city_state","LSK, ZAMBIA")
        edit.putString("work_experience_four_image","necor")
        edit.putString("contact_phone","+1 (641) 819-2713")
        edit.putString("contact_email","mike.muyembe2@gmail.com")
        edit.putString("contact_linkedin","https://www.linkedin.com/in/mike-muyembe2/")
        edit.putString("contact_github","https://github.com/MuyembeM/")
        edit.putString("contact_resume","")

        edit.apply()


    }

    @SuppressLint("RestrictedApi")
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        // Code to get the title and icon on the option overflow
        if (menu is MenuBuilder) {
            menu.setOptionalIconsVisible(true)
        }
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem):Boolean {
        Toast.makeText(
            applicationContext,
            item.title.toString(),
            Toast.LENGTH_LONG).show()
        return super.onOptionsItemSelected(item)
    }
}