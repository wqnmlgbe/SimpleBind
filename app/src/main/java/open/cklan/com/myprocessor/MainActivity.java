package open.cklan.com.myprocessor;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import open.cklan.com.annotation.BindLayout;
import open.cklan.com.annotation.BindView;
import open.cklan.com.myprocessor.bind.BindHelper;

@BindLayout(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {
    @BindView(R.id.tv_show)
    TextView tvShow;
    @BindView(R.id.btn_change)
    Button btnChange;

    private int clickCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BindHelper.bind(this);
        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvShow.setText("你看看我是不是变了,你点了我"+(++clickCount)+"下");
            }
        });
    }
}
