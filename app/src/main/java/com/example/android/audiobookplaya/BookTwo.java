package com.example.android.audiobookplaya;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.ListView;

        import java.util.ArrayList;


public class BookTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of books
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("father", "әpә"));
        books.add(new Book("mother", "әṭa"));
        books.add(new Book("son", "angsi"));
        books.add(new Book("daughter", "tune"));
        books.add(new Book("older brother", "taachi"));
        books.add(new Book("younger brother", "chalitti"));
        books.add(new Book("older sister", "teṭe"));
        books.add(new Book("younger sister", "kolliti"));
        books.add(new Book("grandmother ", "ama"));
        books.add(new Book("grandfather", "paapa"));

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