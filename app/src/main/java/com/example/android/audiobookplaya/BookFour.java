
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

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.widget.ListView;

        import java.util.ArrayList;

public class BookFour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of books
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("Where are you going?", "minto wuksus"));
        books.add(new Book("What is your name?", "tinnә oyaase'nә"));
        books.add(new Book("My name is...", "oyaaset..."));
        books.add(new Book("How are you feeling?", "michәksәs?"));
        books.add(new Book("I’m feeling good.", "kuchi achit"));
        books.add(new Book("Are you coming?", "әәnәs'aa?"));
        books.add(new Book("Yes, I’m coming.", "hәә’ әәnәm"));
        books.add(new Book("I’m coming.", "әәnәm"));
        books.add(new Book("Let’s go.", "yoowutis"));
        books.add(new Book("Come here.", "әnni'nem"));

        // Create an {@link BookAdapter}, whose data source is a list of {@link Book}s. The
        // adapter knows how to create list items for each item in the list.
        BookAdapter adapter = new BookAdapter(this, books);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link BookAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Book} in the list.
        listView.setAdapter(adapter);
    }


}