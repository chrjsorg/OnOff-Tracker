/*
 * Copyright 2016 Daniel Bälz
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

package de.dbaelz.onofftracker.activities.chart;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.joda.time.DateTime;

import de.dbaelz.onofftracker.R;

public class ChartActivity extends AppCompatActivity {
    public static final String START_DATE = "start_date";
    public static final String END_DATE = "end_date";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart);
        if (getActionBar() != null) {
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }

        if (getIntent() != null) {
            DateTime startDate = (DateTime) getIntent().getSerializableExtra(START_DATE);
            DateTime endDate = (DateTime) getIntent().getSerializableExtra(END_DATE);
        }
    }
}
