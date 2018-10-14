package com.androidmads.amsnackbarlib;

import android.graphics.Typeface;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Mushtaq on 11-10-2018.
 */

public class AMSnackbar {

    private Builder builder;
    private Snackbar snackbar;

    private AMSnackbar(Builder builder) {
        this.builder = builder;
        init();
    }

    private void init() {
        snackbar = Snackbar.make(builder.view, builder.message, builder.duration);
        snackbar.setAction(builder.actionText, builder.clickListener);

        View snackbarView = snackbar.getView();
        TextView mainTextView = (snackbarView).findViewById(android.support.design.R.id.snackbar_text);
        TextView actionTextView = (snackbarView).findViewById(android.support.design.R.id.snackbar_action);

        if (builder.isRtl)
            ViewCompat.setLayoutDirection(snackbar.getView(), ViewCompat.LAYOUT_DIRECTION_RTL);

        mainTextView.setTypeface(builder.messageTypeface);
        actionTextView.setTypeface(builder.actionTypeface);

        if(builder.showIconOnly)
            actionTextView.setText(null);

        mainTextView.setCompoundDrawablesWithIntrinsicBounds(builder.messageImage, 0, 0, 0);
        actionTextView.setCompoundDrawablesWithIntrinsicBounds(builder.actionImage, 0, 0, 0);

        mainTextView.setCompoundDrawablePadding(builder.messageImageMargin);
        actionTextView.setCompoundDrawablePadding(builder.actionImageMargin);

        if (builder.backgroundColor != -2)
            snackbarView.setBackgroundColor(builder.backgroundColor);
        if (builder.messageTextColor != -1)
            mainTextView.setTextColor(builder.messageTextColor);
        if (builder.actionTextColor != -1)
            actionTextView.setTextColor(builder.actionTextColor);
    }

    public Snackbar getSnackbar() {
        return snackbar;
    }

    public void show() {
        snackbar.show();
    }

    public void dismiss() {
        if (snackbar.isShown())
            snackbar.dismiss();
    }

    public static class Builder {

        private View view;
        private String message = "";
        private String actionText = "";
        private int actionTextColor = -1;
        private int messageTextColor = -1;
        private int backgroundColor = -2;
        private View.OnClickListener clickListener = null;
        private boolean showIconOnly = false;
        private int messageImage = 0;
        private int actionImage = 0;
        private int actionImageMargin = 0;
        private int messageImageMargin = 0;
        private int duration = Snackbar.LENGTH_SHORT;
        private Typeface messageTypeface;
        private Typeface actionTypeface;
        private boolean isRtl = false;

        public Builder make(View view) {
            this.view = view;
            return this;
        }

        public Builder message(String message) {
            this.message = message;
            this.messageImageMargin = 0;
            return this;
        }

        public Builder message(String message, int imageRes) {
            this.message = message;
            this.messageImage = imageRes;
            this.messageImageMargin = 10;
            return this;
        }

        public Builder messageTypeface(Typeface typeface) {
            this.messageTypeface = typeface;
            return this;
        }

        public Builder messageTextColor(int color) {
            this.messageTextColor = color;
            return this;
        }

        public Builder actionText(String actionText, View.OnClickListener clickListener) {
            this.showIconOnly = false;
            this.actionText = actionText;
            this.clickListener = clickListener;
            this.actionImageMargin = 0;
            return this;
        }

        public Builder actionText(String actionText, int imageRes, View.OnClickListener clickListener) {
            this.showIconOnly = false;
            this.actionText = actionText;
            this.actionImage = imageRes;
            this.clickListener = clickListener;
            this.actionImageMargin = 10;
            return this;
        }

        public Builder actionIcon(int imageRes, View.OnClickListener clickListener) {
            this.showIconOnly = true;
            this.actionImage = imageRes;
            this.clickListener = clickListener;
            this.actionImageMargin = 0;
            return this;
        }

        public Builder actionTypeface(Typeface typeface) {
            this.actionTypeface = typeface;
            return this;
        }

        public Builder actionTextColor(int color) {
            this.actionTextColor = color;
            return this;
        }

        public Builder duration(int duration) {
            this.duration = duration;
            return this;
        }

        public Builder backgroundColor(int backgroundColor) {
            this.backgroundColor = backgroundColor;
            return this;
        }

        public Builder isRtl() {
            this.isRtl = true;
            return this;
        }

        public AMSnackbar build() {
            return new AMSnackbar( this);
        }

    }

}
