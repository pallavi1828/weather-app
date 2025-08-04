# 🌦️ Weather App

A dynamic weather forecast web application that displays real-time weather updates with animated background videos based on weather conditions like rain, snow, fog, or thunderstorm.

## 🚀 Features
- Fetches real-time weather using OpenWeatherMap API
- Beautiful, condition-based background animations (videos)
- Supports multiple cities and live updates

## 💻 Tech Stack
- **Frontend:** HTML, CSS, JavaScript
- **API:** OpenWeatherMap
- **Version Control:** Git & GitHub


---

## 📁 Project Structure

Weather-App/
│
├── index.html # Main HTML file
├── style.css # Styling for the app
├── script.js # JavaScript logic (API, DOM, etc.)
│
├── assets/
│ ├── icons/ # Optional: weather icons
│ └── fonts/ # Optional: custom fonts
│
├── videos/ # Compressed weather background videos
│ ├── clear-sky.mp4
│ ├── snow.mp4
│ ├── rain.mp4
│ ├── fog.mp4
│ └── thunderstorm.mp4
│
├── video_backup/ # 🔒 Original HD videos (NOT in Git)
│ └── *.mp4 # Large source files for backup
│
├── .gitignore # Ignore video_backup/, large files, etc.
└── README.md # This file


---

## 🔧 Setup
```bash
git clone <your-repo-url>
cd weather-app
# Open index.html in browser
