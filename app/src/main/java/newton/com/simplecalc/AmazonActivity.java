package newton.com.simplecalc;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AmazonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amazon);
    }

    public void Alibaba(View view) {
        Intent e = new Intent(this, AlibabaActivity.class);
        startActivity(e);
    }

    public void amazon(View view) {
        Uri webpage = Uri.parse("https://www.amazon.com");
        Intent intent = new Intent(Intent.ACTION_VIEW,webpage);
        startActivity(intent);
    }
}
