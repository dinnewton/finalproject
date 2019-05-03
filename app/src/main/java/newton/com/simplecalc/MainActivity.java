package newton.com.simplecalc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText inputA, inputB;

    Button buttonMultiply;
    TextView TextViewPrice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputA = findViewById(R.id.inputA);
        inputB = findViewById(R.id.inputB);

        buttonMultiply = findViewById(R.id.buttonMultiply);
        TextViewPrice = findViewById(R.id.textView);


    }

    public void add(View view) {
        //Toast.makeText(this, "Adding", Toast.LENGTH_SHORT).show();
        //collect the data
        String a = inputA.getText().toString().trim();
        String b = inputB.getText().toString().trim();
        if (a.isEmpty() || b.isEmpty())
            return;
        //convert to number
        double x = Double.parseDouble(a);
        double y = Double.parseDouble(b);

        //calculate and show
        double result = x + y;
        TextViewPrice.setText("sum is " + result);
    }

    public void subtract(View view) {
        //Toast.makeText(this, "Subtracting", Toast.LENGTH_SHORT).show();
        String a = inputA.getText().toString().trim();
        String b = inputB.getText().toString().trim();
        if (a.isEmpty() || b.isEmpty())
            return;
        //convert to number
        double x = Double.parseDouble(a);
        double y = Double.parseDouble(b);

        //calculate and show
        double result = x - y;
        TextViewPrice.setText("diffrence is " + result);
    }

    public void divide(View view) {
        // Toast.makeText(this, "Divide", Toast.LENGTH_SHORT).show();
        String a = inputA.getText().toString().trim();
        String b = inputB.getText().toString().trim();
        if (a.isEmpty() || b.isEmpty())
            return;
        //convert to number
        double x = Double.parseDouble(a);
        double y = Double.parseDouble(b);

        //calculate and show
        double result = x / y;
        TextViewPrice.setText("division is " + result);


    }

    public void About(View view) {
        Intent e = new Intent(this, AboutActivity.class);
        startActivity(e);
    }
    }
