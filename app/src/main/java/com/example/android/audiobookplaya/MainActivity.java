/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.audiobookplaya;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the bookOne category
        TextView bookOne = (TextView) findViewById(R.id.bookOne);

        // Set a click listener on that View
        bookOne.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the bookOne category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link BookOne}
                Intent bookOneIntent = new Intent(MainActivity.this, BookOne.class);

                // Start the new activity
                startActivity(bookOneIntent);
            }
        });

        // Find the View that shows the bookTwo category
        TextView bookTwo = (TextView) findViewById(R.id.bookTwo);

        // Set a click listener on that View
        bookTwo.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the bookTwo category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link BookTwo}
                Intent bookTwoIntent = new Intent(MainActivity.this, BookTwo.class);

                // Start the new activity
                startActivity(bookTwoIntent);
            }
        });

        // Find the View that shows the bookThree category
        TextView bookThree = (TextView) findViewById(R.id.bookThree);

        // Set a click listener on that View
        bookThree.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the bookThree category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link BookThree}
                Intent bookThreeIntent = new Intent(MainActivity.this, BookThree.class);

                // Start the new activity
                startActivity(bookThreeIntent);
            }
        });

        // Find the View that shows the bookFour category
        TextView bookFour = (TextView) findViewById(R.id.bookFour);

        // Set a click listener on that View
        bookFour.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the bookFour category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link BookFour}
                Intent bookFourIntent = new Intent(MainActivity.this, BookFour.class);

                // Start the new activity
                startActivity(bookFourIntent);
            }
        });
    }
}