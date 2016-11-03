package com.android.asel.ej12relativelayouts;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.relative_layout);

        RelativeLayout layout = new RelativeLayout(this);
        layout.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        layout.setBackgroundResource(R.drawable.fondo);

        //COLOR ROJO
        TextView textViewRed = new TextView(this);
        textViewRed.setText(R.string.red);
        textViewRed.setGravity(Gravity.CENTER);
        textViewRed.setBackgroundResource(R.color.colorred);
        textViewRed.setPadding(20, 20, 20, 20);

        RelativeLayout.LayoutParams textViewRedParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        textViewRedParams.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        textViewRedParams.addRule(RelativeLayout.ALIGN_PARENT_START);

        textViewRed.setLayoutParams(textViewRedParams);

        //COLOR NARANJA
        TextView textViewOrange = new TextView(this);
        textViewOrange.setText(R.string.orange);
        textViewOrange.setGravity(Gravity.CENTER);
        textViewOrange.setBackgroundResource(R.color.colororange);
        textViewOrange.setPadding(20, 20, 20, 20);

        RelativeLayout.LayoutParams textViewOrangeParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        textViewOrangeParams.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        textViewOrangeParams.addRule(RelativeLayout.CENTER_HORIZONTAL);

        textViewOrange.setLayoutParams(textViewOrangeParams);

        //COLOR AMARILLO
        TextView textViewYellow = new TextView(this);
        textViewYellow.setText(R.string.yellow);
        textViewYellow.setGravity(Gravity.CENTER);
        textViewYellow.setBackgroundResource(R.color.coloryellow);
        textViewYellow.setPadding(20, 20, 20, 20);

        RelativeLayout.LayoutParams textViewYellowParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        textViewYellowParams.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        textViewYellowParams.addRule(RelativeLayout.ALIGN_PARENT_END);

        textViewYellow.setLayoutParams(textViewYellowParams);

        //COLOR AZUL (ANTES QUE VERDE Y VIOLETA, YA QUE ESTOS LO REFERENCIAN PARA COLOCARSE)
        TextView textViewBlue = new TextView(this);
        textViewBlue.setId(R.id.tvAzul);
        textViewBlue.setText(R.string.blue);
        textViewBlue.setGravity(Gravity.CENTER);
        textViewBlue.setBackgroundResource(R.color.colorblue);
        textViewBlue.setPadding(20, 20, 20, 20);

        RelativeLayout.LayoutParams textViewBlueParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        textViewBlueParams.addRule(RelativeLayout.CENTER_VERTICAL);
        textViewBlueParams.addRule(RelativeLayout.CENTER_HORIZONTAL);

        textViewBlue.setLayoutParams(textViewBlueParams);

        //COLOR VERDE
        TextView textViewGreen = new TextView(this);
        textViewGreen.setText(R.string.green);
        textViewGreen.setGravity(Gravity.CENTER);
        textViewGreen.setBackgroundResource(R.color.colorgreen);
        textViewGreen.setPadding(20, 20, 20, 20);

        RelativeLayout.LayoutParams textViewGreenParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        textViewGreenParams.addRule(RelativeLayout.CENTER_VERTICAL);
        textViewGreenParams.setMarginEnd(8);
        textViewGreenParams.addRule(RelativeLayout.START_OF, R.id.tvAzul);

        textViewGreen.setLayoutParams(textViewGreenParams);

        //COLOR VIOLETA
        TextView textViewViolet = new TextView(this);
        textViewViolet.setText(R.string.violet);
        textViewViolet.setGravity(Gravity.CENTER);
        textViewViolet.setBackgroundResource(R.color.colorviolet);
        textViewViolet.setPadding(20, 20, 20, 20);

        RelativeLayout.LayoutParams textViewVioletParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        textViewVioletParams.addRule(RelativeLayout.CENTER_VERTICAL);
        textViewVioletParams.setMarginStart(8);
        textViewVioletParams.addRule(RelativeLayout.END_OF, R.id.tvAzul);

        textViewViolet.setLayoutParams(textViewVioletParams);

        //COLOR ROSA
        TextView textViewPink = new TextView(this);
        textViewPink.setText(R.string.pink);
        textViewPink.setGravity(Gravity.CENTER);
        textViewPink.setBackgroundResource(R.color.colorpink);
        textViewPink.setPadding(20, 20, 20, 20);

        RelativeLayout.LayoutParams textViewPinkParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        textViewPinkParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);

        textViewPink.setLayoutParams(textViewPinkParams);

        //AÑADIR ELEMENTOS AL LAYOUT
        layout.addView(textViewRed);
        layout.addView(textViewOrange);
        layout.addView(textViewYellow);
        layout.addView(textViewGreen);
        layout.addView(textViewBlue);
        layout.addView(textViewViolet);
        layout.addView(textViewPink);

        //MOSTRAR EL LAYOUT
        setContentView(layout);

    }
}
