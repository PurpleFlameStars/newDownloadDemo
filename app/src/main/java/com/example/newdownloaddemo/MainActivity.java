package com.example.newdownloaddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.newdownloaddemo.utils.DownloadUtils;

public class MainActivity extends AppCompatActivity {

    private DownloadUtils downloadUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      TextView text_download= findViewById(R.id.text_download);
        downloadUtils = new DownloadUtils(MainActivity.this);
        text_download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                downloadUtils.downloadAPK("http://gdown.baidu.com/data/wisegame/55dc62995fe9ba82/jinritoutiao_448.apk", "jinritoutiao_448.apk");
            }
        });
    }
}
