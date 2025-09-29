# ☁️ SkySense: Simple Modern Android Weather App With Core Concepts

SkySense is a simple, elegant mobile application built using Jetpack Compose to deliver real-time current weather conditions for any queried location globally. It follows modern Android development practices, ensuring a clean architecture and a responsive user experience.
its good for Understanding the Core Concepts of Android
## ✨ Project Highlights & Features

This application showcases a strong foundation in modern Android development:

### Core Features

* **City Search:** Instantly fetch live weather data for any location entered by the user.

* **Current Conditions:** Displays key metrics like **temperature** ($^\circ C$), weather **status** (icon and text), **humidity**, **wind speed**, and **UV Index**.

* **Local Time/Date:** Accurately extracts and displays the local time and date of the queried location from the API response.

* **Responsive UI:** Designed with a smooth, responsive Material 3 interface featuring cards, clear icons, and a custom **vertical gradient background**.

### State Handling

* **Graceful State Management:** Uses **LiveData** to manage three distinct states for the UI:

  * $\bullet$ **Loading:** Displays a `CircularProgressIndicator` while data is being fetched.

  * $\bullet$ **Success:** Renders the `WeatherDetails` card with the data.

  * $\bullet$ **Error:** Shows a clear error message if the network request fails.

## 💻 Tech Stack

The project is built using a modern and efficient tech stack:

* **Language:** Kotlin

* **UI Framework:** Jetpack Compose (Material 3)

* **Architecture:** MVVM (Model-View-ViewModel)

* **State Management:** ViewModel and LiveData

* **Concurrency:** Kotlin Coroutines

* **Networking:** Retrofit 2 + Gson

* **Image Loading:** Coil (AsyncImage)

* **Min. Permissions:** Internet only

## 🏗️ Architecture Breakdown

SkySense follows the **MVVM pattern** for separation of concerns:

* **ViewModel (`WeatherViewModel.kt`):**

  * $\bullet$ Orchestrates the data fetching logic using Kotlin Coroutines.

  * $\bullet$ Exposes the result to the UI via `LiveData<NetworkResponse<WeatherModel>>`.

* **Repository/Network:**

  * $\bullet$ Handled by the **Retrofit** interface (`WeatherApi`).

  * $\bullet$ Responsible for calling the external weather API endpoint.

* **UI (`WeatherPage.kt`):**

  * $\bullet$ Observes the LiveData stream.

  * $\bullet$ Renders the appropriate state (Loading, Error, or Success) based on the observed data.

## 📱 Screens & Structure

The application features a single-screen layout:

* **Main Screen:** Contains a persistent **Search Bar** (OutlinedTextField with a search icon button) at the top.

* **Result Card:** Displays all location, temperature, and key metrics in a centralized, visually organized card below the search bar.


## 🚀 Setup & Run

Follow these steps to get SkySense running locally:

1. Clone the repository and open the project in **Android Studio (Giraffe+ or newer)**.

2. Ensure you are using **JDK 17+** and the latest Android Gradle Plugin.

3. **Add Your WeatherAPI Key:**

   * The API key currently stored in `Constant.kt`.

   * *Security Warning:* For public GitHub, always replace this constant with a secure approach (e.g., using `local.properties` or environment variables) before pushing.

4. Build and run the application on a device or emulator with an active internet connection.

### API Configuration

* **Base URL:** `https://api.weatherapi.com`

* **Endpoint:** `/v1/current.json`

* **Query Parameters:** `key`, `q` (for query/city name)

* *(Note: To extend features like forecasts or change units, you would update the `WeatherApi` interface and the `WeatherModel` data class.)*
<p align="center">
<!-- Image 1: Search/Location Input -->
<img src="https://github.com/user-attachments/assets/064dbc53-192b-4e2d-b480-94b90bb6960d" width="32%" alt="Search Screen and Current Location" />
&nbsp;
<!-- Image 2: Detailed Weather View -->
<img src="https://github.com/user-attachments/assets/2a8610c1-15c0-4494-91b9-83c1b643e3f6" width="32%" alt="Detailed Weather Metrics Card" />
&nbsp;
<!-- Image 3: Key Metrics Card -->
<img src="https://github.com/user-attachments/assets/f64e70bf-9413-4936-a65d-a0ebd9eb6358" width="32%" alt="Weather Details and Key Metrics" />
</p>
  



