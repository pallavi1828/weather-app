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


## 📁 Project Folder Structure

```

Weather-App/
│
├── index.html              # Main HTML file
├── style.css               # Styling for the app
├── script.js               # JavaScript logic (API, DOM, etc.)
│
├── assets/                 # Optional: static assets
│   ├── icons/              # Optional: weather icons
│   └── fonts/              # Optional: custom fonts
│
├── videos/                 # 🎬 Compressed weather background videos
│   ├── clear-sky.mp4
│   ├── snow\.mp4
│   ├── rain.mp4
│   ├── fog.mp4
│   └── thunderstorm.mp4
│
├── video\_backup/           # 🔒 Uncompressed original HD videos (NOT in Git)
│   └── \*.mp4               # Large raw backup videos
│
├── .gitignore              # Excludes video\_backup/ and large files
└── README.md               # Project documentation

```


## 🔧 Setup
```bash
git clone <your-repo-url>
cd weather-app
# Open index.html in browser to launch the Weather App in your default browser.
>  Make sure all files like `style.css`, `script.js`, and videos are in the correct folders as shown in the structure.
```



