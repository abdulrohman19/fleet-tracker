# 🚗 Mini Fleet Tracker (Simulated IoT Fleet Management App)

A lightweight Android application that simulates fleet tracking with real-time sensor data using **Jetpack Compose**, **Google Maps**, and **Clean MVVM Architecture**.

---

## 📱 Features

### ✅ Core Features
- 📍 Live vehicle tracking on Google Maps
- ⚙️ Real-time simulated sensor data:
  - Engine status (on/off)
  - Door status (open/closed)
  - Speed (km/h)
- 🚨 In-app alerts for:
  - Overspeeding (> 80 km/h)
  - Door open while moving
  - Engine on/off state changes

### 🧪 Simulated IoT Data
- Simulated via background coroutine service
- Configurable data change interval
- Generated speed & statuses using random logic

---

## 🧠 Architecture

This app follows **Clean Architecture + MVVM** with modular separation:


---

## 🛠️ Tech Stack

| Category       | Tech Used                            |
|----------------|--------------------------------------|
| Language       | Kotlin                               |
| UI             | Jetpack Compose                      |
| Map            | Google Maps SDK, Maps Compose        |
| DI             | Hilt (Dagger 2)                      |
| Architecture   | Clean Architecture, MVVM             |
| Concurrency    | Kotlin Coroutines                    |
| Navigation     | Navigation Compose                   |
| Simulation     | Timer/Coroutine-based fake data      |
| Min SDK        | 24                                   |

---

## 🚀 Getting Started
```bash

### 1. Clone this repo

git clone https://github.com/abdulrohman19/fleet-tracker
cd mini-fleet-tracker

### 2. Add Google Maps API Key

Add Google Maps API Key
Edit your local.properties and string:
MAPS_API_KEY=YOUR_API_KEY_HERE

### 3. Open in Android Studio
Android Studio Hedgehog or newer is recommended

Sync Gradle and build the project



