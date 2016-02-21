/*
 * Copyright 2015 Daniel Bälz
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

package de.dbaelz.onofftracker.models;

public class CardItem {
    public String title;
    public long screenOn;
    public long screenOff;
    public long unlocked;

    public CardItem(String title, long screenOn, long screenOff, long unlocked) {
        this.title = title;
        this.screenOn = screenOn;
        this.screenOff = screenOff;
        this.unlocked = unlocked;
    }
}