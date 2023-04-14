package com.example.assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Calculator : AppCompatActivity() {
    lateinit var mAnswer:TextView
    lateinit var mFnum:EditText
    lateinit var mSnum:EditText
    lateinit var mBtnAdd:Button
    lateinit var mBtnMul:Button
    lateinit var mBtnSub:Button
    lateinit var mBtnDiv:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        mAnswer = findViewById(R.id.mAnswer)
        mFnum = findViewById(R.id.mFnum)
        mSnum = findViewById(R.id.mSnum)
        mBtnAdd = findViewById(R.id.mBtnAdd)
        mBtnMul = findViewById(R.id.mBtnMul)
        mBtnSub = findViewById(R.id.mBtnSub)
        mBtnDiv = findViewById(R.id.mBtnDiv)

        mBtnAdd.setOnClickListener {
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = mSnum.text.toString().trim()
            if (firstNumber.isEmpty()||secondNumber.isEmpty()){
                //display an error on  the text view anwer
                mAnswer.text = "Please enter valid numbers"
            }else{
                //proceed to compute the numbers
                var jibu = firstNumber.toDouble() + secondNumber.toDouble()
                //display the answer
                mAnswer.text = jibu.toString()
            }
        }

        mBtnMul.setOnClickListener {
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = mSnum.text.toString().trim()
            if (firstNumber.isEmpty()||secondNumber.isEmpty()){
                //display an error on  the text view anwer
                mAnswer.text = "Please enter valid numbers"
            }else{
                //proceed to compute the numbers
                var jibu = firstNumber.toDouble() * secondNumber.toDouble()
                //display the answer
                mAnswer.text = jibu.toString()
            }

        }
        mBtnSub.setOnClickListener {
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = mSnum.text.toString().trim()
            if (firstNumber.isEmpty()||secondNumber.isEmpty()){
                //display an error on  the text view anwer
                mAnswer.text = "Please enter valid numbers"
            }else{
                //proceed to compute the numbers
                var jibu = firstNumber.toDouble() - secondNumber.toDouble()
                //display the answer
                mAnswer.text = jibu.toString()
            }
        }
        mBtnDiv.setOnClickListener {
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = mSnum.text.toString().trim()
            if (firstNumber.isEmpty()||secondNumber.isEmpty()){
                //display an error on  the text view anwer
                mAnswer.text = "Please enter valid numbers"
            }else{
                //proceed to compute the numbers
                var jibu = firstNumber.toDouble() / secondNumber.toDouble()
                //display the answer
                mAnswer.text = jibu.toString()
            }
        }
    }
}