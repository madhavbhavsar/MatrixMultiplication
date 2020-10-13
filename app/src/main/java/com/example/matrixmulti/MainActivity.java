package com.example.matrixmulti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     /*


*/      //C[0][0]= A[0][0]*B[0][0];

        Button btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText[][] A = new EditText[3][3];
                A[0][0] = (EditText) findViewById(R.id.A00);
                A[0][1] = (EditText) findViewById(R.id.A01);
                A[0][2] = (EditText) findViewById(R.id.A02);
                A[1][0] = (EditText) findViewById(R.id.A10);
                A[1][1] = (EditText) findViewById(R.id.A11);
                A[1][2] = (EditText) findViewById(R.id.A12);
                A[2][0] = (EditText) findViewById(R.id.A20);
                A[2][1] = (EditText) findViewById(R.id.A21);
                A[2][2] = (EditText) findViewById(R.id.A22);
                EditText[][] B = new EditText[3][3];
                B[0][0] = (EditText) findViewById(R.id.B00);
                B[0][1] = (EditText) findViewById(R.id.B01);
                B[0][2] = (EditText) findViewById(R.id.B02);
                B[1][0] = (EditText) findViewById(R.id.B10);
                B[1][1] = (EditText) findViewById(R.id.B11);
                B[1][2] = (EditText) findViewById(R.id.B12);
                B[2][0] = (EditText) findViewById(R.id.B20);
                B[2][1] = (EditText) findViewById(R.id.B21);
                B[2][2] = (EditText) findViewById(R.id.B22);

                TextView[][] C = new TextView[3][3];

                C[0][0] = (TextView) findViewById(R.id.C00);
                C[0][1] = (TextView) findViewById(R.id.C01);
                C[0][2] = (TextView) findViewById(R.id.C02);
                C[1][0] = (TextView) findViewById(R.id.C10);
                C[1][1] = (TextView) findViewById(R.id.C11);
                C[1][2] = (TextView) findViewById(R.id.C12);
                C[2][0] = (TextView) findViewById(R.id.C20);
                C[2][1] = (TextView) findViewById(R.id.C21);
                C[2][2] = (TextView) findViewById(R.id.C22);



int i,j,k;
                float[][] X = new float[3][3];
                float[][] Y = new float[3][3];
                float[][] Z = new float[3][3];
                X[0][0] = Float.parseFloat(A[0][0].getText().toString());
                X[0][1] = Float.parseFloat(A[0][1].getText().toString());
                X[0][2] = Float.parseFloat(A[0][2].getText().toString());
                X[1][0] = Float.parseFloat(A[1][0].getText().toString());
                X[1][1] = Float.parseFloat(A[1][1].getText().toString());
                X[1][2] = Float.parseFloat(A[1][2].getText().toString());
                X[2][0] = Float.parseFloat(A[2][0].getText().toString());
                X[2][1] = Float.parseFloat(A[2][1].getText().toString());
                X[2][2] = Float.parseFloat(A[2][2].getText().toString());


                Y[0][0] = Float.parseFloat(B[0][0].getText().toString());
                Y[0][1] = Float.parseFloat(B[0][1].getText().toString());
                Y[0][2] = Float.parseFloat(B[0][2].getText().toString());
                Y[1][0] = Float.parseFloat(B[1][0].getText().toString());
                Y[1][1] = Float.parseFloat(B[1][1].getText().toString());
                Y[1][2] = Float.parseFloat(B[1][2].getText().toString());
                Y[2][0] = Float.parseFloat(B[2][0].getText().toString());
                Y[2][1] = Float.parseFloat(B[2][1].getText().toString());
                Y[2][2] = Float.parseFloat(B[2][2].getText().toString());

                Z[0][0]=0;
                //int i,j,k;
                for(i=0;i<3;i++)
                {
                    for(j=0;j<3;j++)
                    {
                        for(k=0;k<3;k++)
                        {

                            Z[i][j] += X[i][k]*Y[k][j];
                            //C[i][j] += A[i][k] * B[k][j];
                            C[i][j].setText(Z[i][j] +"");
                        }
                    }
                }
/*
                C[0][0].setText(Z[0][0] + " ");
                C[0][1].setText(Z[0][1] + " ");
                C[0][2].setText(Z[0][2] + " ");
                C[1][0].setText(Z[1][0] + " ");
                C[1][1].setText(Z[1][1] + " ");
                C[1][2].setText(Z[1][2] + " ");
                C[2][0].setText(Z[2][0] + " ");
                C[2][1].setText(Z[2][1] + " ");
                C[2][2].setText(Z[2][2] + " ");

*/

             //   TextView Coo = (TextView) findViewById(R.id.C00);
             //   Coo.setText(Z[0][0] + "");
            }
        });

    }
}
