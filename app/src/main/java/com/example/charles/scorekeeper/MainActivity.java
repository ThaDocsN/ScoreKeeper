package com.example.charles.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int scoreBlack = 0;
    private int scoreWhite = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //make copy of buttons
        Button blkQueen, blkRook, blkBishop, blkKnight, blkPawn;
        Button whtQueen, whtRook, whtBishop, whtKnight, whtPawn;

        Button btnRest = findViewById(R.id.reset);

        //black side
        blkQueen = findViewById(R.id.blQueen);
        blkRook = findViewById(R.id.blrook);
        blkBishop = findViewById(R.id.blbishop);
        blkKnight = findViewById(R.id.blknight);
        blkPawn = findViewById(R.id.blpawn);

        //white side
        whtQueen = findViewById(R.id.queen);
        whtRook = findViewById(R.id.rook);
        whtBishop = findViewById(R.id.bishop);
        whtKnight = findViewById(R.id.knight);
        whtPawn = findViewById(R.id.pawn);

        //setup listeners for buttons
        btnRest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreBlack = 0;
                scoreWhite = 0;
                displayBlackScore(scoreBlack);
                displayWhiteScore(scoreWhite);
            }
        });
        blkQueen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valuePiece = 9;
                scoreBlack = scoreBlack + valuePiece;
                displayBlackScore(scoreBlack);
            }
        });
        blkRook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valuePiece = 5;
                scoreBlack = scoreBlack + valuePiece;
                displayBlackScore(scoreBlack);

            }
        });
        blkBishop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valuePiece = 3;
                scoreBlack = scoreBlack + valuePiece;
                displayBlackScore(scoreBlack);
            }
        });
        blkKnight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valuePiece = 3;
                scoreBlack = scoreBlack + valuePiece;
                displayBlackScore(scoreBlack);
            }
        });
        blkPawn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valuePiece = 1;
                scoreBlack = scoreBlack + valuePiece;
                displayBlackScore(scoreBlack);
            }
        });
        whtPawn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valuePiece = 1;
                scoreWhite = scoreWhite + valuePiece;
                displayWhiteScore(scoreWhite);
            }
        });
        whtKnight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valuePiece = 3;
                scoreWhite = scoreWhite + valuePiece;
                displayWhiteScore(scoreWhite);
            }
        });
        whtBishop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valuePiece = 3;
                scoreWhite = scoreWhite + valuePiece;
                displayWhiteScore(scoreWhite);
            }
        });
        whtRook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valuePiece = 5;
                scoreWhite = scoreWhite + valuePiece;
                displayWhiteScore(scoreWhite);
            }
        });
        whtQueen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valuePiece = 9;
                scoreWhite = scoreWhite + valuePiece;
                displayWhiteScore(scoreWhite);
            }
        });

    }

    public void displayWhiteScore(int whtScore) {
        TextView scoreView = findViewById(R.id.textView);
        scoreView.setText(String.valueOf(whtScore));
    }

    public void displayBlackScore(int blkScore) {
        TextView scoreView = findViewById(R.id.textView2);
        scoreView.setText(String.valueOf(blkScore));
    }
}
