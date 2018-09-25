package com.example.andriod.devcon;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView facebook, youtube, twitter, email, web, slack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        this part allow user to send us an email
        email = findViewById(R.id.emailAddress);

        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL, "main@devcongress.org");
                intent.putExtra(Intent.EXTRA_SUBJECT, "When is the next dev congress");

                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

//        this part opens the web page

        web = findViewById(R.id.website);

        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.devcongress.org/"));
                startActivity(intent);
            }
        });
//        this part opens the youtube page
        youtube = findViewById(R.id.youtubechannel);
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/devcongress"));
                startActivity(intent);
            }
        });

//        this part opens the facebook page
        facebook = findViewById(R.id.facebookpage);
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/DevCongress/"));
                startActivity(intent);
            }
        });

//        this part opens the twitter page

        twitter = findViewById(R.id.twitterpage);
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.devcongress.org/twitter.com/devcongress"));
                startActivity(intent);
            }
        });

//        this part opens the slack page

        slack = findViewById(R.id.slackpage);
        slack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://devcongress-community.slack.com/"));
                startActivity(intent);
            }
        });
    }
}
