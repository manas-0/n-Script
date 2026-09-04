# N/Script

An offline, no-login notes app for Android — built with Jetpack Compose, Room, and MVVM.

Create, search, edit, and delete notes entirely on-device. No account, no sign-in, no cloud sync — your notes stay on your phone.

## Screenshots

📸 [View app screenshots](https://drive.google.com/drive/folders/1CeX9trBB9XZtX7rtANKSx4sCrhooBML9)

## Features

- **Create, edit, and delete notes** with title and content
- **Live search** across note titles and content
- **Offline-first** — all data stored locally with Room, no internet required
- **No login required** — open the app and start writing
- **Material 3** design with dynamic color support (Android 12+)

## Download

The latest release APK is available here:

**[N/Script v1.0.0 — Download APK](https://github.com/manas-0/n-Script/releases/tag/v1.0.0)**

Download `app-release.apk` from the release assets and install it directly on your device (you may need to enable "Install from unknown sources" in your Android settings).

## Requirements

- **Minimum Android version:** Android 14 (API 34)
- **Target SDK:** Android 16 (API 36)

## Tech Stack

- **Kotlin**
- **Jetpack Compose** — declarative UI
- **Room** — local persistence
- **MVVM architecture** — ViewModel + Repository pattern
- **Navigation Compose** — in-app navigation
- **Kotlin Coroutines** — async database operations
- **LiveData** — reactive data streams from Room to the UI

## Architecture

```
data/          → Room entities, DAO, and database
repository/    → single source of truth, mediates between DAO and ViewModel
viewmodel/     → UI state and business logic, exposed via LiveData
ui/            → Jetpack Compose screens (list, add/edit) and navigation
```

## Building from Source

```bash
git clone https://github.com/manas-0/n-Script.git
cd n-Script
```

Open the project in Android Studio and run it on an emulator or device (API 34+).

## License

This project is open for personal and educational use. Feel free to explore the code.

---

##  Contact

**Manas More**
- GitHub: [manas-0](https://github.com/manas-0)
- Email: manas.developer01@gmail.com
