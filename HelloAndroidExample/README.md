Hello Android Example
=====================

This repo acts as example code for an Intro To Android Code Camp presentation. The goal is to take a student who has no experience in Android and give him or her the tools necessary to start developing in Android. It is not meant to be comprehensive (a Code Camp talk is generally only about an hour), but should build the foundation so the student knows some of the questions to ask or where to look for answers as they get on their way.

Slides for the presentation are available [here] (https://speakerdeck.com/alphonzo79/hello-android).

Branches
--------

The repo is separated into four distinct branches: `master`, `step_one`, `step_two` and `step_three`. The branches each stand alone, but build upon each other as they progress through the steps.

### Master
The `master` branch doesn't actually have much of use except this readme and the basic project setup. It's just a landing for what's in the other branches. Start at `step_one`

### Step One
The `step_one` branch demonstrates the bare minimum of an Android app. This is essentially what the user will end up with after completing the New Project Wizard in Android Studio, with only a couple of modifications. This is a valid Android App that can be launched on am emulator or device, but only displays a single TextView that says "Hello." This branch shows the student how and Activity is wired up in the Manifest, demonstrates some of the lifecycle events of an Activity and shows how a layout resource is inflated to the screen.

### Step Two
The `step_two` branch begins to do some real work. We replace a hard-coded String with a String Resource, add some elements to the screen and allow some user interaction. It introduces finding elements from the layout (including naming them in the layout) and attaching OnClick listeners thorugh a variety of methods. It uses the xml layout resource to place elements in their rightful places on the screen and adds some styling. Also, it does a little bit of modification at run time, including changing text in a TextView and enabling some buttons, but still leaves a little to be desired.

### Step Three
the `step_three` branch begins to look a little more like a full-fledged app in that it also includes some navigation and data transfer across components. It introduces the concept of Explicit Intents vs. Implicit Intents. 

NOTE: With the latest version of Gradle and Andriod Studio's ability to hot-swap code, it may be neccesary to perform a Gradle Clean and Sync when switching branches before the changes will be picked up.

Setup
-----

Since the presentation that goes along with this sample project very quickly glosses over the setup process, some of it is laid out here. Although this is meant to be an intro to Android, it is assumed that the student has experience, or at least exposure, to development on other platforms and is familiar with concepts like IDEs, SDKs and setting up a development environment.

The user will need to install the [Java JDK] (http://www.oracle.com/technetwork/java/javase/downloads/index.html) if it is not already present on the machine. (Android does not support Java 8 and later. You can use latest Java, just no features above 7)

[Android Studio] (http://developer.android.com/sdk/installing/studio.html) is the preferred IDE for developing Android apps. It is built on top of IntelliJ community edition and has a lot of great Android-specific tooling included. There is no longer any other real choice for developing Andriod, in my opinion.

Along with Android Studio, the student will also need to install the [Android SDK] (https://developer.android.com/sdk/index.html). Recent versions of the AS download include the SDK and SDK manager with it, so this may be an unnecessary step.

If installation of Android Studio did not modify environment variables and the `PATH` for you, then it may be necessary to set `$JAVA_HOME` and `$ANDROID_HOME` in the environment variables. Also, `PATH` should be modified to include `$JAVA_HOME`, `$JAVA_HOME/bin`, `$ANDROID_HOME`, `$ANDROID_HOME/bin`, `$ANDROID_HOME/platform_tools` and `$ANDROID_HOME/tools`.

Android uses Gradle for its build system. Those interested in doing build work on the command line may consider installing Gradle independently. But Android Studio provides a Gradle Wrapper in each project, which makes this unnecessary. 

There are a few ways to run an Android app as you are developing it. The SDK comes with an Android Virtual Device manager, which can be used to create and run emulators. Historically these have been slow and painful, but word is they have improved immensely in recent years. Individuals developing non-commercialy may use [Genymotion] (https://www.genymotion.com/) virtual devices instead. These are VMs and may require Oracle's Virtual Box to be installed first (this may not be the case on Windows, but I don't recall). 

For me, the preference is to simply run on my phone or tablet. This requires Developer Options to be enabled. This is done by entering Settings -> About Device (or something similar) and tapping on Build Number 7 times. At this point the device will include an additional Developer Options item in the settings. The user should enter that and turn on USB Debugging. Now Android Studio should "see" the phone and present it as a target option upon launch.

Finally, if all else fails, ask Google. There are plenty of tutorials on setting up and Android development environment.