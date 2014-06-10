package com.woodystech.horsevalue;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import com.google.ads.*;
import com.woodystech.model.Horse;

public class AddHorseActivity extends Activity
{
  private Horse horse;
  private Ranch ranch;
  
  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_add_horse);
    
    // Look up the AdView and load request
    AdView adView = (AdView)this.findViewById(R.id.adView);
    AdRequest adRequest = new AdRequest();
    adView.loadAd(adRequest);
    
    horse = new Horse();
    ranch = new Ranch();
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu)
  {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.add_horse, menu);
    return true;
  }

}
