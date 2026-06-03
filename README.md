# Virtue Tracker

A small native Android app for tracking items **daily**. It ships pre-loaded with
**Benjamin Franklin's 13 virtues** (with his original precepts) as the default list,
following Franklin's practice of marking each day whether he lived up to each virtue.

## Features

- **Daily check-off** — tick each item for the current day; progress (`X / N`) is shown at the top.
- **Browse by day** — move to previous/next days to review or backfill history (you can't go past today).
- **Franklin's 13 virtues by default** — Temperance, Silence, Order, Resolution, Frugality,
  Industry, Sincerity, Justice, Moderation, Cleanliness, Tranquillity, Chastity, Humility,
  each with Franklin's own description.
- **Customizable** — add, edit, or delete items to track any habit you like.
- **Reset** — restore the default 13 virtues from the overflow menu (daily history is kept).
- **Offline & private** — all data is stored locally on the device (SharedPreferences); no network access.

## Tech

- Kotlin + Jetpack Compose (Material 3)
- Single-activity architecture with a `ViewModel`
- Local persistence via `SharedPreferences` (JSON), no external services
- `minSdk 24`, `targetSdk/compileSdk 34`

## Building

The Android SDK is required (`local.properties` must point to it via `sdk.dir`, or set
`ANDROID_HOME`). Then:

```bash
./gradlew assembleDebug
```

The APK is produced at:

```
app/build/outputs/apk/debug/app-debug.apk
```

## Installing the APK

Copy the APK to an Android device and open it (you may need to allow "install from
unknown sources"), or via adb:

```bash
adb install -r app/build/outputs/apk/debug/app-debug.apk
```
