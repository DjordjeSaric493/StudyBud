// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    alias(libs.plugins.dagger.hilt) apply false // Dodaj ovo
    id("com.google.devtools.ksp") version "1.9.0-1.0.12" //i ovo
}

//ksp ili kapt (cgpt generisano=
/*
*3. Ključne razlike između KSP i KAPT
Karakteristika	KSP	                                                KAPT
Tehnologija	Direktno procesira Kotlin simboličke informacije.	Konvertuje Kotlin u Java anotacije pre obrade.
Performanse	Brži zbog direktnog pristupa Kotlin simbolima.	    Sporiji zbog dodatnog sloja konverzije.
Kompatibilnost	Dizajniran za Kotlin.	                        Kompatibilan sa svim postojećim Java annotation procesorima.
Podrška za Kotlin funkcije	Razume Kotlin specifične funkcije   Ograničena podrška jer radi na Java nivou.
* (inline, suspend).
Ekosistem	Manji, ali rastući.	                                Široko podržan zbog nasleđivanja Java ekosistema.

ukratko, room i hilt podržavaju ksp pa peglamo njega jer je više kotlin orijentisan
* znate da se ranije (i dalje ) koristi(la) java intenzivno pa otud ovaj kapt
* u svakom slučaju, mnogo veće drkanje od flutter-a ali se skonta
 */