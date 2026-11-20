# Android Beginners

Each Gradle module is a separate practice app. Install Gradle 8.10, JDK 17, and Android SDK Platform 35 with Build Tools 34.0.0. Set `JAVA_HOME` and `ANDROID_HOME` to those installations. The first build needs access to Google Maven and Maven Central unless the dependencies are cached. No Gradle wrapper or vendor binaries are bundled.

From this directory:

```powershell
gradle :lesson11:assembleDebug
# With an API 26+ device or emulator connected:
gradle :lesson11:installDebug
```

Open **011-012 User Interface** on the device: it shows a name field and a Log in button. This is a layout exercise, not an authentication service. `gradle projects` lists the modules; `gradle assembleDebug` builds all debug apps. Camera and notification examples depend on device capabilities and permissions.

Lessons 23–30 (portrait), 55 (video), 76 (map) and 77 (audio) are omitted: their required media was not cleared. The standalone SQLite sample uses the platform default app icon instead of the bundled artwork. Retained layouts, styles and shared LibGDX build settings are included; SDKs and library dependencies are not vendored.

Validation: All 25 debug APKs built offline against SDK 35. No device install or emulator run was tested.
