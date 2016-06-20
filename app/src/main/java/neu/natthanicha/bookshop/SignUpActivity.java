package neu.natthanicha.bookshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {

    // Explicit ประกาศตัวแปร
    private EditText nameEditText, usernameEditText, passwordEditText;
    private String nameString, usernameString,passwordString;
    private static final String urlPHP = "http://swiftcodingthai.com/neu/add_user_wahn.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //Bind Widget
        nameEditText = (EditText) findViewById(R.id.editText);
        usernameEditText = (EditText) findViewById(R.id.editText2);
        passwordEditText = (EditText) findViewById(R.id.editText3);


    }   // Main Method

    public void clickSignUpSign(View view) {

        nameString = nameEditText.getText().toString().trim();
        usernameString = usernameEditText.getText().toString().trim();
        passwordString = passwordEditText.getText().toString().trim();

        //Check Space
        if (nameString.equals("") ||usernameString.equals("") || passwordString.equals("")){
            //Have Space
            MyAlert myAlert = new MyAlert();
            myAlert.myDialog(this, "มีช่องว่าง","กรุณากรอกช่องว่าง คะ");

        } else {
            //no Space
            uploadToServer();

        }

    }   // clickSign

    private void uploadToServer() {

    }


}   // main Class
