package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mTextView;
    private Button mRedButton;
    private Button mBlueButton;
    int mIndex;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mTextView = (TextView) findViewById(R.id.storyTextView);
        mRedButton = (Button) findViewById(R.id.buttonTop);
        mBlueButton = (Button) findViewById(R.id.buttonBottom);
        mTextView.setText(R.string.T1_Story);



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mRedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextView.setText(R.string.T3_Story);
                mRedButton.setText(R.string.T3_Ans1);
                mBlueButton.setText(R.string.T3_Ans2);
                mRedButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mTextView.setText(R.string.T6_End);
                        mRedButton.setVisibility(View.GONE);
                        mBlueButton.setVisibility(View.GONE);
                    }
                });

            mBlueButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mTextView.setText(R.string.T5_End);
                    mRedButton.setVisibility(View.GONE);
                    mBlueButton.setVisibility(View.GONE);
                }
            });
            }
        });





        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBlueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextView.setText(R.string.T2_Story);
                mRedButton.setText(R.string.T2_Ans1);
                mBlueButton.setText(R.string.T2_Ans2);
                mBlueButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mTextView.setText(R.string.T4_End);
                        mRedButton.setVisibility(View.GONE);
                        mBlueButton.setVisibility(View.GONE);
                    }
                });
                mRedButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mTextView.setText(R.string.T3_Story);
                        mRedButton.setText(R.string.T3_Ans1);
                        mBlueButton.setText(R.string.T3_Ans2);
                        mRedButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                mTextView.setText(R.string.T6_End);
                                mRedButton.setVisibility(View.GONE);
                                mBlueButton.setVisibility(View.GONE);
                            }
                        });
                        mBlueButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                mTextView.setText(R.string.T5_End);
                                mRedButton.setVisibility(View.GONE);
                                mBlueButton.setVisibility(View.GONE);
                            }
                        });
                    }
                });
            }
        });
    }
}
