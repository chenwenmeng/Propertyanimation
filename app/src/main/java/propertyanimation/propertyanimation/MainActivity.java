package propertyanimation.propertyanimation;

import android.animation.Animator;



import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

import android.animation.ObjectAnimator;

import android.animation.ValueAnimator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



import android.view.View;
import android.widget.TextView;


import android.widget.Toast;

/**
 * 属性动画练习
 */
public
class
MainActivity extends AppCompatActivity {



    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.text);
       /* //可以设置int或者float
        final ValueAnimator animator=ValueAnimator.ofFloat(0,5,3,10);
        //动画播放时间
        animator.setDuration(5000);
        //播放延迟
        animator.setStartDelay(2000);
        //动画循环次数
        animator.setRepeatCount(1);
        //循环模式 重复播放ValueAnimator.RESTART、倒序播放REVERSE
        animator.setRepeatMode(ValueAnimator.REVERSE);
        //添加动画监听
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                textView.setText(animation.getAnimatedValue()+"");
            }
        });
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //开始播放动画
                animator.start();
            }
        });*/

       /*//动画集合
       //各种View的后面rotationX类似这样的代表在X轴上操作
        ObjectAnimator scaleX=ObjectAnimator.ofFloat(textView,"scaleX",1,3);
        ObjectAnimator translationX=ObjectAnimator.ofFloat(textView,"translationX",0,500,0);
        ObjectAnimator rotationX=ObjectAnimator.ofFloat(textView,"rotationX",0,360);
        AnimatorSet animatorSet=new AnimatorSet();
        //after在指定毫秒后执行或者将现有动画插入传入动画之后执行，
        // with将现有动画和之前的动画同时执行，before在现有动画插到之前动画执行
        animatorSet.play(scaleX).after(2000).with(translationX).before(rotationX);
        animatorSet.setDuration(3000);
        animatorSet.start();
        //动画监听
        animatorSet.addListener(new Animator.AnimatorListener() {

            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {

                Toast.makeText(MainActivity.this,"动画结束了",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });
        //动画监听的适配器不需要每次都实现接口中的四个方法
        animatorSet.addListener(new AnimatorListenerAdapter() {

            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
            }
        });*/
        //XML中设置动画
        Animator animator= AnimatorInflater.loadAnimator(this,R.animator.translation);
        animator.setTarget(textView);
        animator.start();

    }
}
