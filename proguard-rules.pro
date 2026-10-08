# ==============================================================================
# ProGuard & R8 Configuration for BookXchange
# Clean configuration: Retains required models & reflection points while 
# maximizing obfuscation (>25%) and code shrinking.
# ==============================================================================

# ------------------------------------------------------------------------------
# 1. General R8 / Android Optimization Settings
# ------------------------------------------------------------------------------
-optimizationpasses 5
-dontusemixedcaseclassnames
-dontskipnonpubliclibraryclasses
-verbose

# Keep line numbers and source attributes for crash reporting / stack traces
-keepattributes SourceFile,LineNumberTable,InnerClasses,EnclosingMethod,Signature,Exceptions,*Annotation*

# ------------------------------------------------------------------------------
# 2. Retrofit 2 & OkHttp
# ------------------------------------------------------------------------------
# Keep interface methods and annotations required for runtime reflection
-keepattributes RuntimeVisibleAnnotations,RuntimeInvisibleAnnotations
-keepattributes RuntimeVisibleParameterAnnotations,RuntimeInvisibleParameterAnnotations

-keepclassmembers,allowobfuscation interface * {
    @retrofit2.http.* <methods>;
}

-dontwarn retrofit2.**
-keep class retrofit2.** { *; }
-dontwarn okhttp3.**
-dontwarn okio.**

# ------------------------------------------------------------------------------
# 3. Kotlinx Serialization
# ------------------------------------------------------------------------------
# Keep serializer companion objects and generated serializer implementations
-keepattributes *Annotation*,Signature

-keepclassmembers class * {
    *** Companion;
}

-keepclasseswithmembers class * {
    kotlinx.serialization.KSerializer serializer(...);
}

-keepclassmembers class * {
    @kotlinx.serialization.Serializable <fields>;
}

-keepclassmembers class * implements kotlinx.serialization.KSerializer {
    <fields>;
    <methods>;
}

# Keep serializable data classes in app packages without disabling member name obfuscation
-keep,allowobfuscation class com.example.api.** { *; }
-keepclassmembers class com.example.api.** {
    *** Companion;
    *** serializer(...);
    @kotlinx.serialization.SerialName <fields>;
}

# ------------------------------------------------------------------------------
# 4. Firebase Firestore & Data Models
# ------------------------------------------------------------------------------
# Firestore uses reflection to serialize and deserialize POJOs / beans.
# Must preserve no-arg constructors and public getters/setters.
-keepclassmembers class com.example.data.** {
    public <init>();
    public <init>(...);
    public <methods>;
    public <fields>;
}

# Keep Firestore annotations
-keepattributes *Annotation*
-dontwarn com.google.firebase.**
-keep class com.google.firebase.firestore.** { *; }

# ------------------------------------------------------------------------------
# 5. Jetpack Compose
# ------------------------------------------------------------------------------
# Ensure Compose runtime inspection and state stability remain intact
-keepclassmembers class * {
    @androidx.compose.runtime.Composable *;
}

-dontwarn androidx.compose.**

# ------------------------------------------------------------------------------
# 6. ML Kit & Google Play Services
# ------------------------------------------------------------------------------
-keep class com.google.mlkit.** { *; }
-dontwarn com.google.mlkit.**
-keep class com.google.android.gms.** { *; }
-dontwarn com.google.android.gms.**
