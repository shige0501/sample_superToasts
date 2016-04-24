package net.buildbox.sample.sample_supertoasts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.johnpersano.supertoasts.SuperToast;
import com.github.johnpersano.supertoasts.util.Style;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.helloButton)
    public void onHello() {
        SuperToast.create(this, "Hello, World", SuperToast.Duration.SHORT).show();
    }

    @OnClick(R.id.greenStyleButton)
    public void onGreenStyle() {
        SuperToast.create(this, "Hello world!", SuperToast.Duration.LONG,
            Style.getStyle(Style.GREEN, SuperToast.Animations.FLYIN)).show();
    }

    @OnClick(R.id.withIconButton)
    public void onWithIcon() {
        SuperToast superToast = new SuperToast(this);
        superToast.setDuration(SuperToast.Duration.LONG);
        superToast.setText("Hello world!");
        superToast.setIcon(SuperToast.Icon.Dark.INFO, SuperToast.IconPosition.LEFT);
        superToast.show();
    }
}
