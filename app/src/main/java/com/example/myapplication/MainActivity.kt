package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCalculate.setOnClickListener{

            var basic: Int = 0
            var extra: Int = 0
            var total: Int = 0

            val age:Int = binding.spinnerAge.selectedItemPosition
            val male = binding.radioGroupGender.checkedRadioButtonId == binding.radioButtonMale.id
            val smoker = binding.checkBoxSmoker.isChecked
            if(age == 0){//less than 17
                //Calculate basic Premium
                basic = 60
            }

           else if(age == 1){//less than 17
                //Calculate basic Premium
                basic = 70

                if(male){
                    extra += 50
                }

                if(smoker){
                    extra +=100;
                }
            }

            else if(age == 2){//less than 17
                //Calculate basic Premium
                basic = 90

                if(male){
                    extra += 100
                }

                if(smoker){
                    extra +=150;
                }
            }

            else if(age == 3){//less than 17
                //Calculate basic Premium
                basic = 120

                if(male){
                    extra += 150
                }

                if(smoker){
                    extra +=200;
                }
            }

            else if(age == 4){//less than 17
                //Calculate basic Premium
                basic = 150
                if(male){
                    extra += 200
                }

                if(smoker){
                    extra +=250;
                }
            }

            else if(age == 5){//less than 17
                //Calculate basic Premium
                basic = 150

                if(male){
                    extra += 250
                }

                if(smoker){
                    extra +=300;
                }
            }

            val premium = Premium(basic,extra,basic+extra)
            binding.myPremium = premium
        }

        binding.buttonReset.setOnClickListener{

        }
    }
}