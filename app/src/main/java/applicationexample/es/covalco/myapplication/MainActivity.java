package applicationexample.es.covalco.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class
MainActivity extends AppCompatActivity {

    private Button btnAdd;
    private EditText txtNum1;
    private EditText txtNum2;
    //private applicationexample.es.covalco.myapplication.Icalculator icalculator=null;
    String[] fruits = {"Apple", "Banana", "Cherry", "Date", "Grape", "Kiwi", "Mango", "Pear"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        //btnSubstract
        txtNum1= (EditText) findViewById(R.id.txtNum1);
        txtNum2= (EditText) findViewById(R.id.txtNum2);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, fruits);
        AutoCompleteTextView actv = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
    }

    public void onClick(View view){

        //Toast.makeText(getApplicationContext(),"Hello Gerard", Toast.LENGTH_LONG).show();
        int num1 = Integer.parseInt(txtNum1.getText().toString());
        int num2 = Integer.parseInt(txtNum2.getText().toString());
        Icalculator icalculator = new calculator(num1, num2);
        int result = icalculator.add();
        Toast.makeText(getApplicationContext(),"The result of add is " + result,
        Toast.LENGTH_LONG).show();
    }

}
