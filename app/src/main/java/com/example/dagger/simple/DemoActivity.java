/*
 * Copyright (C) 2013 The Dagger Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.dagger.simple;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public abstract class DemoActivity extends Activity {

	private TextView textView;
	private int clickCount;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_demo);
		// Perform injection so that when this call returns all dependencies will be available for use.
		((DemoApplication) getApplication()).component().inject(this);
		textView = (TextView) findViewById(R.id.text_view);

		testRetroLamdaCode();
	}

	private void testRetroLamdaCode() {
		findViewById(R.id.button).setOnClickListener(this::onButtonClicked);
	}

	@SuppressLint("SetTextI18n")
	private void onButtonClicked(View view) {
		clickCount++;
		textView.setText("Clicked Times : " + clickCount);
	}
}
