# BookXchange 📚🌱

> **Sustainable Peer-to-Peer Book Sharing Platform for Students and Readers**  
> Powered by **Jetpack Compose**, **Firebase**, and **Google Gemini AI**.

---

## 🌟 Overview

**BookXchange** is a modern Android application designed to promote sustainable reading habits, reduce textbook costs for students, and foster local book-sharing communities. Readers can discover nearby books, exchange books using secure QR-code handovers, track their environmental impact, and get tailored reading recommendations powered by Google Gemini AI.

---

## ✨ Key Features

### 1. 🤖 Gemini AI Book Scanner
- **Instant Cover Analysis**: Point the camera or upload a book photo to extract Title, Author, ISBN, Publisher, and Edition using Google Gemini multimodal AI.
- **Auto-Enrichment**: Cross-references Google Books API for high-resolution cover artwork, summaries, page counts, and categories.

### 2. ✨ AI Book Matchmaker
- Conversational book discovery matching readers to titles based on current mood, genre preferences, and reading pace.

### 3. 🌱 Eco Impact & Sustainability Tracker
- Quantifies every book exchange into real environmental benefits:
  - **Trees Saved**
  - **CO₂ Offset (kg)**
  - **Water Saved (Liters)**
  - **Money Saved (₹)**
- Share eco achievements directly to social media with one tap.

### 4. 🔒 Secure P2P QR Code Handovers
- **End-to-End Verification**: Scans encrypted `BOOKXCHANGE:` QR payloads to confirm handovers and returns in-person, preventing dispute or lost books.

### 5. 💬 Real-Time Chat & Safe Meetups
- Integrated chat between book owners and borrowers.
- **Safe Meetup Spot Suggestions**: Recommends public, safe, and well-lit meetup locations (libraries, school campuses, coffee shops).

### 6. 🏆 Gamification & Trust Points
- 2026 Reading Challenge tracker with percentage progress.
- Trust score system encouraging timely returns and book care.
- Community Eco Leaderboard.

---

## 🛠 Tech Stack

- **UI Framework**: Android Jetpack Compose & Material 3
- **Language**: Kotlin / Java
- **Backend & Cloud**:
  - Firebase Authentication (Google Sign-In)
  - Cloud Firestore (Real-time book listings, requests, chats)
  - Firebase Cloud Messaging (FCM for push notifications)
- **AI & Computer Vision**:
  - Google Gemini API (`gemini-1.5-flash`)
  - Google ML Kit (Text Recognition & Barcode / QR Scanning)
- **Networking**: Retrofit 2, OkHttp 4, Kotlinx Serialization
- **Architecture**: MVVM (Model-View-ViewModel) with Kotlin Coroutines and StateFlow

---

## 🚀 Release Candidate & Bug Fix Highlights

The current codebase includes production polish and critical bug fixes verified live on physical Android 16 hardware:

1. **User Identity & Book Ownership Resolution**:
   - Implemented unified identity resolution matching Google Sign-In emails (`chindhulurushivasumukesh@gmail.com`) with book author/owner records (`sumukesh.ccc@gmail.com` / `Shiva Sumukesh Chindhuluru`).
   - Fixed `My Books` filter counter across Feed and Profile screens.

2. **Feed Screen Title Sizing**:
   - Expanded book title column from a squished 8px width to 194px with full multi-line wrapping.
   - Owner actions (`Accept`, `Decline`, `Handover Scan`) render cleanly alongside status badges (`REQUESTED`, `PENDING_TRANSFER`).

3. **Add Book Screen Layout Accessibility**:
   - Rebalanced container spacing and nested Scaffold insets.
   - All three action buttons (`Scan Book Cover (AI)`, `Take Quick Photo`, and `Upload from Gallery`) are fully visible on screen without requiring scrolling, while retaining full scroll support on smaller devices.

4. **Chats & FAB Collision**:
   - Cleaned up redundant outlined button in empty conversation state so the circular green chat FAB floats without obstruction.

5. **Profile Screen Books Tab**:
   - Replaced "No Books Added Yet" false empty state with accurate real-time owned book list and status indicators.

6. **Play Store Referral Link Integration**:
   - Configured all referral and eco-share intents with the official Google Play Store URL:  
     `https://play.google.com/store/apps/details?id=com.BookXchange.app`

---

## 📁 Repository Structure

```
├── app/
│   └── src/
│       └── main/
│           ├── AndroidManifest.xml   # App components, permissions, and intents
│           ├── assets/               # ML Kit OCR & Barcode TFLite models
│           ├── java/com/example/     # Reconstructed source code (Screens, ViewModels, API)
│           └── res/                  # Drawables, layouts, values, mipmaps
├── smali_patch/                      # Working smali bytecode and apktool project
│   ├── apktool.yml
│   └── com/example/
├── .gitignore
└── README.md
```

---

## 👨‍💻 Creator & Developer

**Shiva Sumukesh Chindhuluru**  
*Grade 9 Student & Creator of BookXchange*  
Contact: [sumukesh.ccc@gmail.com](mailto:sumukesh.ccc@gmail.com)
