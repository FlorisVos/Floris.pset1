package com.example.floris.floris_pset1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class pset1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.potato);
    }


    public void onCheckBoxClick(View view) {

        // identify the different images
        ImageView imageEars = (ImageView) findViewById(R.id.imageView20);
        ImageView imageNose = (ImageView) findViewById(R.id.imageView12);
        ImageView imageMouth = (ImageView) findViewById(R.id.imageView13);
        ImageView imageShoes = (ImageView) findViewById(R.id.imageView19);
        ImageView imageHat = (ImageView) findViewById(R.id.imageView18);
        ImageView imageEyebrows = (ImageView) findViewById(R.id.imageView16);
        ImageView imageArms = (ImageView) findViewById(R.id.imageView9);
        ImageView imageGlasses = (ImageView) findViewById(R.id.imageView17);
        ImageView imageEyes = (ImageView) findViewById(R.id.imageView11);
        ImageView imageMustache = (ImageView) findViewById(R.id.imageView21);

        // checks whether checkbox is checked
        boolean checked = ((CheckBox) view).isChecked();

        // differentiate between the different checkboxes and related views
        // toggle visibility of views when checkbox clicked
        switch (view.getId()) {
            case R.id.checkBoxEars:
                if (checked)
                    imageEars.setVisibility(View.VISIBLE);
                else
                    imageEars.setVisibility(View.GONE);
                break;

            case R.id.checkBoxNose:
                if (checked)
                    imageNose.setVisibility(View.VISIBLE);
                else
                    imageNose.setVisibility(View.GONE);
                break;

            case R.id.checkBoxMouth:
                if (checked)
                    imageMouth.setVisibility(View.VISIBLE);
                else
                    imageMouth.setVisibility(View.GONE);
                break;

            case R.id.CheckBoxMustache:
                if (checked)
                    imageMustache.setVisibility(View.VISIBLE);
                else
                    imageMustache.setVisibility(View.GONE);
                break;

            case R.id.checkBoxGlasses:
                if (checked)
                    imageGlasses.setVisibility(View.VISIBLE);
                else
                    imageGlasses.setVisibility(View.GONE);
                break;

            case R.id.checkBoxEyes:
                if (checked)
                    imageEyes.setVisibility(View.VISIBLE);
                else
                    imageEyes.setVisibility(View.GONE);
                break;

            case R.id.checkBoxShoes:
                if (checked)
                    imageShoes.setVisibility(View.VISIBLE);
                else
                    imageShoes.setVisibility(View.GONE);
                break;

            case R.id.checkBoxEyebrows:
                if (checked)
                    imageEyebrows.setVisibility(View.VISIBLE);
                else
                    imageEyebrows.setVisibility(View.GONE);
                break;
            case R.id.checkBoxHat:
                if (checked)
                    imageHat.setVisibility(View.VISIBLE);
                else
                    imageHat.setVisibility(View.GONE);
                break;
            case R.id.checkBoxArms:
                if (checked)
                    imageArms.setVisibility(View.VISIBLE);
                else
                    imageArms.setVisibility(View.GONE);
                break;
        }

    }


}

