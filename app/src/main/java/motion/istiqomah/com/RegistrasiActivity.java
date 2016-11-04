package motion.istiqomah.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class RegistrasiActivity extends AppCompatActivity {

    EditText username, password, fullname;
    CheckBox mentor;
    Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);

        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
        fullname = (EditText)findViewById(R.id.fullname);
        mentor = (CheckBox)findViewById(R.id.mentor);
        signup = (Button)findViewById(R.id.daftar);

        signup.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //String stringUsername = username.getText();
            }
        });
    }



}
