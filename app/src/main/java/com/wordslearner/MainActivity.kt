package com.wordslearner

import android.animation.Animator
import android.animation.ObjectAnimator
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SwitchCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val text1: TextView = findViewById(R.id.card_text_1)
        val text2: TextView = findViewById(R.id.card_text_2)
        val text3: TextView = findViewById(R.id.card_text_3)
        val text4: TextView = findViewById(R.id.card_text_4)
        val text5: TextView = findViewById(R.id.card_text_5)
        val text6: TextView = findViewById(R.id.card_text_6)
        val text7: TextView = findViewById(R.id.card_text_7)
        val text8: TextView = findViewById(R.id.card_text_8)
        val text9: TextView = findViewById(R.id.card_text_9)
        val text10: TextView = findViewById(R.id.card_text_10)
        val text11: TextView = findViewById(R.id.card_text_11)
        val text12: TextView = findViewById(R.id.card_text_12)
        val text13: TextView = findViewById(R.id.card_text_13)
        val text14: TextView = findViewById(R.id.card_text_14)
        val text15: TextView = findViewById(R.id.card_text_15)

        val button1: Button = findViewById(R.id.button_1)
        val button2: Button = findViewById(R.id.button_2)
        val button3: Button = findViewById(R.id.button_3)
        val button4: Button = findViewById(R.id.button_4)
        val button5: Button = findViewById(R.id.button_5)
        val button6: Button = findViewById(R.id.button_6)
        val button7: Button = findViewById(R.id.button_7)
        val button8: Button = findViewById(R.id.button_8)
        val button9: Button = findViewById(R.id.button_9)
        val button10: Button = findViewById(R.id.button_10)
        val button11: Button = findViewById(R.id.button_11)
        val button12: Button = findViewById(R.id.button_12)
        val button13: Button = findViewById(R.id.button_13)
        val button14: Button = findViewById(R.id.button_14)
        val button15: Button = findViewById(R.id.button_15)
        val backButton: ImageButton = findViewById(R.id.back_button)
        val changeButton: Button = findViewById(R.id.change_button)

        val card2: LinearLayout = findViewById(R.id.card_2)
        val card3: LinearLayout = findViewById(R.id.card_3)
        val card4: LinearLayout = findViewById(R.id.card_4)
        val card5: LinearLayout = findViewById(R.id.card_5)
        val card6: LinearLayout = findViewById(R.id.card_6)
        val card7: LinearLayout = findViewById(R.id.card_7)
        val card8: LinearLayout = findViewById(R.id.card_8)
        val card9: LinearLayout = findViewById(R.id.card_9)
        val card10: LinearLayout = findViewById(R.id.card_10)
        val card11: LinearLayout = findViewById(R.id.card_11)
        val card12: LinearLayout = findViewById(R.id.card_12)
        val card13: LinearLayout = findViewById(R.id.card_13)
        val card14: LinearLayout = findViewById(R.id.card_14)
        val card15: LinearLayout = findViewById(R.id.card_15)

        val switcher = findViewById<SwitchCompat>(R.id.switch_widget)

        val difficultWords = mapOf(
            "Абрис" to "Очертание, контур",
            "Аколит" to "Помощник, последователь",
            "Анафема" to "Проклятие, осуждение",
            "Брокат" to "Ткань с узором, роскошь",
            "Глоссарий" to "Словарь, терминология",
            "Дискредитация" to "Подрыв доверия, репутации",
            "Имплицитный" to "Скрытый, неявный",
            "Инвектива" to "Оскорбление, нападка",
            "Катехизис" to "Наставление, учебник",
            "Конгломерат" to "Смешение, объединение",
            "Парадигма" to "Модель, пример",
            "Палиндром" to "Слово наоборот, симметрия",
            "Рекогносцировка" to "Разведка, осмотр",
            "Симулякр" to "Подделка, имитация",
            "Экспатриация" to "Изгнание, высылка"
        )

        val easyWords = mapOf(
            "Апатия" to "Безразличие, вялость",
            "Феерия" to "Зрелище, чудо",
            "Эйфория" to "Радость, подъем",
            "Катарсис" to "Очищение, освобождение",
            "Диссонанс" to "Несоответствие, разлад",
            "Инсайт" to "Озарение, понимание",
            "Харизма" to "Привлекательность, обаяние",
            "Перфекционизм" to "Стремление к идеалу",
            "Лаконичность" to "Краткость, сдержанность",
            "Деконструкция" to "Разбор, анализ",
            "Эклектика" to "Смешение, сочетание",
            "Иррациональность" to "Нелогичность, абсурд",
            "Мизантропия" to "Нелюдимость, недоверие",
            "Медитация" to "Размышление, сосредоточение",
            "Оксюморон" to "Противоречие, парадокс"
        )

        var choosenWords = easyWords

        fun setWords() {
            text1.text = choosenWords.keys.elementAt(0)
            text2.text = choosenWords.keys.elementAt(1)
            text3.text = choosenWords.keys.elementAt(2)
            text4.text = choosenWords.keys.elementAt(3)
            text5.text = choosenWords.keys.elementAt(4)
            text6.text = choosenWords.keys.elementAt(5)
            text7.text = choosenWords.keys.elementAt(6)
            text8.text = choosenWords.keys.elementAt(7)
            text9.text = choosenWords.keys.elementAt(8)
            text10.text = choosenWords.keys.elementAt(9)
            text11.text = choosenWords.keys.elementAt(10)
            text12.text = choosenWords.keys.elementAt(11)
            text13.text = choosenWords.keys.elementAt(12)
            text14.text = choosenWords.keys.elementAt(13)
            text15.text = choosenWords.keys.elementAt(14)
        }

        //to set initial words
        if (!switcher.isChecked) {
            setWords()
        }

        switcher.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                choosenWords = difficultWords
            } else {
                choosenWords = easyWords
            }
            setWords()
        }


        button1.setOnClickListener {
            val newText = if (text1.text == choosenWords.values.elementAt(0)) {
                choosenWords.keys.elementAt(0)
            } else {
                choosenWords.values.elementAt(0)
            }
            animateTextChange(text1, newText)
        }

        button2.setOnClickListener {
            animateCardFlip(card2, text2) {
                if (text2.text == choosenWords.values.elementAt(1)) {
                    choosenWords.keys.elementAt(1)
                } else {
                    choosenWords.values.elementAt(1)
                }
            }
        }
        button3.setOnClickListener {
            animateCardFlip(card3, text3) {
                if (text3.text == choosenWords.values.elementAt(2)) {
                    choosenWords.keys.elementAt(2)
                } else {
                    choosenWords.values.elementAt(2)
                }
            }
        }

        button4.setOnClickListener {
            animateCardFlip(card4, text4) {
                if (text4.text == choosenWords.values.elementAt(3)) {
                    choosenWords.keys.elementAt(3)
                } else {
                    choosenWords.values.elementAt(3)
                }
            }
        }

        button5.setOnClickListener {
            animateCardFlip(card5, text5) {
                if (text5.text == choosenWords.values.elementAt(4)) {
                    choosenWords.keys.elementAt(4)
                } else {
                    choosenWords.values.elementAt(4)
                }
            }
        }

        button6.setOnClickListener {
            animateCardFlip(card6, text6) {
                if (text6.text == choosenWords.values.elementAt(5)) {
                    choosenWords.keys.elementAt(5)
                } else {
                    choosenWords.values.elementAt(5)
                }
            }
        }

        button7.setOnClickListener {
            animateCardFlip(card7, text7) {
                if (text7.text == choosenWords.values.elementAt(6)) {
                    choosenWords.keys.elementAt(6)
                } else {
                    choosenWords.values.elementAt(6)
                }
            }
        }


        button8.setOnClickListener {
            animateCardFlip(card8, text8) {
                if (text8.text == choosenWords.values.elementAt(7)) {
                    choosenWords.keys.elementAt(7)
                } else {
                    choosenWords.values.elementAt(7)
                }
            }
        }

        button9.setOnClickListener {
            animateCardFlip(card9, text9) {
                if (text9.text == choosenWords.values.elementAt(8)) {
                    choosenWords.keys.elementAt(8)
                } else {
                    choosenWords.values.elementAt(8)
                }
            }
        }

        button10.setOnClickListener {
            animateCardFlip(card10, text10) {
                if (text10.text == choosenWords.values.elementAt(9)) {
                    choosenWords.keys.elementAt(9)
                } else {
                    choosenWords.values.elementAt(9)
                }
            }
        }

        button11.setOnClickListener {
            animateCardFlip(card11, text11) {
                if (text11.text == choosenWords.values.elementAt(10)) {
                    choosenWords.keys.elementAt(10)
                } else {
                    choosenWords.values.elementAt(10)
                }
            }
        }

        button12.setOnClickListener {
            animateCardFlip(card12, text12) {
                if (text12.text == choosenWords.values.elementAt(11)) {
                    choosenWords.keys.elementAt(11)
                } else {
                    choosenWords.values.elementAt(11)
                }
            }
        }

        button13.setOnClickListener {
            animateCardFlip(card13, text13) {
                if (text13.text == choosenWords.values.elementAt(12)) {
                    choosenWords.keys.elementAt(12)
                } else {
                    choosenWords.values.elementAt(12)
                }
            }
        }

        button14.setOnClickListener {
            animateCardFlip(card14, text14) {
                if (text14.text == choosenWords.values.elementAt(13)) {
                    choosenWords.keys.elementAt(13)
                } else {
                    choosenWords.values.elementAt(13)
                }
            }
        }

        button15.setOnClickListener {
            animateCardFlip(card15, text15) {
                if (text15.text == choosenWords.values.elementAt(14)) {
                    choosenWords.keys.elementAt(14)
                } else {
                    choosenWords.values.elementAt(14)
                }
            }
        }
        backButton.setOnClickListener {
            finish()
        }

        changeButton.setOnClickListener {
            button2.setBackgroundColor(Color.BLUE)
            button4.setBackgroundColor(Color.BLUE)
            button6.setBackgroundColor(Color.BLUE)
            button8.setBackgroundColor(Color.BLUE)
            button10.setBackgroundColor(Color.BLUE)
            button12.setBackgroundColor(Color.BLUE)
            button14.setBackgroundColor(Color.BLUE)
            changeButton.setBackgroundColor(Color.BLUE)
        }

        changeButton.setOnLongClickListener {
            button1.setBackgroundColor(Color.WHITE)
            button1.setTextColor(Color.BLUE)
            button3.setBackgroundColor(Color.WHITE)
            button3.setTextColor(Color.BLUE)
            button5.setBackgroundColor(Color.WHITE)
            button5.setTextColor(Color.BLUE)
            button7.setBackgroundColor(Color.WHITE)
            button7.setTextColor(Color.BLUE)
            button9.setBackgroundColor(Color.WHITE)
            button9.setTextColor(Color.BLUE)
            button11.setBackgroundColor(Color.WHITE)
            button11.setTextColor(Color.BLUE)
            button13.setBackgroundColor(Color.WHITE)
            button13.setTextColor(Color.BLUE)
            button15.setBackgroundColor(Color.WHITE)
            button15.setTextColor(Color.BLUE)
            changeButton.setBackgroundColor(Color.WHITE)
            true
        }
    }

    private fun animateTextChange(
        textView: TextView,
        newText: String
    ) {
        val fadeOut = AnimationUtils.loadAnimation(this, R.anim.fade_out)
        val fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in)

        fadeOut.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {}

            override fun onAnimationEnd(animation: Animation?) {
                textView.text = newText
                textView.startAnimation(fadeIn)
            }

            override fun onAnimationRepeat(animation: Animation?) {}
        })

        textView.startAnimation(fadeOut)
    }

    private fun animateCardFlip(
        card: View,
        textView: TextView,
        getNewText: () -> String
    ) {
        val rotationAnimator = ObjectAnimator.ofFloat(card, "rotationY", 0f, 90f)
        rotationAnimator.duration = 500

        rotationAnimator.addListener(object : Animator.AnimatorListener {
            override fun onAnimationStart(p0: Animator) {}
            override fun onAnimationEnd(p0: Animator) {
                textView.text = getNewText()

                ObjectAnimator.ofFloat(card, "rotationY", 270f, 360f).apply {
                    duration = 500
                    start()
                }
            }

            override fun onAnimationCancel(p0: Animator) {}
            override fun onAnimationRepeat(p0: Animator)  {}
        })
        rotationAnimator.start()
    }
}