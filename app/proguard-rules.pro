# ProGuard rules untuk menjaga class dan metode penting

# Jangan obfuscate aplikasi utama
-keep class com.melapor.app.** { *; }

# Jangan hapus entry point Android
-keep public class * extends android.app.Activity
-keep public class * extends android.app.Application
-keep public class * extends android.app.Service
-keep public class * extends android.content.BroadcastReceiver
-keep public class * extends android.content.ContentProvider

# Untuk Parcelable (jika Anda pakai)
-keep class * implements android.os.Parcelable {
  public static final android.os.Parcelable$Creator *;
}

# Untuk dukungan Material dan AndroidX
-dontwarn androidx.**
-dontwarn com.google.android.material.**

# Hindari error dari R.java
-keepclassmembers class **.R$* {
    public static <fields>;
}