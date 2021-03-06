[open meh](https://github.com/Jawnnypoo/open-meh)
=========

Open source meh.com Android App
![screenshot](https://github.com/Jawnnypoo/open-meh/raw/master/assets/screenshot-1.png)

<a href="https://play.google.com/store/apps/details?id=com.jawnnypoo.openmeh">
  <img alt="Get it on Google Play"
       src="https://github.com/Jawnnypoo/open-meh/raw/master/assets/google-play-badge-small.png" />
</a>

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Open%20Meh-green.svg?style=flat)](https://android-arsenal.com/details/3/1999) [![Build Status](https://travis-ci.org/Jawnnypoo/open-meh.svg?branch=master)](https://travis-ci.org/Jawnnypoo/open-meh)

[meh.com](https://meh.com/) is a deal of the day shopping experience filled with humerous writing and great personality. Once they opened up support for an API, an Android app was born. And recently, a wearable app was born as well. Feel free to open the source up and take a look. Especially the wearable bits. That was a complicated beast. 

#Building
You will need to generate your own API key from [meh](https://meh.com/forum/topics/meh-api) and add it to your gradle.properties file (create one in your home directory, under .gradle). You will also need to create an API key for the [YouTube API](https://developers.google.com/youtube/android/player/) if you want videos to show up while you are building. The app also uses Fabric for Crashlytics, so you will need to generate your own crashlytics key. All in all, your gradle.properties will look something like this:
```Gradle
OPEN_MEH_MEH_API_KEY = "MEH_API_KEY_GOES_HERE"
OPEN_MEH_GOOGLE_API_KEY = "YOUTUBE_API_KEY_HERE_OR_RANDOM_STRING_IF_YOU_DONT_CARE"
OPEN_MEH_FABRIC_KEY = FABRIC_KEY_GOES_HERE_BUT_ONLY_REALLY_NEEDED_FOR_RELEASE_BUILDS
```

#Libraries
The following 3rd party libraries are the reason this app works. Rapid development is easily attainable thanks to these fine folks and the work they do:

- AppCompat (https://developer.android.com/tools/support-library/features.html)
- Design (https://developer.android.com/tools/support-library/features.html)
- RecyclerView (https://developer.android.com/tools/support-library/features.html)
- Custom Tabs (https://developer.android.com/tools/support-library/features.html)
- Retrofit (http://square.github.io/retrofit/)
- OkHttp (http://square.github.io/okhttp/)
- Glide (https://github.com/bumptech/glide)
- Butter Knife (http://jakewharton.github.io/butterknife/)
- Timber (https://github.com/JakeWharton/timber)
- GSON (https://github.com/google/gson)
- Bypass (https://github.com/Uncodin/bypass)
- CircleIndicator (https://github.com/ongakuer/CircleIndicator)
- Material-ish Progress (https://github.com/pnikosis/materialish-progress)
- PhysicsLayout (https://github.com/Jawnnypoo/PhysicsLayout)
- CircleImageView (https://github.com/hdodenhof/CircleImageView)
- MaterialDateTimePicker (https://github.com/wdullaer/MaterialDateTimePicker)
- Easel (https://github.com/Commit451/Easel)
- Gimbal (https://github.com/Commit451/Gimbal)

#Contribution
Pull requests are welcomed and encouraged. If you experience any bugs, please [file an issue](https://github.com/Jawnnypoo/open-meh/issues/new)

License
=======

    Copyright 2015 John Carlson

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
