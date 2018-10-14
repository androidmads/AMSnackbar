# AMSnackbar
Tiny Library to ease snackbar customization.

## Features
### 1.0.0
Following features are available
[x] Can change background color 
[x] Can change message text color, action text color
[x] Can change typeface of message and action text
[x] Can change message text drawable, action text drawable
[x] Can use icon with action button
[x] RTL view also available

## How to Download
add the following library in your app level gradle file
```groovy
implementation 'com.androidmads.amsnackbar:library:1.0.0'
```
## How to Use
#### The steps to use this Library
```java
AMSnackbar amSnackbar = new AMSnackbar.Builder()
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
		.isRtl()
		.build();
amSnackbar.show();
```
## Using AMSnackbar
[Mail](mailto:mushtaqat3gb@gmail.com) me with your Google Play URL and I'll add your app to the list :)

<pre>
MIT License

Copyright (c) 2018 AndroidMad / Mushtaq M A

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

</pre>
