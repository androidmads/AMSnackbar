package com.androidmads.amsnackbar;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.androidmads.amsnackbarlib.AMSnackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    AMSnackbar amSnackbar = null;

    public void showSnackbar(View view) {
        amSnackbar = new AMSnackbar.Builder()
                .make(view)
                .message("AMSnackbar Sample")
                .messageTypeface(Typeface.createFromAsset(getAssets(), "play_reg.ttf"))
                .messageTextColor(Color.WHITE)
                .actionText("Dismiss", R.drawable.ic_cancel, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        amSnackbar.dismiss();
                    }
                })
                .actionIcon(R.drawable.ic_cancel, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        amSnackbar.dismiss();
                    }
                })
                .actionTypeface(Typeface.createFromAsset(getAssets(), "play_bold.ttf"))
                .actionTextColor(Color.YELLOW)
                .backgroundColor(getResources().getColor(R.color.colorAccent))
                .duration(Snackbar.LENGTH_INDEFINITE)
                //.isRtl()
                .build();
        amSnackbar.show();
    }

    public void showRtlSnackbar(View view) {
        amSnackbar = new AMSnackbar.Builder()
                .make(view)
                .message("AMSnackbar Sample")
                .messageTypeface(Typeface.createFromAsset(getAssets(), "play_reg.ttf"))
                .messageTextColor(Color.WHITE)
                .actionText("Dismiss", R.drawable.ic_cancel, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        amSnackbar.dismiss();
                    }
                })
                .actionTypeface(Typeface.createFromAsset(getAssets(), "play_bold.ttf"))
                .actionTextColor(Color.YELLOW)
                .backgroundColor(Color.GREEN)
                .duration(Snackbar.LENGTH_INDEFINITE)
                .isRtl()
                .build();
        amSnackbar.show();
    }

    public void showSnackbar2(View view) {
        amSnackbar = new AMSnackbar.Builder()
                .make(view)
                .message("AMSnackbar Sample")
                .messageTypeface(Typeface.createFromAsset(getAssets(), "play_reg.ttf"))
                .messageTextColor(Color.WHITE)
                .actionText("Dismiss", R.drawable.ic_cancel, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        amSnackbar.dismiss();
                    }
                })
                .actionTypeface(Typeface.createFromAsset(getAssets(), "play_bold.ttf"))
                .actionTextColor(Color.YELLOW)
                .backgroundColor(Color.RED)
                .duration(Snackbar.LENGTH_INDEFINITE)
                .build();
        amSnackbar.show();
    }
}
