package com.wordslearner

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
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
        val change_button: Button = findViewById(R.id.change_button)

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
            if (text1.text == choosenWords.values.elementAt(0)) {
                text1.text = choosenWords.keys.elementAt(0)
            } else {
                text1.text = choosenWords.values.elementAt(0)
            }
        }

        button2.setOnClickListener {
            if (text2.text == choosenWords.values.elementAt(1)) {
                text2.text = choosenWords.keys.elementAt(1)
            } else {
                text2.text = choosenWords.values.elementAt(1)
            }
        }

        button3.setOnClickListener {
            if (text3.text == choosenWords.values.elementAt(2)) {
                text3.text = choosenWords.keys.elementAt(2)
            } else {
                text3.text = choosenWords.values.elementAt(2)
            }
        }

        button4.setOnClickListener {
            if (text4.text == choosenWords.values.elementAt(3)) {
                text4.text = choosenWords.keys.elementAt(3)
            } else {
                text4.text = choosenWords.values.elementAt(3)
            }
        }

        button5.setOnClickListener {
            if (text5.text == choosenWords.values.elementAt(4)) {
                text5.text = choosenWords.keys.elementAt(4)
            } else {
                text5.text = choosenWords.values.elementAt(4)
            }
        }

        button6.setOnClickListener {
            if (text6.text == choosenWords.values.elementAt(5)) {
                text6.text = choosenWords.keys.elementAt(5)
            } else {
                text6.text = choosenWords.values.elementAt(5)
            }
        }

        button7.setOnClickListener {
            if (text7.text == choosenWords.values.elementAt(6)) {
                text7.text = choosenWords.keys.elementAt(6)
            } else {
                text7.text = choosenWords.values.elementAt(6)
            }
        }

        button8.setOnClickListener {
            if (text8.text == choosenWords.values.elementAt(7)) {
                text8.text = choosenWords.keys.elementAt(7)
            } else {
                text8.text = choosenWords.values.elementAt(7)
            }
        }

        button9.setOnClickListener {
            if (text9.text == choosenWords.values.elementAt(8)) {
                text9.text = choosenWords.keys.elementAt(8)
            } else {
                text9.text = choosenWords.values.elementAt(8)
            }
        }

        button10.setOnClickListener {
            if (text10.text == choosenWords.values.elementAt(9)) {
                text10.text = choosenWords.keys.elementAt(9)
            } else {
                text10.text = choosenWords.values.elementAt(9)
            }
        }

        button11.setOnClickListener {
            if (text11.text == choosenWords.values.elementAt(10)) {
                text11.text = choosenWords.keys.elementAt(10)
            } else {
                text11.text = choosenWords.values.elementAt(10)
            }
        }

        button12.setOnClickListener {
            if (text12.text == choosenWords.values.elementAt(11)) {
                text12.text = choosenWords.keys.elementAt(11)
            } else {
                text12.text = choosenWords.values.elementAt(11)
            }
        }

        button13.setOnClickListener {
            if (text13.text == choosenWords.values.elementAt(12)) {
                text13.text = choosenWords.keys.elementAt(12)
            } else {
                text13.text = choosenWords.values.elementAt(12)
            }
        }

        button14.setOnClickListener {
            if (text14.text == choosenWords.values.elementAt(13)) {
                text14.text = choosenWords.keys.elementAt(13)
            } else {
                text14.text = choosenWords.values.elementAt(13)
            }
        }

        button15.setOnClickListener {
            if (text15.text == choosenWords.values.elementAt(14)) {
                text15.text = choosenWords.keys.elementAt(14)
            } else {
                text15.text = choosenWords.values.elementAt(14)
            }
        }

        change_button.setOnClickListener {
            button2.setBackgroundColor(Color.BLUE)
            button4.setBackgroundColor(Color.BLUE)
            button6.setBackgroundColor(Color.BLUE)
            button8.setBackgroundColor(Color.BLUE)
            button10.setBackgroundColor(Color.BLUE)
            button12.setBackgroundColor(Color.BLUE)
            button14.setBackgroundColor(Color.BLUE)
            change_button.setBackgroundColor(Color.BLUE)
        }

        change_button.setOnLongClickListener {
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
            change_button.setBackgroundColor(Color.WHITE)
            true
        }
    }
}