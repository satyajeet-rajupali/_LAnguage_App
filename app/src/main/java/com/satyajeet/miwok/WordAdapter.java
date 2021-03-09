package com.satyajeet.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.nio.InvalidMarkException;
import java.util.ArrayList;
import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    public WordAdapter(@NonNull Context context, @NonNull ArrayList<Word> objects, int colorResourceId) {
        super(context, 0, objects);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word translationWords = getItem(position);

        TextView miWokTranslation = (TextView)listItemView.findViewById(R.id.miwok_textView);
        miWokTranslation.setText(translationWords.getMiWokTranslation());

        TextView defaultTranslation = (TextView)listItemView.findViewById(R.id.default_translation_textView);
        defaultTranslation.setText(translationWords.getDefaultTranslation());

        ImageView image = (ImageView)listItemView.findViewById(R.id.image);

        if(translationWords.hasImage()){
            image.setImageResource(translationWords.getImageResourceId());

            image.setVisibility(View.VISIBLE);
        } else {
            image.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
