# Java_TabLayout

![image](https://user-images.githubusercontent.com/60017090/137490727-b4ac0596-f52f-44b5-938e-1c4dda5c2efd.png)


      
      
      
      
       
     <style name="MineCustomTabText" parent="TextAppearance.Design.Tab">
            <item name="android:textSize">10sp</item>
            <item name="android:textAllCaps">false</item>
     </style>


   <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".MainActivity">

     <com.google.android.material.tabs.TabLayout
        android:id="@+id/tablayout"
        app:tabTextColor="#FF5722"
        app:tabIndicatorColor="#CDDC39"
        app:tabSelectedTextColor="@color/white"
        app:tabTextAppearance="@style/MineCustomTabText"
        app:tabIconTint="@color/tabcolor"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="@color/purple_500"
        ></com.google.android.material.tabs.TabLayout>
    <androidx.viewpager.widget.ViewPager
        android:id="@+id/viewpager"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical"></androidx.viewpager.widget.ViewPager>

 </LinearLayout>
