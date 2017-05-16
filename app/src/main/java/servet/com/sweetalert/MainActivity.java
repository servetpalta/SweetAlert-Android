package servet.com.sweetalert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt=(Button)findViewById(R.id.button);


    bt.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        new SweetAlertDialog(MainActivity.this,SweetAlertDialog.WARNING_TYPE).setTitleText("Are you sure").setContentText("You Won't be able to recover this file!")
                .setConfirmText("Ok").setCancelText("Cancel").showCancelButton(true).setCancelClickListener(new SweetAlertDialog.OnSweetClickListener() {
            @Override
            public void onClick(SweetAlertDialog sweetAlertDialog) {

                sweetAlertDialog.cancel();

            }

        }).setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
            @Override
            public void onClick(SweetAlertDialog sweetAlertDialog) {


                new SweetAlertDialog(MainActivity.this).setTitleText("Ok Clicked").show();

            }
        }).show();



      }
      });

    }
}
