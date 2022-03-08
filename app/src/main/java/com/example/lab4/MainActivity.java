package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.lab4.adapter.LanguageAdapter;
import com.example.lab4.model.Language;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Language> listLanguage;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab4);

        listView = (ListView) findViewById(R.id.idListView);
        listLanguage = new ArrayList<>();
        listLanguage.add(new Language(1, "Lập Trình Java"));
        listLanguage.add(new Language(2, "Lập Trình Android"));
        listLanguage.add(new Language(3, "Lập Trình JavaFX"));
        listLanguage.add(new Language(4, "Lập Trình Web"));
        listLanguage.add(new Language(5, "Lập Trình Ruby"));
        listLanguage.add(new Language(6, "Lập Trình C++"));
        listLanguage.add(new Language(7, "Lập Trình PHP"));
        listLanguage.add(new Language(8, "Lập Trình WordPress"));

        LanguageAdapter adapter = new LanguageAdapter(this, R.layout.lab4_item, listLanguage);
        listView.setAdapter(adapter);
    }
}