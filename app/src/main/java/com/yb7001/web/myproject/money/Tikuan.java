package com.yb7001.web.myproject.money;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.yb7001.web.myproject.R;
import com.yb7001.web.myproject.PK10TwoSide;

import butterknife.Bind;
import butterknife.ButterKnife;

public class Tikuan extends Activity {
    @Bind(R.id.btn_back)
    ImageButton btnBack;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tikuan);
        ButterKnife.bind(this);
        init();
        listenAction();
    }

    private void listenAction() {
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, PK10TwoSide.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void init() {
        mContext=this;
    }

}
