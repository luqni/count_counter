package com.fancreature.android.countcounter

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_counter.*

/**
 * Created by admin on 19/11/2017.
 */
class CounterActivity : AppCompatActivity() {

    var scoreTeamA: Int = 0
    var scoreTeamB: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)
        teamA()
        teamB()
        reset()
    }

    fun teamA(){
        btn_3_a.setOnClickListener ({
            scoreTeamA = scoreTeamA + 3
            txt_score_a.text = "$scoreTeamA"
        })
        btn_2_a.setOnClickListener ({
            scoreTeamA = scoreTeamA + 2
            txt_score_a.text = "$scoreTeamA"
        })
        btn_1_a.setOnClickListener ({
            scoreTeamA = scoreTeamA + 1
            txt_score_a.text = "$scoreTeamA"
        })
    }

    fun teamB(){
        btn_3_b.setOnClickListener ({
            scoreTeamB = scoreTeamB + 3
            txt_score_b.text = "$scoreTeamB"
        })
        btn_2_b.setOnClickListener ({
            scoreTeamB = scoreTeamB + 2
            txt_score_b.text = "$scoreTeamB"
        })
        btn_1_b.setOnClickListener ({
            scoreTeamB = scoreTeamB + 1
            txt_score_b.text = "$scoreTeamB"
        })
    }
    fun reset(){
        btn_reset.setOnClickListener ({
            scoreTeamA = 0
            scoreTeamB = 0
            txt_score_a.text = "$scoreTeamA"
            txt_score_b.text = "$scoreTeamB"
        })
    }
}
