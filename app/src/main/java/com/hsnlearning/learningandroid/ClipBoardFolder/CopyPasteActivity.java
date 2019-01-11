package com.hsnlearning.learningandroid.ClipBoardFolder;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.hsnlearning.learningandroid.R;

//iski koi gradle file ni h ye just code r xml ma designing ki ha simple
public class CopyPasteActivity extends AppCompatActivity {
    EditText edtCopy,edtPaste;
    Button btnCopy,btnPaste;

    //ye dono lyny prygy copy paste k lye
    ClipboardManager clipboardManager;
    ClipData clipData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_copy_paste);

        edtCopy= this.<EditText>findViewById(R.id.copytxtD);
        edtPaste= this.<EditText>findViewById(R.id.pastetxtD);

        btnCopy= this.<Button>findViewById(R.id.copytxtbtnD);
        btnPaste= this.<Button>findViewById(R.id.pastetxtbtnD);

        clipboardManager= (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);

        //copy  k lye code
        btnCopy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String copy=edtCopy.getText().toString();
                clipData=ClipData.newPlainText("text",copy);
                clipboardManager.setPrimaryClip(clipData);

                Toast.makeText(CopyPasteActivity.this, "Text Copied", Toast.LENGTH_SHORT).show();
            }
        });

        //paste k lye code
            btnPaste.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ClipData data=clipboardManager.getPrimaryClip();
                    ClipData.Item item=data.getItemAt(0);

                    String text=item.getText().toString();
                    edtPaste.setText(text);

                    Toast.makeText(CopyPasteActivity.this, "Text Paste", Toast.LENGTH_SHORT).show();

                }
            });
    }
}
