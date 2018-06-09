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

/**
 * {@link Book} represents a title with and author and title
 */
public class Book {

    /** The author*/
    private String author;

    /** The title */
    private String title;

    /**
     * Create a new Book object.
     *
     * @param theAuthor is the author of the book
     * @param theTitle is the title of the book
     */
    public Book(String theAuthor, String theTitle) {
        author = theAuthor;
        title = theTitle;
    }

    /**
     * Get the default translation of the word.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getTitle() {
        return title;
    }

}