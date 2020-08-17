This project was tested with Qt 5.14.2 built from source.
Tested on Android 7.1.2 (STB is my target device) with api level 25
It builds well, it deploys well.

How to start service after deploy:
adb shell am startservice org.example.service/.ExampleService