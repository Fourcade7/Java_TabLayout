![image](https://user-images.githubusercontent.com/60017090/137490727-b4ac0596-f52f-44b5-938e-1c4dda5c2efd.png)


      
      
      
//res/values/themes      
       
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
 
 
 //res/color/tabcolor
 
     <selector xmlns:android="http://schemas.android.com/apk/res/android">
       <item android:color="#FF5722" android:state_selected="true"/>
       <item android:color="#CDDC39"/>
    </selector>
    
    
    
    
 //MyPager.class
 
 
    public class MyPager extends FragmentPagerAdapter {
     Context context;
     int tab_count;

    public MyPager(@NonNull FragmentManager fm, Context context, int tab_count) {
        super(fm);
        this.context = context;
        this.tab_count = tab_count;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                BlankFragment blankFragment = new BlankFragment();
                return blankFragment;
            case 1:
                BlankFragment2 blankFragment2 = new BlankFragment2();
                return blankFragment2;
            case 2:
                BlankFragment3 blankFragment3 = new BlankFragment3();
                return blankFragment3;
        }
        return null;
    }

    @Override
    public int getCount() {
        return tab_count;
      }
    }
    
//MainActivity

    public class MainActivity extends AppCompatActivity {
     TabLayout tabLayout;
     MyPager myPager;
     ViewPager viewPager;
     @Override
     protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout=findViewById(R.id.tablayout);
        viewPager=findViewById(R.id.viewpager);

        tabLayout.addTab(tabLayout.newTab().setText("Home").setIcon(R.drawable.ic_baseline_home_24));
        tabLayout.addTab(tabLayout.newTab().setText("Product").setIcon(R.drawable.ic_baseline_backup_24));
        tabLayout.addTab(tabLayout.newTab().setText("Order").setIcon(R.drawable.ic_baseline_favorite_border_24));

        myPager=new MyPager(getSupportFragmentManager(),this,tabLayout.getTabCount());

        viewPager.setAdapter(myPager);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

     }
    }


