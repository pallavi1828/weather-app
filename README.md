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

## 📁 Folder Structure
- Weather App/
│
├── index.html                 # Main HTML page
├── style.css                  # Custom styles
├── script.js                  # JavaScript for API calls and DOM updates
│
├── assets/
│   ├── icons/                 # Weather icons (optional)
│   └── fonts/                 # Any custom fonts (if used)
│
├── videos/                    # Weather background videos (compressed)
│   ├── clear-sky.mp4
│   ├── snow.mp4
│   ├── rain.mp4
│   ├── fog.mp4
│   └── thunderstorm.mp4
│
├── .gitignore                 # Ignores video_backup and large files
├── README.md                  # This file
└── video_backup/              # Original uncompressed videos (not tracked by Git)




## 🔧 Setup
```bash
git clone <your-repo-url>
cd weather-app
# Open index.html in browser
