package anupam.acrylic;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class Splash extends AppCompatActivity {

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
