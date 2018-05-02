package anupam.acrylic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends Activity {

  private Handler handler;
  private Runnable runnable;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);

    handler = new Handler();
    runnable = new Runnable() {
      @Override public void run() {
        startActivity(new Intent(Splash.this, EasyPaint.class));
        finish();
      }
    };
    handler.postDelayed(runnable, 1000);
  }

  @Override protected void onDestroy() {
    super.onDestroy();
    handler.removeCallbacks(runnable);
  }
}
