# Android Beginners

Each Gradle module is a separate practice app. Install Gradle 8.10, JDK 17, and Android SDK Platform 35 with Build Tools 34.0.0. Set `JAVA_HOME` and `ANDROID_HOME` to those installations. The first build needs access to Google Maven and Maven Central unless the dependencies are cached. No Gradle wrapper or vendor binaries are bundled.

From this directory:

```powershell
gradle :lesson11:assembleDebug
# With an API 26+ device or emulator connected:
gradle :lesson11:installDebug
```

Open **011-012 User Interface** on the device: it shows a name field and a Log in button. This is a layout exercise, not an authentication service. `gradle projects` lists the modules; `gradle assembleDebug` builds all debug apps. Camera and notification examples depend on device capabilities and permissions.

Four media lessons use independently generated fixtures rather than the original media:

| Module | What to try |
| --- | --- |
| `:lesson23` (23–30) | Enter two captions and tap **Preview** to overlay them on a geometric portrait. |
| `:lesson55` | Play the two-second silent animation of a moving dot. |
| `:lesson76` | Drag to pan across a diagram of fictional islands. |
| `:lesson77` | Press to hear a short beep and a lower sustained tone; release to pause the sustained tone. |

Build these four with `gradle :lesson23:assembleDebug :lesson55:assembleDebug :lesson76:assembleDebug :lesson77:assembleDebug`. The SQLite sample uses the platform default icon; SDKs and vendor binaries are not bundled.

Validation: The original 25 modules and the four restored modules built offline against SDK 35 in separate runs. All five replacement media files were verified in the restored debug APKs. Device installation, playback and gestures were not tested.
