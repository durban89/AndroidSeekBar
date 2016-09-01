package com.gowhich.androidseekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    private TextView textView1;
    private TextView textView2;
    private SeekBar seekBar1;
    private SeekBar seekBar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = (TextView) this.findViewById(R.id.textView1);
        textView2 = (TextView) this.findViewById(R.id.textView2);
        seekBar1 = (SeekBar) this.findViewById(R.id.seekbar1);
        seekBar2 = (SeekBar) this.findViewById(R.id.seekbar2);

        seekBar1.setOnSeekBarChangeListener(this);
        seekBar2.setOnSeekBarChangeListener(this);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        if(seekBar.getId() == R.id.seekbar1){
            textView1.setText("seekbar1 的当前位置是：" + i );
        } else {
            textView2.setText("seekbar2 的当前位置是：" + i );
        }
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        if(seekBar.getId() == R.id.seekbar1){
            textView1.setText("seekbar1 开始拖动");
        } else {
            textView2.setText("seekbar2 开始拖动");
        }
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        if(seekBar.getId() == R.id.seekbar1){
            textView1.setText("seekbar1 结束拖动");
        } else {
            textView2.setText("seekbar2 结束拖动");
        }
    }
}
