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

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link BookAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Book} objects.
 */
public class BookAdapter extends ArrayAdapter<Book> {

    /**
     * Create a new {@link BookAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param books   is the list of {@link Book}s to be displayed.
     */
    public BookAdapter(Context context, ArrayList<Book> books) {
        super(context, 0, books);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Book} object located at this position in the list
        Book currentBook = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        // Get the title from the currentBook object and set this text on
        // the title TextView.
        titleTextView.setText(currentBook.getTitle());

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView authorTextView = (TextView) listItemView.findViewById(R.id.author_text_view);
        // Get the author from the currentBook object and set this text on
        // the author TextView.
        authorTextView.setText(currentBook.getAuthor());

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}