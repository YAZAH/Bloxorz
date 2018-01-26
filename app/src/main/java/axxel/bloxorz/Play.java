package axxel.bloxorz;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.facebook.ads.*;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tappx.sdk.android.TappxBanner;


public class Play extends Activity implements InterstitialAdListener {

    private FirebaseAnalytics mFirebaseAnalytics;
    public String[] levelDone = new String[33];
    public SharedPreferences sp;
    private PlayView pv;
    public int width;
    public int height;
    private AdView adView;

    private InterstitialAd interstitialAd;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams. FLAG_FULLSCREEN ,
                WindowManager.LayoutParams. FLAG_FULLSCREEN);
        width=600;
        height=360;
        sp = PreferenceManager.getDefaultSharedPreferences(this);
        pv = new PlayView(getApplicationContext(), width, height, levelDone, sp);
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
        interstitialAd = new InterstitialAd(this, "test");
        interstitialAd.setAdListener(this);
        interstitialAd.loadAd();
        //cle();
        load(getApplicationContext());
        setContentView(R.layout.levelchoice);
        interstitialAd.show();
        levelChoice();
    }

    private void levelChoice() {
        Button B1 = findViewById(R.id.Level1);
        Button B2 = findViewById(R.id.Level2);
        Button B3 = findViewById(R.id.Level3);
        Button B4 = findViewById(R.id.Level4);
        Button B5 = findViewById(R.id.Level5);
        Button B6 = findViewById(R.id.Level6);
        Button B7 = findViewById(R.id.Level7);
        Button B8 = findViewById(R.id.Level8);
        Button B9 = findViewById(R.id.Level9);
        Button B10 = findViewById(R.id.Level10);

        Button B11 = findViewById(R.id.Level11);
        Button B12 = findViewById(R.id.Level12);
        Button B13 = findViewById(R.id.Level13);
        Button B14 = findViewById(R.id.Level14);
        Button B15 = findViewById(R.id.Level15);
        Button B16 = findViewById(R.id.Level16);
        Button B17 = findViewById(R.id.Level17);
        Button B18 = findViewById(R.id.Level18);
        Button B19 = findViewById(R.id.Level19);
        Button B20 = findViewById(R.id.Level20);

        Button B21 = findViewById(R.id.Level21);
        Button B22 = findViewById(R.id.Level22);
        Button B23 = findViewById(R.id.Level23);
        Button B24 = findViewById(R.id.Level24);
        Button B25 = findViewById(R.id.Level25);
        Button B26 = findViewById(R.id.Level26);
        Button B27 = findViewById(R.id.Level27);
        Button B28 = findViewById(R.id.Level28);
        Button B29 = findViewById(R.id.Level29);
        Button B30 = findViewById(R.id.Level30);
        Button B31 = findViewById(R.id.Level31);
        Button B32 = findViewById(R.id.Level32);
        Button B33 = findViewById(R.id.Level33);

        int i = 0;
        while (i < 33) {
            if (!(levelDone[i] == null)) {
                switch (levelDone[i]) {
                    case "1":
                        B1.setBackgroundResource(R.drawable.btnleveldone);
                        break;
                    case "2":
                        B2.setBackgroundResource(R.drawable.btnleveldone);
                        break;
                    case "3":
                        B3.setBackgroundResource(R.drawable.btnleveldone);
                        break;
                    case "4":
                        B4.setBackgroundResource(R.drawable.btnleveldone);
                        break;
                    case "5":
                        B5.setBackgroundResource(R.drawable.btnleveldone);
                        break;
                    case "6":
                        B6.setBackgroundResource(R.drawable.btnleveldone);
                        break;
                    case "7":
                        B7.setBackgroundResource(R.drawable.btnleveldone);
                        break;
                    case "8":
                        B8.setBackgroundResource(R.drawable.btnleveldone);
                        break;
                    case "9":
                        B9.setBackgroundResource(R.drawable.btnleveldone);
                        break;
                    case "10":
                        B10.setBackgroundResource(R.drawable.btnleveldone);
                        break;
                    case "11":
                        B11.setBackgroundResource(R.drawable.btnleveldone);
                        break;
                    case "12":
                        B12.setBackgroundResource(R.drawable.btnleveldone);
                        break;
                    case "13":
                        B13.setBackgroundResource(R.drawable.btnleveldone);
                        break;
                    case "14":
                        B14.setBackgroundResource(R.drawable.btnleveldone);
                        break;
                    case "15":
                        B15.setBackgroundResource(R.drawable.btnleveldone);
                        break;
                    case "16":
                        B16.setBackgroundResource(R.drawable.btnleveldone);
                        break;
                    case "17":
                        B17.setBackgroundResource(R.drawable.btnleveldone);
                        break;
                    case "18":
                        B18.setBackgroundResource(R.drawable.btnleveldone);
                        break;
                    case "19":
                        B19.setBackgroundResource(R.drawable.btnleveldone);
                        break;
                    case "20":
                        B20.setBackgroundResource(R.drawable.btnleveldone);
                        break;
                    case "21":
                        B21.setBackgroundResource(R.drawable.btnleveldone);
                        break;
                    case "22":
                        B22.setBackgroundResource(R.drawable.btnleveldone);
                        break;
                    case "23":
                        B23.setBackgroundResource(R.drawable.btnleveldone);
                        break;
                    case "24":
                        B24.setBackgroundResource(R.drawable.btnleveldone);
                        break;
                    case "25":
                        B25.setBackgroundResource(R.drawable.btnleveldone);
                        break;
                    case "26":
                        B26.setBackgroundResource(R.drawable.btnleveldone);
                        break;
                    case "27":
                        B27.setBackgroundResource(R.drawable.btnleveldone);
                        break;
                    case "28":
                        B28.setBackgroundResource(R.drawable.btnleveldone);
                        break;
                    case "29":
                        B29.setBackgroundResource(R.drawable.btnleveldone);
                        break;
                    case "30":
                        B30.setBackgroundResource(R.drawable.btnleveldone);
                        break;
                    case "31":
                        B31.setBackgroundResource(R.drawable.btnleveldone);
                        break;
                    case "32":
                        B32.setBackgroundResource(R.drawable.btnleveldone);
                        break;
                    case "33":
                        B33.setBackgroundResource(R.drawable.btnleveldone);
                        break;
                }
            }
            i++;
        }
    }

    public void onButtonClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.returnToMenu:
                Play.this.finish();
                break;
            case R.id.Level1:
                Level(1);
                break;
            case R.id.Level2:
                Level(2);
                break;
            case R.id.Level3:
                Level(3);
                break;
            case R.id.Level4:
                Level(4);
                break;
            case R.id.Level5:
                Level(5);
                break;
            case R.id.Level6:
                Level(6);
                break;
            case R.id.Level7:
                Level(7);
                break;
            case R.id.Level8:
                Level(8);
                break;
            case R.id.Level9:
                Level(9);
                break;
            case R.id.Level10:
                Level(10);
                break;
            case R.id.Level11:
                Level(11);
                break;
            case R.id.Level12:
                Level(12);
                break;
            case R.id.Level13:
                Level(13);
                break;
            case R.id.Level14:
                Level(14);
                break;
            case R.id.Level15:
                Level(15);
                break;
            case R.id.Level16:
                Level(16);
                break;
            case R.id.Level17:
                Level(17);
                break;
            case R.id.Level18:
                Level(18);
                break;
            case R.id.Level19:
                Level(19);
                break;
            case R.id.Level20:
                Level(20);
                break;
            case R.id.Level21:
                Level(21);
                break;
            case R.id.Level22:
                Level(22);
                break;
            case R.id.Level23:
                Level(23);
                break;
            case R.id.Level24:
                Level(24);
                break;
            case R.id.Level25:
                Level(25);
                break;
            case R.id.Level26:
                Level(26);
                break;
            case R.id.Level27:
                Level(27);
                break;
            case R.id.Level28:
                Level(28);
                break;
            case R.id.Level29:
                Level(29);
                break;
            case R.id.Level30:
                Level(30);
                break;
            case R.id.Level31:
                Level(31);
                break;
            case R.id.Level32:
                Level(32);
                break;
            case R.id.Level33:
                Level(33);
                break;
        }
    }

    private void load(Context mContext) {
        SharedPreferences mSharedPreference1 =   PreferenceManager.getDefaultSharedPreferences(mContext);
        int size = mSharedPreference1.getInt("Level_size", 0);
        for(int i=0;i<size;i++) {
            levelDone[i]=mSharedPreference1.getString("Level_" + i, null);
        }
    }

    private void cle() {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        preferences.edit().clear().apply();
    }

    private void Level(int lvl) {
        FrameLayout gameView = new FrameLayout(this);
        pv.start(lvl);
        LinearLayout gameWidget = new LinearLayout(this);
        gameWidget.setOrientation(LinearLayout.VERTICAL);
        LinearLayout gameButton1 = new LinearLayout(this);
        LinearLayout gameButton2 = new LinearLayout(this);
        LinearLayout gameButton3 = new LinearLayout(this);
        LinearLayout levelButton = new LinearLayout(this);
        LinearLayout bannerContainer = new LinearLayout(this);

        // Instantiate an AdView view
        adView = new AdView(this, "test", AdSize.BANNER_HEIGHT_50);

        // Find the Ad container
        LinearLayout adContainer =  new LinearLayout(this);

        // Add the ad view to container
        adContainer.addView(adView);

        adView.setAdListener(new AdListener() {
            @Override
            public void onError(Ad ad, AdError adError) {
                //Toast.makeText(BannerActivity.this, "Error: " + adError.getErrorMessage(), Toast
                  //      .LENGTH_LONG).show();
            }

            @Override
            public void onAdLoaded(Ad ad) {
                //Toast.makeText(BannerActivity.this, "Ad loaded!", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onAdClicked(Ad ad) {
                //Toast.makeText(BannerActivity.this, "Ad clicked!", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onLoggingImpression(Ad ad) {
                //Toast.makeText(BannerActivity.this, "Impression logged!", Toast.LENGTH_LONG).show();
            }
        });

        // Request an ad
        adView.loadAd();

        TappxBanner banner = new TappxBanner(this, "test");
        banner.setAdSize(TappxBanner.AdSize.SMART_BANNER);
        bannerContainer.addView(banner);
        banner.loadAd();
        banner.setRefreshTimeSeconds(10);
        bannerContainer.setHorizontalGravity(Gravity.START);
        bannerContainer.setVerticalGravity(Gravity.BOTTOM);

        Button LVLSELECT = new Button(this);
        LVLSELECT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Play.this.recreate();
            }
        });
        LVLSELECT.setText(R.string.LevelSelection);
        LVLSELECT.setTextColor(Color.WHITE);

        final ImageButton UP = new ImageButton(this);
        UP.setImageResource(R.drawable.up);
        UP.setBackgroundColor(Color.TRANSPARENT);
        UP.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN)
                    UP.setImageResource(R.drawable.uped);
                if(event.getAction() == MotionEvent.ACTION_UP)
                    UP.setImageResource(R.drawable.up);
                return false;
            }
        });
        UP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!pv.block().isLocked()) {
                    pv.block().lockKeypad();
                    pv.block().moveWest();
                }
            }
        });
        final ImageButton DOWN = new ImageButton(this);
        DOWN.setImageResource(R.drawable.down);
        DOWN.setBackgroundColor(Color.TRANSPARENT);
        DOWN.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN)
                    DOWN.setImageResource(R.drawable.downed);
                if(event.getAction() == MotionEvent.ACTION_UP)
                    DOWN.setImageResource(R.drawable.down);
                return false;
            }
        });
        DOWN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!pv.block().isLocked()){
                    pv.block().lockKeypad();
                    pv.block().moveEast();
                }
            }
        });
        final ImageButton LEFT = new ImageButton(this);
        LEFT.setImageResource(R.drawable.left);
        LEFT.setBackgroundColor(Color.TRANSPARENT);
        LEFT.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN)
                    LEFT.setImageResource(R.drawable.lefted);
                if(event.getAction() == MotionEvent.ACTION_UP)
                    LEFT.setImageResource(R.drawable.left);
                return false;
            }
        });
        LEFT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!pv.block().isLocked()) {
                    pv.block().lockKeypad();
                    pv.block().moveSouth();
                }
            }
        });
        final ImageButton RIGHT = new ImageButton(this);
        RIGHT.setImageResource(R.drawable.right);
        RIGHT.setBackgroundColor(Color.TRANSPARENT);
        RIGHT.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN)
                    RIGHT.setImageResource(R.drawable.righted);
                if(event.getAction() == MotionEvent.ACTION_UP)
                    RIGHT.setImageResource(R.drawable.right);
                return false;
            }
        });
        RIGHT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!pv.block().isLocked()){
                    pv.block().lockKeypad();
                    pv.block().moveNorth();
                }
            }
        });

        final ImageButton CHANGE = new ImageButton(this);
        CHANGE.setImageResource(R.drawable.btnchange);
        CHANGE.setBackgroundColor(Color.TRANSPARENT);
        CHANGE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CHANGE.setSelected(!CHANGE.isSelected());
                if (CHANGE.isSelected()) {
                    CHANGE.setImageResource(R.drawable.btnchanged);
                }
                else {
                    CHANGE.setImageResource(R.drawable.btnchange);
                }
                if (!pv.block().isLocked()) {
                    if (pv.block().getState()==1) {
                        pv.block().lockKeypad();
                    }
                    pv.block().changeActiveBlock();
                }
            }
        });
        final ImageButton NEON = new ImageButton(this);
        NEON.setImageResource(R.drawable.neon);
        NEON.setBackgroundColor(Color.TRANSPARENT);
        final ImageButton NEON1 = new ImageButton(this);
        NEON1.setImageResource(R.drawable.neon);
        NEON1.setBackgroundColor(Color.TRANSPARENT);

        gameButton1.addView(UP);
        gameButton1.addView(NEON);
        gameButton2.addView(LEFT);
        gameButton2.addView(CHANGE);
        gameButton2.addView(RIGHT);
        gameButton3.addView(DOWN);
        gameButton3.addView(NEON1);
        levelButton.addView(LVLSELECT);
        levelButton.addView(adContainer);
        gameButton1.setVerticalGravity(Gravity.BOTTOM);
        gameButton1.setHorizontalGravity(Gravity.END);
        gameButton2.setVerticalGravity(Gravity.BOTTOM);
        gameButton2.setHorizontalGravity(Gravity.END);
        gameButton3.setVerticalGravity(Gravity.BOTTOM);
        gameButton3.setHorizontalGravity(Gravity.END);
        levelButton.setVerticalGravity(Gravity.START);
        levelButton.setHorizontalGravity(Gravity.BOTTOM);

        gameWidget.addView(gameButton1);
        gameWidget.addView(gameButton2);
        gameWidget.addView(gameButton3);
        gameWidget.setVerticalGravity(Gravity.BOTTOM);
        gameWidget.setHorizontalGravity(Gravity.END);

        gameView.addView(pv);
        gameView.addView(levelButton);
        gameView.addView(bannerContainer);
        gameView.addView(gameWidget);
        setContentView(gameView);
    }

    @Override
    protected void onDestroy() {
        if (adView != null) {
            adView.destroy();
        }
        super.onDestroy();
    }

    @Override
    public void onError(Ad ad, AdError error) {
        // Ad failed to load
    }

    @Override
    public void onAdLoaded(Ad ad) {
        // Ad is loaded and ready to be displayed
        // You can now display the full screen add using this code:
        interstitialAd.show();
    }

    @Override
    public void onAdClicked(Ad ad) {

    }

    @Override
    public void onLoggingImpression(Ad ad) {

    }

    @Override
    public void onInterstitialDisplayed(Ad ad) {

    }

    @Override
    public void onInterstitialDismissed(Ad ad) {

    }
}

class PlayView extends SurfaceView implements SurfaceHolder.Callback {

    private SurfaceHolder surfaceHolder;
    private SurfaceManager surfaceManager;
    public int width;
    public int height;
    public String[] levelDone;
    public SharedPreferences sp;

    public PlayView(Context context){
        super(context);
    }
    public PlayView(Context context, int width, int height, String[] levelDone, SharedPreferences sp) {
        super(context);
        this.width=width;
        this.height=height;
        this.sp=sp;
        this.levelDone=levelDone;
        this.surfaceHolder = getHolder();
        surfaceHolder.addCallback(this);
    }
    public void start(int lvl) {
        surfaceManager = new SurfaceManager(surfaceHolder, getContext(), lvl, width, height, levelDone, sp);
        setFocusable(true);
    }
    public Block block(){
        return surfaceManager.getBlock();
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        surfaceManager.setThreadState(true);
        surfaceManager.start();
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        boolean retry = true;
        surfaceManager.setThreadState(false);
        while(retry) {
            try {
                surfaceManager.join();
                retry = false;
            }
            catch (InterruptedException e) { }
        }
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {

        return surfaceManager.keyUp(keyCode);
    }
    @Override
    public boolean onTouchEvent(MotionEvent event){
        return surfaceManager.onTouchEvent(event);
    }

}

class SurfaceManager extends Thread {

    private final int DOWN = 5;
    private final int SINGLE = 0;

    private String[] levelDone;

    private final SurfaceHolder surfaceHolder;

    /**
     * Variable for thread control. True - running, false - stop.
     */
    private boolean threadState;

    /**
     * Game resources
     */
    private Resources res;

    /**
     * Array of cell types
     */
    private int[][][] map = null;

    /**
     * Array of needed cells
     */
    private Cell[][] cells = new Cell[15][10];

    /**
     * Block
     */
    private Block block;

    /**
     * Level
     */
    private int lvl;
    private int height;
    private int width;

    /**
     * Background image
     */
    private Drawable background;

    private SharedPreferences sp;

    public SurfaceManager(SurfaceHolder surfaceHolder, Context context, int lvl, int width, int height, String[] levelDone, SharedPreferences sp) {
        this.surfaceHolder = surfaceHolder;
        this.lvl = lvl;
        this.levelDone=levelDone;
        threadState = false;
        this.height=height;
        this.width=width;
        surfaceHolder.setFixedSize(width,height);
        this.sp=sp;
        res = context.getResources();
        background = res.getDrawable(R.drawable.backgroundland);
        background.setBounds(0, 0, width, height);

        initAll(lvl);
    }

    public void setThreadState(boolean state)
    {
        threadState = state;
    }

    public void run() {
        while(threadState){
            Canvas canvas = null;
            try {
                canvas = surfaceHolder.lockCanvas();
                synchronized (surfaceHolder) {
                    if(block.getState()==SINGLE) {
                        if(!block.levelCompleted()) {
                            if(block.getReset()) {
                                block.setReset(false);
                                initAll(lvl);
                            }
                            else {
                                refreshMap();
                                refreshBlock();
                            }

                            background.draw(canvas);

                            drawMap(canvas);
                            if(block.getDirection()!=DOWN)
                                block.draw(canvas);

                            sleep(20);
                        }
                        else {
                            save();
                            lvl++;
                            initAll(lvl);
                        }
                    }
                    else {
                        if(block.getReset()) {
                            block.setReset(false);
                            initAll(lvl);
                        }
                        else {
                            refreshMap();
                            refreshSmallBlock();
                        }
                        background.draw(canvas);
                        drawMap(canvas);
                        block.drawSmallBlocks(canvas);

                        sleep(20);
                    }
                }
            }
            catch (Exception e) { }
            finally {
                if (canvas!=null) {
                    surfaceHolder.unlockCanvasAndPost(canvas);
                }
            }
        }
    }

    public void save() {
        for (int i = 0; i < 33; i++) {
            if (levelDone[i] == null) {
                levelDone[i] = ""+lvl;
                break;
            } else if (levelDone[i] == ""+lvl) {
                break;
            }
        }
        saved();
    }

    public void saved() {
        SharedPreferences.Editor mEdit1 = sp.edit();
        mEdit1.putInt("Level_size", levelDone.length);
        for (int i = 0; i < levelDone.length; i++) {
            mEdit1.remove("Level_" + i);
            mEdit1.putString("Level_" + i, levelDone[i]);
        }
        mEdit1.apply();
    }

    public void initAll(int lvl) {

        map = setMap(lvl);
        int iStart = 0;
        int jStart = 0;
        for (int i=0; i<15; i++)
        {
            for (int j=0; j<10; j++)
            {
                if (map[i][j][0]>0)
                {
                    if(map[i][j][0]!=6)
                    {
                        Cell cell = new Cell(res, map, i, j);
                        cells[i][j] = cell;
                    }else
                    {
                        Cell cell = new Cell(res, map, i, j);
                        cells[i][j] = cell;
                        iStart = i;
                        jStart = j;
                    }
                }else
                {
                    cells[i][j] = null;
                }
            }
        }
        block = new Block(res, iStart, jStart, cells);
    }

    private void refreshBlock()
    {
        block.refresh();
    }

    private void refreshSmallBlock()
    {
        block.refreshSmallBlock();
    }

    public void refreshMap() {
        for (int i=0; i<15; i++)
        {
            for (int j=0; j<10; j++)
            {
                if (map[i][j][0]==4||map[i][j][0]==8)
                {
                    cells[i][j].refresh();
                }
            }
        }
    }

    public void drawMap(Canvas canvas) {
        for(int i=0; i<15; i++)
        {
            for(int j=0; j<10; j++)
            {
                if(cells[i][j]!=null)
                    cells[i][j].draw(canvas);
                if(block.getState()==SINGLE)
                {
                    if(block.getDirection()==DOWN && block.getI()==i && block.getJ()==j)
                        block.draw(canvas);
                }
            }
        }
    }

    boolean keyUp(int keyCode) {
        if(!block.isLocked()) {
            switch(keyCode) {
                case KeyEvent.KEYCODE_DPAD_LEFT:
                    block.lockKeypad();
                    block.moveSouth();
                    return true;
                case KeyEvent.KEYCODE_DPAD_RIGHT:
                    block.lockKeypad();
                    block.moveNorth();
                    return true;
                case KeyEvent.KEYCODE_DPAD_UP:
                    block.lockKeypad();
                    block.moveWest();
                    return true;
                case KeyEvent.KEYCODE_DPAD_DOWN:
                    block.lockKeypad();
                    block.moveEast();
                    return true;
                case KeyEvent.KEYCODE_SPACE:
                    block.lockKeypad();
                    block.changeActiveBlock();
                    return true;
                default:
                    return false;
            }
        }
        else
            return false;
    }

    public boolean onTouchEvent (MotionEvent event){
        if(!block.isLocked()) {
            if (event.getPointerCount() == 2) {
                scaleWithFinger(event);
            } else if (event.getPointerCount() == 1) {
                moveWithFinger(event);
            }
            return true;
        }
        return true;
    }

    private float beforeLenght,afterLenght,total_scale = height/300;
    public void scaleWithFinger(MotionEvent event) {
        float moveX = event.getX(1) - event.getX(0);
        float moveY = event.getY(1) - event.getY(0);

        switch(event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                beforeLenght = (float) Math.sqrt( (moveX*moveX) + (moveY*moveY) );
                break;
            case MotionEvent.ACTION_MOVE:
                afterLenght = (float) Math.sqrt( (moveX*moveX) + (moveY*moveY) );

                float gapLenght = afterLenght - beforeLenght;

                if(gapLenght == 0) {
                    break;
                }
                if(gapLenght>10) {
                    total_scale+=0.1;
                }else if(gapLenght<-10){
                    total_scale-=0.1;
                }
                if(total_scale>2)total_scale=(float)2;
                else if(total_scale<0.6)total_scale=(float)0.6;
                beforeLenght = afterLenght;
                break;
        }
    }

    private float xx,yy;
    public void moveWithFinger(MotionEvent event) {
        float x=0,y=0;
        x = event.getX();
        y = event.getY();
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                xx = x; yy = y;
                break;
            case MotionEvent.ACTION_MOVE:
                break;
            case MotionEvent.ACTION_UP:
                if(Math.abs(yy - y) < 100 && x - xx > 100){
                    block.lockKeypad();
                    block.moveNorth();
                }else if(Math.abs(yy - y) < 100 && xx - x > 100){
                    block.lockKeypad();
                    block.moveSouth();
                }else if(yy - y > 100 && Math.abs(xx - x) < 100){
                    block.lockKeypad();
                    block.moveWest();
                }else if(y - yy > 100 && Math.abs(xx - x) < 100){
                    block.lockKeypad();
                    block.moveEast();
                }
                break;
        }
    }


    public Block getBlock() {
        return this.block;
    }

    /**
     * Returns array of cell types
     * @param lvl - current level
     * @return array of cell types
     */
    private int[][][] setMap(int lvl) {
        switch (lvl) {
            case 0:	//Template
                map = new int[][][]
                        {{{0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}},
                        {{0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}},
                        {{0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}},
                        {{0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}},
                        {{0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}},
                        {{0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}},
                        {{0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}},
                        {{0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}},
                        {{0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}},
                        {{0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}},
                        {{0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}},
                        {{0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}},
                        {{0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}},
                        {{0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}},
                        {{0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}}};
                break;
            case 1:
                map = new int[][][]
                        {{{0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}},
                        {{0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}},
                        {{0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}},
                        {{0}, {0}, {0}, {0}, {0}, {1}, {1}, {0}, {0}, {0}},
                        {{0}, {0}, {0}, {0}, {1}, {1}, {1}, {1}, {0}, {0}},
                        {{0}, {0}, {0}, {0}, {1}, {1}, {7}, {1}, {0}, {0}},
                        {{0}, {0}, {0}, {0}, {1}, {1}, {1}, {1}, {0}, {0}},
                        {{0}, {0}, {0}, {1}, {1}, {1}, {1}, {0}, {0}, {0}},
                        {{0}, {0}, {0}, {1}, {1}, {1}, {0}, {0}, {0}, {0}},
                        {{0}, {0}, {0}, {1}, {1}, {1}, {0}, {0}, {0}, {0}},
                        {{0}, {0}, {1}, {1}, {1}, {1}, {0}, {0}, {0}, {0}},
                        {{201}, {0}, {1}, {6}, {1}, {1}, {0}, {0}, {0}, {0}},
                        {{100}, {0}, {1}, {1}, {1}, {0}, {0}, {0}, {0}, {0}},
                        {{99}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}},
                        {{100}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}}};
                break;
            case 2:
                map = new int[][][] {
                        {{0}, {0}, {1}, {1}, {1}, {1}, {1}, {0}, {0}, {0}},
                        {{0}, {0}, {1}, {7}, {1}, {1}, {1}, {0}, {0}, {0}},
                        {{0}, {0}, {1}, {1}, {1}, {1}, {1}, {0}, {0}, {0}},
                        {{0}, {0}, {0}, {0}, {0}, {0}, {4, 0, 1}, {0}, {0}, {0}},
                        {{0}, {0}, {0}, {0}, {0}, {0}, {4, 0, 0}, {0}, {0}, {0}},
                        {{0}, {0}, {1}, {1}, {1}, {1}, {1}, {1}, {0}, {0}},
                        {{0}, {0}, {1}, {3, 2, 3, 6, 2, 4, 6}, {1}, {1}, {1}, {1}, {0}, {0}},
                        {{0}, {0}, {1}, {1}, {1}, {1}, {1}, {1}, {0}, {0}},
                        {{0}, {0}, {1}, {1}, {1}, {1}, {1}, {1}, {0}, {0}},
                        {{0}, {0}, {0}, {0}, {0}, {0}, {4, 0, 1}, {0}, {0}, {0}},
                        {{0}, {0}, {0}, {0}, {0}, {0}, {4, 0, 0}, {0}, {0}, {0}},
                        {{202}, {0}, {0}, {1}, {1}, {1}, {1}, {1}, {0}, {0}},
                        {{100}, {0}, {0}, {1}, {2, 2, 9, 6, 2, 10, 6}, {1}, {1}, {1}, {0}, {0}},
                        {{99}, {0}, {0}, {1}, {1}, {1}, {6}, {1}, {0}, {0}},
                        {{100}, {0}, {0}, {1}, {1}, {1}, {1}, {1}, {0}, {0}}};
                break;
            case 3:
                map = new int[][][] {
                        {{0}, {0}, {0}, {0}, {1}, {1}, {1}, {1}, {0}, {0}},
                        {{0}, {0}, {0}, {0}, {1}, {7}, {1}, {1}, {0}, {0}},
                        {{0}, {0}, {1}, {1}, {1}, {1}, {1}, {1}, {0}, {0}},
                        {{0}, {0}, {1}, {1}, {1}, {1}, {1}, {0}, {0}, {0}},
                        {{0}, {0}, {1}, {0}, {0}, {0}, {0}, {0}, {0}, {0}},
                        {{0}, {0}, {1}, {0}, {0}, {0}, {0}, {0}, {0}, {0}},
                        {{0}, {0}, {1}, {1}, {1}, {0}, {0}, {0}, {0}, {0}},
                        {{0}, {0}, {1}, {1}, {1}, {0}, {0}, {0}, {0}, {0}},
                        {{0}, {0}, {1}, {1}, {1}, {0}, {0}, {0}, {0}, {0}},
                        {{0}, {0}, {0}, {0}, {1}, {0}, {0}, {0}, {0}, {0}},
                        {{0}, {0}, {0}, {0}, {1}, {0}, {0}, {0}, {0}, {0}},
                        {{203}, {0}, {0}, {1}, {1}, {1}, {1}, {0}, {0}, {0}},
                        {{100}, {0}, {0}, {1}, {1}, {1}, {1}, {0}, {0}, {0}},
                        {{99}, {0}, {0}, {1}, {1}, {6}, {1}, {0}, {0}, {0}},
                        {{100}, {0}, {0}, {1}, {1}, {1}, {1}, {0}, {0}, {0}}};
                break;
            case 4:
                map = new int[][][] {
                        {{204}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}},
                        {{100}, {0}, {0}, {0}, {0}, {0}, {8}, {8}, {8}, {8}},
                        {{99}, {0}, {0}, {0}, {0}, {0}, {8}, {8}, {1}, {8}},
                        {{100}, {0}, {0}, {1}, {1}, {1}, {8}, {8}, {8}, {8}},
                        {{0}, {0}, {0}, {1}, {1}, {1}, {8}, {8}, {8}, {8}},
                        {{0}, {8}, {8}, {1}, {0}, {0}, {8}, {8}, {0}, {0}},
                        {{0}, {8}, {8}, {0}, {0}, {0}, {1}, {1}, {0}, {0}},
                        {{0}, {8}, {8}, {0}, {0}, {0}, {1}, {1}, {1}, {1}},
                        {{0}, {8}, {8}, {0}, {0}, {0}, {1}, {1}, {7}, {1}},
                        {{0}, {8}, {8}, {0}, {0}, {0}, {1}, {1}, {1}, {1}},
                        {{0}, {8}, {8}, {0}, {0}, {0}, {0}, {0}, {0}, {0}},
                        {{0}, {8}, {8}, {1}, {0}, {0}, {0}, {0}, {0}, {0}},
                        {{0}, {0}, {0}, {1}, {1}, {1}, {1}, {1}, {0}, {0}},
                        {{0}, {0}, {0}, {1}, {1}, {1}, {6}, {1}, {0}, {0}},
                        {{0}, {0}, {0}, {1}, {1}, {1}, {1}, {1}, {0}, {0}}};
                break;
            case 5:
                map = new int[][][]
                               {{{205}, {1}, {1}, {0}, {0}, {0}, {2,2,8,8,2,9,8}, {1}, {0}, {0}},
                                {{100}, {6}, {1}, {0}, {0}, {0}, {1}, {1}, {0}, {0}},
                                {{99}, {1}, {1}, {0}, {0}, {1}, {1}, {1}, {1}, {0}},
                                {{100}, {1}, {0}, {0}, {0}, {1}, {1}, {1}, {1}, {0}},
                                {{0}, {1}, {0}, {0}, {0}, {1}, {1}, {1}, {1}, {0}},
                                {{0}, {1}, {0}, {0}, {0}, {4,1,1}, {0}, {0}, {1}, {0}},
                                {{0}, {2,2,8,1,2,9,1}, {0}, {0}, {0}, {4,1,0}, {0}, {0}, {1}, {0}},
                                {{0}, {1}, {0}, {0}, {0}, {1}, {0}, {0}, {1}, {0}},
                                {{0}, {4,1,1}, {0}, {0}, {0}, {2,0,8,8,0,9,8}, {0}, {0}, {4,1,1}, {0}},
                                {{0}, {4,1,0}, {0}, {0}, {0}, {1}, {0}, {0}, {4,1,0}, {0}},
                                {{0}, {1}, {1}, {1}, {1}, {1}, {0}, {0}, {1}, {0}},
                                {{0}, {1}, {1}, {2,1,8,8,1,9,8}, {1}, {1}, {0}, {0}, {1}, {1}},
                                {{0}, {1}, {1}, {1}, {1}, {0}, {0}, {1}, {1}, {1}},
                                {{0}, {1}, {1}, {1}, {1}, {0}, {0}, {1}, {7}, {1}},
                                {{0}, {0}, {0}, {0}, {0}, {0}, {0}, {1}, {1}, {1}}};
                break;
            case 6:
                map = new int[][][]
                               {{{0}, {0}, {0}, {1}, {1}, {1}, {0}, {0}, {0}, {0}},
                                {{0}, {0}, {0}, {1}, {7}, {1}, {0}, {0}, {0}, {0}},
                                {{0}, {0}, {1}, {1}, {1}, {1}, {0}, {0}, {0}, {0}},
                                {{0}, {0}, {1}, {1}, {1}, {0}, {0}, {0}, {0}, {0}},
                                {{1}, {1}, {1}, {0}, {0}, {0}, {1}, {1}, {1}, {0}},
                                {{1}, {1}, {1}, {0}, {0}, {0}, {1}, {1}, {1}, {1}},
                                {{1}, {1}, {1}, {0}, {0}, {0}, {0}, {1}, {1}, {1}},
                                {{1}, {0}, {0}, {0}, {0}, {0}, {0}, {1}, {1}, {1}},
                                {{1}, {0}, {0}, {0}, {1}, {1}, {1}, {1}, {1}, {0}},
                                {{1}, {1}, {1}, {1}, {1}, {1}, {0}, {0}, {0}, {0}},
                                {{0}, {0}, {0}, {1}, {1}, {1}, {0}, {0}, {0}, {0}},
                                {{206}, {0}, {0}, {1}, {0}, {0}, {0}, {0}, {0}, {0}},
                                {{100}, {0}, {0}, {1}, {0}, {0}, {0}, {0}, {0}, {0}},
                                {{99}, {0}, {0}, {1}, {0}, {0}, {0}, {0}, {0}, {0}},
                                {{100}, {0}, {0}, {6}, {0}, {0}, {0}, {0}, {0}, {0}}};
                break;
            case 7:
                map = new int[][][]
                               {{{0}, {0}, {0}, {1}, {1}, {1}, {1}, {0}, {0}, {0}},
                                {{0}, {0}, {0}, {1}, {7}, {1}, {1}, {0}, {0}, {0}},
                                {{0}, {0}, {0}, {1}, {1}, {1}, {1}, {0}, {0}, {0}},
                                {{0}, {1}, {1}, {1}, {0}, {0}, {0}, {0}, {0}, {0}},
                                {{0}, {1}, {1}, {0}, {0}, {0}, {0}, {0}, {0}, {0}},
                                {{0}, {1}, {1}, {0}, {0}, {3,2,11,7}, {1}, {0}, {0}, {0}},
                                {{0}, {1}, {1}, {1}, {1}, {1}, {1}, {0}, {0}, {0}},
                                {{0}, {0}, {0}, {0}, {1}, {1}, {1}, {1}, {1}, {0}},
                                {{0}, {0}, {0}, {0}, {1}, {0}, {0}, {0}, {1}, {0}},
                                {{0}, {0}, {0}, {0}, {1}, {0}, {0}, {0}, {1}, {0}},
                                {{0}, {0}, {0}, {0}, {1}, {0}, {0}, {0}, {1}, {0}},
                                {{207}, {0}, {0}, {0}, {1}, {0}, {0}, {4,0,0}, {1}, {0}},
                                {{100}, {0}, {0}, {1}, {1}, {1}, {1}, {1}, {1}, {0}},
                                {{99}, {0}, {0}, {1}, {6}, {1}, {1}, {1}, {0}, {0}},
                                {{100}, {0}, {0}, {1}, {1}, {1}, {1}, {0}, {0}, {0}}};
                break;
            case 8:
                map = new int[][][]
                               {{{0}, {0}, {0}, {0}, {1}, {1}, {1}, {0}, {0}, {0}},
                                {{0}, {0}, {0}, {0}, {1}, {7}, {1}, {0}, {0}, {0}},
                                {{0}, {0}, {0}, {0}, {1}, {1}, {1}, {0}, {0}, {0}},
                                {{1}, {1}, {1}, {1}, {1}, {1}, {1}, {1}, {1}, {0}},
                                {{1}, {1}, {1}, {1}, {1}, {1}, {1}, {1}, {1}, {0}},
                                {{1}, {1}, {1}, {1}, {1}, {1}, {1}, {1}, {1}, {0}},
                                {{0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}},
                                {{0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}},
                                {{0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}},
                                {{0}, {0}, {0}, {0}, {1}, {1}, {1}, {0}, {0}, {0}},
                                {{0}, {0}, {0}, {0}, {1}, {5,4,1,4,7}, {1}, {0}, {0}, {0}},
                                {{208}, {0}, {0}, {0}, {1}, {1}, {1}, {0}, {0}, {0}},
                                {{100}, {0}, {0}, {0}, {1}, {1}, {1}, {0}, {0}, {0}},
                                {{99}, {0}, {0}, {0}, {1}, {6}, {1}, {0}, {0}, {0}},
                                {{100}, {0}, {0}, {0}, {1}, {1}, {1}, {0}, {0}, {0}}};
                break;
            case 9:
                map = new int[][][] {
                        {{0}, {0}, {0}, {1}, {1}, {1}, {0}, {0}, {0}, {0}},
                        {{0}, {0}, {0}, {1}, {6}, {1}, {0}, {0}, {0}, {0}},
                        {{0}, {0}, {0}, {1}, {1}, {1}, {0}, {0}, {0}, {0}},
                        {{0}, {0}, {0}, {1}, {1}, {1}, {0}, {0}, {0}, {0}},
                        {{0}, {0}, {0}, {0}, {0}, {1}, {0}, {0}, {0}, {0}},
                        {{0}, {0}, {0}, {0}, {0}, {1}, {0}, {0}, {0}, {0}},
                        {{0}, {0}, {0}, {0}, {0}, {1}, {1}, {1}, {0}, {0}},
                        {{0}, {0}, {0}, {1}, {1}, {1}, {7}, {1}, {0}, {0}},
                        {{0}, {0}, {0}, {0}, {0}, {1}, {1}, {1}, {0}, {0}},
                        {{0}, {0}, {0}, {0}, {0}, {1}, {0}, {0}, {0}, {0}},
                        {{0}, {0}, {0}, {0}, {0}, {1}, {0}, {0}, {0}, {0}},
                        {{209}, {0}, {0}, {1}, {1}, {1}, {0}, {0}, {0}, {0}},
                        {{100}, {0}, {0}, {1}, {1}, {1}, {0}, {0}, {0}, {0}},
                        {{99}, {0}, {0}, {1}, {5, 2, 4, 12, 4}, {1}, {0}, {0}, {0}, {0}},
                        {{100}, {0}, {0}, {1}, {1}, {1}, {0}, {0}, {0}, {0}}};
                break;
            case 10:
                map = new int[][][]
                               {{{1}, {1}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}},
                                {{1}, {5,1,1,4,1}, {4,0,3}, {4,0,2}, {1}, {1}, {1}, {1}, {1}, {1}},
                                {{1}, {1}, {1}, {1}, {1}, {0}, {0}, {1}, {1}, {3,2,6,1,2,7,1,2,1,2,2,1,3}},
                                {{1}, {1}, {1}, {1}, {0}, {0}, {0}, {0}, {0}, {1}},
                                {{1}, {6}, {1}, {1}, {0}, {0}, {0}, {0}, {0}, {1}},
                                {{1}, {1}, {1}, {0}, {0}, {0}, {0}, {0}, {1}, {1}},
                                {{0}, {4,0,1}, {0}, {0}, {0}, {0}, {0}, {0}, {1}, {0}},
                                {{0}, {4,0,0}, {0}, {0}, {0}, {0}, {0}, {0}, {1}, {0}},
                                {{0}, {1}, {0}, {0}, {0}, {0}, {0}, {0}, {1}, {2,2,9,1,2,10,1}},
                                {{0}, {4,0,1}, {0}, {0}, {0}, {0}, {0}, {0}, {1}, {1}},
                                {{0}, {4,0,0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}},
                                {{1}, {1}, {1}, {0}, {0}, {0}, {0}, {210}, {0}, {0}},
                                {{1}, {7}, {1}, {0}, {0}, {0}, {0}, {100}, {0}, {0}},
                                {{1}, {1}, {1}, {0}, {0}, {0}, {0}, {99}, {0}, {0}},
                                {{0}, {0}, {0}, {0}, {0}, {0}, {0}, {100}, {0}, {0}}};
                break;
            case 11:
                map = new int[][][] {
                        {{211}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}},
                        {{100}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}},
                        {{99}, {0}, {0}, {0}, {0}, {1}, {1}, {1}, {1}, {0}},
                        {{100}, {0}, {0}, {1}, {1}, {1}, {0}, {0}, {1}, {1}},
                        {{0}, {0}, {0}, {1}, {1}, {1}, {0}, {0}, {1}, {1}},
                        {{0}, {0}, {0}, {1}, {0}, {0}, {0}, {1}, {1}, {1}},
                        {{0}, {0}, {0}, {1}, {0}, {0}, {0}, {1}, {1}, {0}},
                        {{0}, {0}, {0}, {1}, {1}, {1}, {2, 0, 9, 0, 0, 9, 1}, {1}, {1}, {0}},
                        {{0}, {0}, {0}, {1}, {1}, {1}, {1}, {1}, {1}, {0}},
                        {{4, 1, 0}, {4, 1, 0}, {0}, {0}, {0}, {1}, {0}, {0}, {0}, {0}},
                        {{1}, {1}, {1}, {0}, {0}, {1}, {0}, {0}, {0}, {0}},
                        {{1}, {7}, {1}, {0}, {0}, {1}, {0}, {0}, {0}, {0}},
                        {{1}, {1}, {1}, {1}, {1}, {1}, {0}, {0}, {0}, {0}},
                        {{0}, {0}, {0}, {0}, {0}, {6}, {0}, {0}, {0}, {0}},
                        {{0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}}};
                break;
            case 12: 
                map = new int[][][]
                               {{{3,2,6,4}, {1}, {4,0,0}, {0}, {0}, {1}, {1}, {0}, {0}, {0}},
                                {{0}, {1}, {1}, {1}, {1}, {1}, {1}, {0}, {0}, {0}},
                                {{0}, {1}, {1}, {1}, {1}, {1}, {1}, {1}, {0}, {0}},
                                {{0}, {0}, {1}, {0}, {0}, {1}, {1}, {1}, {0}, {0}},
                                {{0}, {0}, {1}, {0}, {0}, {0}, {0}, {1}, {0}, {0}},
                                {{0}, {1}, {1}, {1}, {0}, {0}, {0}, {1}, {1}, {1}},
                                {{0}, {1}, {3,2,0,2}, {1}, {4,0,0}, {0}, {0}, {1}, {1}, {1}},
                                {{0}, {1}, {1}, {1}, {1}, {1}, {0}, {0}, {1}, {1}},
                                {{0}, {0}, {0}, {1}, {7}, {1}, {0}, {0}, {0}, {0}},
                                {{0}, {0}, {0}, {1}, {1}, {1}, {1}, {1}, {0}, {0}},
                                {{0}, {0}, {0}, {0}, {0}, {1}, {6}, {1}, {0}, {0}},
                                {{212}, {0}, {0}, {0}, {0}, {1}, {1}, {1}, {0}, {0}},
                                {{100}, {0}, {0}, {0}, {0}, {0}, {1}, {1}, {0}, {0}},
                                {{99}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}},
                                {{100}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}}};
                break;
            case 13: 
                map = new int[][][] {
                        {{0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {213}},
                        {{0}, {0}, {1}, {1}, {1}, {0}, {0}, {0}, {0}, {100}},
                        {{1}, {1}, {1}, {6}, {1}, {0}, {0}, {0}, {0}, {99}},
                        {{1}, {1}, {1}, {1}, {1}, {1}, {1}, {0}, {0}, {100}},
                        {{1}, {1}, {0}, {0}, {0}, {0}, {1}, {8}, {8}, {0}},
                        {{1}, {0}, {0}, {0}, {0}, {0}, {8}, {8}, {8}, {1}},
                        {{8}, {0}, {0}, {1}, {1}, {1}, {8}, {8}, {8}, {1}},
                        {{1}, {0}, {0}, {1}, {7}, {1}, {8}, {1}, {8}, {0}},
                        {{1}, {0}, {0}, {1}, {1}, {1}, {8}, {8}, {8}, {0}},
                        {{1}, {0}, {0}, {0}, {8}, {8}, {8}, {8}, {8}, {1}},
                        {{1}, {0}, {0}, {0}, {8}, {0}, {0}, {1}, {1}, {1}},
                        {{8}, {0}, {0}, {0}, {8}, {0}, {0}, {1}, {1}, {1}},
                        {{1}, {0}, {0}, {1}, {1}, {1}, {1}, {1}, {0}, {0}},
                        {{1}, {1}, {1}, {1}, {1}, {1}, {0}, {0}, {0}, {0}},
                        {{1}, {1}, {1}, {1}, {1}, {1}, {0}, {0}, {0}, {0}}};
                break;
            case 14: 
                map = new int[][][]
                               {{{0}, {0}, {1}, {1}, {1}, {1}, {1}, {0}, {0}, {3,2,11,3,2,12,3}},
                                {{0}, {0}, {1}, {3,2,11,2,2,12,2}, {1}, {1}, {1}, {0}, {0}, {1}},
                                {{0}, {0}, {1}, {0}, {0}, {0}, {1}, {0}, {0}, {1}},
                                {{1}, {1}, {1}, {0}, {0}, {0}, {1}, {1}, {1}, {1}},
                                {{1}, {1}, {1}, {0}, {0}, {0}, {1}, {1}, {1}, {1}},
                                {{1}, {1}, {1}, {0}, {0}, {0}, {1}, {1}, {1}, {1}},
                                {{0}, {0}, {1}, {0}, {0}, {0}, {0}, {0}, {0}, {0}},
                                {{0}, {0}, {1}, {0}, {0}, {0}, {0}, {0}, {0}, {0}},
                                {{0}, {1}, {1}, {1}, {0}, {0}, {0}, {0}, {0}, {0}},
                                {{0}, {1}, {6}, {1}, {0}, {0}, {0}, {1}, {1}, {1}},
                                {{0}, {1}, {1}, {1}, {0}, {0}, {0}, {1}, {7}, {1}},
                                {{214}, {0}, {4,0,1}, {4,0,1}, {0}, {0}, {0}, {1}, {1}, {1}},
                                {{100}, {0}, {4,0,0}, {4,0,0}, {0}, {0}, {0}, {1}, {1}, {0}},
                                {{99}, {0}, {1}, {1}, {1}, {1}, {1}, {1}, {0}, {0}},
                                {{100}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}}};
                break;
            case 15:
                map = new int[][][]
                           {{{1}, {1}, {1}, {0}, {0}, {0}, {0}, {0}, {0}, {0}},
                            {{1}, {1}, {1}, {0}, {0}, {0}, {0}, {1}, {1}, {1}},
                            {{1}, {3,2,1,8,2,1,9,2,11,2,2,12,2}, {1}, {0}, {0}, {0}, {0}, {1}, {7}, {1}},
                            {{0}, {4,0,1}, {0}, {0}, {0}, {0}, {0}, {2,0,4,8,0,5,8}, {1}, {2,0,4,8,0,5,8}},
                            {{0}, {4,0,0}, {0}, {0}, {0}, {0}, {0}, {0}, {4,1,1}, {0}},
                            {{1}, {1}, {1}, {0}, {0}, {0}, {0}, {0}, {4,1,0}, {0}},
                            {{1}, {1}, {1}, {2,2,3,1,2,4,1,2,8,1,2,9,1}, {0}, {0}, {0}, {1}, {1}, {1}},
                            {{1}, {1}, {1}, {0}, {0}, {5,1,1,13,8}, {1}, {1}, {1}, {1}},
                            {{0}, {4,1,1}, {0}, {0}, {0}, {0}, {0}, {1}, {1}, {1}},
                            {{0}, {4,1,0}, {0}, {0}, {0}, {0}, {0}, {0}, {1}, {0}},
                            {{0}, {1}, {1}, {1}, {0}, {0}, {0}, {0}, {1}, {0}},
                            {{215}, {0}, {4,0,1}, {1}, {0}, {0}, {0}, {0}, {1}, {0}},
                            {{100}, {0}, {4,0,0}, {1}, {0}, {0}, {0}, {1}, {1}, {1}},
                            {{99}, {0}, {1}, {1}, {1}, {1}, {1}, {1}, {6}, {1}},
                            {{100}, {0}, {1}, {1}, {1}, {0}, {0}, {1}, {1}, {1}}};
                break;

            case 16: 
                map = new int[][][]
                               {{{0}, {0}, {1}, {1}, {1}, {0}, {0}, {0}, {0}, {0}},
                                {{0}, {0}, {1}, {7}, {1}, {0}, {0}, {0}, {0}, {0}},
                                {{0}, {0}, {1}, {1}, {1}, {0}, {0}, {1}, {1}, {1}},
                                {{0}, {0}, {0}, {4,0,1}, {0}, {0}, {0}, {1}, {5,11,2,12,3}, {1}},
                                {{0}, {0}, {0}, {4,0,0}, {0}, {0}, {0}, {1}, {1}, {1}},
                                {{0}, {0}, {0}, {1}, {0}, {0}, {0}, {0}, {1}, {0}},
                                {{0}, {0}, {0}, {3,2,3,3,2,4,3}, {0}, {0}, {0}, {0}, {1}, {0}},
                                {{0}, {0}, {0}, {3,1,8,3,1,9,3}, {0}, {0}, {0}, {0}, {1}, {0}},
                                {{0}, {0}, {0}, {4,0,1}, {0}, {0}, {0}, {1}, {1}, {1}},
                                {{0}, {0}, {0}, {4,0,0}, {0}, {0}, {0}, {1}, {6}, {1}},
                                {{0}, {0}, {0}, {5,10,3,12,3}, {0}, {0}, {0}, {1}, {1}, {1}},
                                {{216}, {0}, {5,5,3,7,3}, {1}, {5,12,3,11,4}, {0}, {0}, {0}, {0}, {0}},
                                {{100}, {0}, {0}, {5,10,3,11,2}, {0}, {0}, {0}, {0}, {0}, {0}},
                                {{99}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}},
                                {{100}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}}};
                break;

            case 17: 
                map = new int[][][]
                               {{{0}, {1}, {1}, {1}, {0}, {0}, {0}, {0}, {0}, {0}},
                                {{0}, {1}, {7}, {3,1,8,6}, {0}, {0}, {0}, {0}, {0}, {0}},
                                {{0}, {1}, {1}, {3,0,8,6}, {0}, {0}, {3,1,7,2}, {1}, {1}, {3,1,5,1,0,6,7}},
                                {{0}, {0}, {1}, {0}, {0}, {0}, {1}, {1}, {1}, {1}},
                                {{0}, {0}, {1}, {0}, {0}, {0}, {1}, {0}, {0}, {0}},
                                {{0}, {4,0,1}, {1}, {0}, {0}, {0}, {1}, {0}, {0}, {0}},
                                {{0}, {1}, {1}, {0}, {0}, {0}, {1}, {4,0,0}, {0}, {0}},
                                {{0}, {1}, {4,0,0}, {0}, {0}, {0}, {1}, {1}, {0}, {217}},
                                {{0}, {1}, {0}, {0}, {0}, {0}, {4,0,0}, {1}, {0}, {100}},
                                {{0}, {1}, {0}, {0}, {0}, {0}, {0}, {1}, {0}, {99}},
                                {{0}, {1}, {0}, {0}, {0}, {0}, {0}, {1}, {0}, {100}},
                                {{0}, {1}, {0}, {0}, {0}, {0}, {0}, {1}, {0}, {0}},
                                {{1}, {1}, {1}, {1}, {1}, {1}, {1}, {1}, {1}, {1}},
                                {{1}, {6}, {1}, {1}, {1}, {1}, {1}, {1}, {2,2,6,7}, {1}},
                                {{1}, {1}, {1}, {1}, {1}, {1}, {1}, {1}, {1}, {1}}};
                break;
            case 18:
                map = new int[][][]
                               {{{0}, {0}, {0}, {0}, {1}, {0}, {0}, {0}, {0}, {0}},
                                {{0}, {0}, {0}, {0}, {4,0,3}, {0}, {0}, {1}, {1}, {1}},
                                {{0}, {0}, {0}, {0}, {4,0,2}, {1}, {1}, {1}, {7}, {1}},
                                {{0}, {0}, {0}, {0}, {1}, {0}, {0}, {1}, {1}, {1}},
                                {{0}, {0}, {0}, {0}, {1}, {0}, {0}, {0}, {1}, {1}},
                                {{0}, {0}, {0}, {0}, {4,0,1}, {0}, {0}, {0}, {0}, {0}},
                                {{0}, {0}, {0}, {0}, {4,0,0}, {1}, {1}, {2,1,1,4,1,2,4,1,12,9,1,13,9}, {0}, {0}},
                                {{0}, {2,1,5,4,1,6,4}, {1}, {1}, {1}, {0}, {0}, {0}, {0}, {0}},
                                {{0}, {0}, {0}, {0}, {1}, {0}, {0}, {0}, {0}, {0}},
                                {{0}, {0}, {0}, {0}, {1}, {4,0,0}, {0}, {0}, {0}, {0}},
                                {{0}, {0}, {0}, {1}, {1}, {1}, {0}, {0}, {0}, {0}},
                                {{218}, {0}, {1}, {1}, {1}, {1}, {1}, {0}, {0}, {3,2,9,5}},
                                {{100}, {0}, {2,0,1,4,0,2,4,0,12,9,0,13,9}, {1}, {6}, {1}, {2,0,1,4,0,2,4,0,12,9,0,13,9}, {0}, {0}, {4,0,1}},
                                {{99}, {0}, {1}, {1}, {2,0,5,4,0,6,4}, {1}, {1}, {0}, {0}, {4,0,0}},
                                {{100}, {0}, {1}, {1}, {1}, {1}, {1}, {1}, {1}, {1}}};
                break;

            case 19: 
                map = new int[][][]
                               {{{1}, {1}, {1}, {1}, {1}, {1}, {0}, {219}, {0}, {0}},
                                {{1}, {1}, {1}, {1}, {1}, {1}, {0}, {100}, {0}, {1}},
                                {{1}, {0}, {0}, {0}, {0}, {1}, {0}, {99}, {0}, {1}},
                                {{1}, {0}, {0}, {0}, {0}, {1}, {0}, {100}, {0}, {1}},
                                {{2,2,6,5,2,7,5}, {0}, {0}, {0}, {0}, {2,0,11,9,0,12,9}, {0}, {0}, {0}, {2,1,11,9,1,12,9}},
                                {{1}, {0}, {0}, {0}, {0}, {1}, {0}, {0}, {0}, {1}},
                                {{1}, {0}, {0}, {0}, {0}, {4,0,1}, {0}, {0}, {0}, {1}},
                                {{1}, {0}, {0}, {0}, {0}, {4,0,0}, {0}, {0}, {0}, {1}},
                                {{1}, {1}, {1}, {0}, {0}, {1}, {1}, {1}, {1}, {1}},
                                {{1}, {1}, {1}, {0}, {0}, {1}, {1}, {1}, {1}, {1}},
                                {{1}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {1}},
                                {{1}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {4,1,1}},
                                {{1}, {0}, {0}, {0}, {0}, {1}, {1}, {1}, {1}, {4,1,0}},
                                {{6}, {0}, {0}, {0}, {0}, {1}, {7}, {1}, {1}, {1}},
                                {{0}, {0}, {0}, {0}, {0}, {1}, {1}, {1}, {0}, {0}}};
                break;
            case 20:
                map = new int[][][]
                        {{{1}, {1}, {1}, {0}, {0}, {0}, {1}, {1}, {1}, {1}},
                                {{1}, {1}, {1}, {0}, {0}, {0}, {1}, {1}, {7}, {1}},
                                {{1}, {1}, {1}, {0}, {0}, {0}, {2,2,3,6,2,4,6}, {1}, {1}, {1}},
                                {{0}, {4,0,1}, {0}, {0}, {0}, {0}, {4,0,1}, {0}, {0}, {0}},
                                {{0}, {4,0,0}, {0}, {0}, {0}, {0}, {4,0,0}, {0}, {0}, {0}},
                                {{0}, {1}, {1}, {1}, {2,0,8,1,0,9,1}, {1}, {1}, {0}, {0}, {0}},
                                {{0}, {1}, {6}, {1}, {1}, {1}, {1}, {0}, {0}, {0}},
                                {{0}, {1}, {2,0,8,1,0,9,1}, {1}, {5,1,1,1,7}, {1}, {1}, {0}, {0}, {0}},
                                {{0}, {4,1,1}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}},
                                {{0}, {4,1,0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}},
                                {{0}, {1}, {1}, {1}, {1}, {1}, {0}, {0}, {0}, {0}},
                                {{0}, {1}, {1}, {1}, {2,0,8,1,0,9,1}, {1}, {1}, {0}, {0}, {220}},
                                {{0}, {1}, {1}, {1}, {1}, {1}, {1}, {0}, {0}, {100}},
                                {{0}, {0}, {0}, {0}, {0}, {0}, {1}, {2,2,3,1,2,4,1}, {0}, {99}},
                                {{0}, {0}, {0}, {0}, {0}, {0}, {1}, {1}, {0}, {100}}};
                break;
            case 21: 
                map = new int[][][]
                               {{{0}, {0}, {0}, {0}, {1}, {1}, {1}, {0}, {0}, {0}},
                                {{0}, {0}, {0}, {0}, {1}, {7}, {1}, {0}, {0}, {0}},
                                {{0}, {0}, {0}, {0}, {1}, {1}, {1}, {0}, {0}, {0}},
                                {{0}, {0}, {0}, {0}, {0}, {1}, {0}, {0}, {0}, {0}},
                                {{0}, {0}, {0}, {0}, {0}, {1}, {0}, {0}, {0}, {0}},
                                {{1}, {1}, {1}, {0}, {0}, {1}, {1}, {1}, {1}, {1}},
                                {{1}, {1}, {1}, {1}, {1}, {3,2,11,9}, {3,2,9,7}, {1}, {1}, {1}},
                                {{0}, {1}, {1}, {0}, {0}, {0}, {0}, {0}, {0}, {1}},
                                {{0}, {0}, {1}, {0}, {0}, {0}, {0}, {0}, {0}, {1}},
                                {{0}, {0}, {1}, {1}, {0}, {0}, {0}, {4,0,0}, {1}, {1}},
                                {{0}, {0}, {1}, {1}, {0}, {0}, {0}, {1}, {1}, {1}},
                                {{221}, {0}, {0}, {1}, {1}, {0}, {0}, {1}, {1}, {4,0,0}},
                                {{100}, {0}, {0}, {1}, {1}, {1}, {1}, {1}, {0}, {0}},
                                {{99}, {0}, {1}, {6}, {1}, {1}, {0}, {0}, {0}, {0}},
                                {{100}, {0}, {1}, {1}, {1}, {0}, {0}, {0}, {0}, {0}}};
                break;
            case 22: 
                map = new int[][][]
                               {{{1}, {1}, {1}, {0}, {0}, {0}, {0}, {0}, {0}, {0}},
                                {{1}, {7}, {1}, {4,0,0}, {0}, {0}, {0}, {0}, {0}, {0}},
                                {{1}, {1}, {1}, {1}, {1}, {0}, {0}, {0}, {0}, {0}},
                                {{0}, {0}, {1}, {1}, {1}, {1}, {1}, {1}, {1}, {0}},
                                {{0}, {0}, {1}, {1}, {1}, {0}, {0}, {4,1,0}, {1}, {3,2,11,7}},
                                {{0}, {1}, {1}, {1}, {0}, {0}, {0}, {0}, {0}, {0}},
                                {{0}, {1}, {1}, {1}, {0}, {0}, {0}, {0}, {0}, {0}},
                                {{1}, {1}, {2,0,1,3,0,11,7}, {0}, {0}, {0}, {0}, {0}, {0}, {0}},
                                {{1}, {1}, {1}, {0}, {0}, {0}, {0}, {0}, {0}, {0}},
                                {{0}, {1}, {1}, {2,0,1,3,0,11,7}, {0}, {0}, {0}, {0}, {0}, {0}},
                                {{0}, {1}, {1}, {1}, {0}, {0}, {0}, {0}, {0}, {0}},
                                {{222}, {0}, {1}, {1}, {1}, {0}, {0}, {4,0,0}, {1}, {3,2,1,3}},
                                {{100}, {0}, {1}, {6}, {1}, {1}, {1}, {1}, {1}, {0}},
                                {{99}, {0}, {1}, {1}, {1}, {0}, {0}, {0}, {0}, {0}},
                                {{100}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}}};
                break;
            case 23: 
                map = new int[][][] {
                        {{1}, {1}, {1}, {2, 0, 0, 6, 0, 3, 2, 0, 4, 2}, {1}, {1}, {4, 1, 0}, {0}, {0}, {0}},
                        {{1}, {2, 1, 12, 6, 1, 13, 6, 2, 6, 9}, {1}, {1}, {0}, {0}, {1}, {1}, {1}, {0}},
                        {{1}, {1}, {1}, {1}, {0}, {0}, {1}, {5, 2, 7, 12, 2}, {1}, {0}},
                        {{0}, {0}, {4, 1, 1}, {0}, {0}, {0}, {1}, {1}, {1}, {0}},
                        {{0}, {0}, {4, 1, 0}, {0}, {0}, {0}, {8}, {8}, {8}, {0}},
                        {{0}, {0}, {1}, {1}, {1}, {8}, {8}, {8}, {8}, {0}},
                        {{223}, {0}, {1}, {7}, {1}, {8}, {8}, {8}, {8}, {4, 0, 0}},
                        {{100}, {0}, {1}, {1}, {1}, {8}, {8}, {8}, {8}, {1}},
                        {{99}, {0}, {0}, {0}, {0}, {0}, {8}, {8}, {8}, {1}},
                        {{100}, {0}, {0}, {0}, {0}, {0}, {1}, {1}, {1}, {1}},
                        {{0}, {0}, {0}, {4, 0, 0}, {1}, {1}, {1}, {6}, {1}, {1}},
                        {{1}, {1}, {1}, {1}, {0}, {0}, {1}, {1}, {1}, {1}},
                        {{1}, {3, 1, 10, 3}, {1}, {1}, {0}, {0}, {4, 0, 1}, {0}, {0}, {0}},
                        {{1}, {1}, {1}, {1}, {0}, {0}, {4, 0, 0}, {0}, {0}, {0}},
                        {{0}, {0}, {0}, {4, 0, 1}, {1}, {2, 1, 14, 3, 0, 12, 6, 0, 13, 6}, {1}, {0}, {0}, {0}}};
                break;
            case 24: 
                map = new int[][][]
                               {{{0}, {0}, {1}, {5,8,8,6,8}, {1}, {0}, {0}, {0}, {0}, {0}},
                                {{0}, {0}, {1}, {1}, {1}, {1}, {1}, {1}, {1}, {1}},
                                {{0}, {0}, {1}, {3,1,10,4,1,11,4}, {1}, {0}, {0}, {1}, {7}, {1}},
                                {{0}, {0}, {1}, {1}, {1}, {0}, {0}, {1}, {1}, {1}},
                                {{0}, {0}, {0}, {1}, {0}, {0}, {0}, {0}, {4,0,1}, {0}},
                                {{0}, {0}, {0}, {1}, {0}, {0}, {0}, {0}, {4,0,0}, {0}},
                                {{0}, {0}, {0}, {1}, {0}, {0}, {0}, {0}, {1}, {4,0,0}},
                                {{0}, {0}, {0}, {1}, {1}, {0}, {0}, {0}, {1}, {1}},
                                {{0}, {0}, {0}, {1}, {3,1,6,9}, {1}, {0}, {0}, {1}, {3,2,4,8,2,5,8}},
                                {{0}, {0}, {0}, {1}, {1}, {1}, {1}, {1}, {0}, {0}},
                                {{0}, {0}, {0}, {4,0,0}, {4,0,1}, {0}, {0}, {1}, {0}, {0}},
                                {{224}, {0}, {0}, {0}, {4,0,0}, {0}, {0}, {1}, {1}, {0}},
                                {{100}, {0}, {0}, {0}, {6}, {1}, {1}, {1}, {1}, {0}},
                                {{99}, {0}, {0}, {0}, {0}, {3,1,10,3}, {1}, {1}, {1}, {0}},
                                {{100}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}}};
                break;
            case 25: 
                map = new int[][][]
                               {{{225}, {0}, {4,0,3}, {4,0,2}, {0}, {0}, {0}, {1}, {1}, {1}},
                                {{100}, {0}, {1}, {1}, {1}, {0}, {0}, {1}, {1}, {1}},
                                {{99}, {0}, {1}, {7}, {1}, {0}, {0}, {1}, {1}, {1}},
                                {{100}, {0}, {1}, {1}, {1}, {0}, {0}, {0}, {1}, {0}},
                                {{0}, {0}, {0}, {0}, {4,0,1}, {0}, {0}, {0}, {1}, {0}},
                                {{0}, {0}, {0}, {0}, {4,0,0}, {0}, {0}, {0}, {2,1,6,3,0,9,6,0,8,6}, {0}},
                                {{0}, {0}, {0}, {4,0,0}, {1}, {1}, {1}, {1}, {1}, {0}},
                                {{0}, {0}, {0}, {1}, {1}, {1}, {1}, {1}, {1}, {0}},
                                {{0}, {0}, {0}, {1}, {0}, {0}, {4,1,1}, {0}, {0}, {0}},
                                {{0}, {1}, {2,2,0,2,2,0,3,2,4,4,2,5,4}, {1}, {0}, {0}, {4,1,0}, {0}, {0}, {0}},
                                {{1}, {1}, {1}, {1}, {0}, {0}, {1}, {0}, {0}, {0}},
                                {{1}, {1}, {1}, {0}, {0}, {1}, {3,1,4,4,1,5,4}, {0}, {0}, {0}},
                                {{0}, {0}, {0}, {0}, {0}, {1}, {1}, {4,1,0}, {4,1,1}, {0}},
                                {{0}, {0}, {0}, {0}, {0}, {0}, {1}, {6}, {1}, {0}},
                                {{0}, {0}, {0}, {0}, {0}, {0}, {1}, {1}, {1}, {0}}};
                break;
            case 26: 
                map = new int[][][]
                               {{{5,1,3,3,5}, {1}, {1}, {1}, {0}, {0}, {0}, {0}, {0}, {0}},
                                {{0}, {0}, {0}, {1}, {0}, {0}, {0}, {0}, {0}, {0}},
                                {{0}, {0}, {0}, {1}, {1}, {0}, {0}, {0}, {0}, {0}},
                                {{0}, {1}, {1}, {1}, {1}, {6}, {0}, {0}, {0}, {0}},
                                {{0}, {1}, {1}, {0}, {0}, {0}, {0}, {4,0,1}, {0}, {0}},
                                {{1}, {1}, {1}, {0}, {0}, {0}, {1}, {1}, {1}, {0}},
                                {{1}, {2,0,10,3,0,11,3}, {1}, {1}, {0}, {0}, {1}, {7}, {1}, {0}},
                                {{1}, {1}, {1}, {1}, {1}, {1}, {1}, {1}, {1}, {0}},
                                {{1}, {1}, {1}, {1}, {0}, {0}, {0}, {0}, {0}, {0}},
                                {{0}, {0}, {1}, {1}, {0}, {0}, {0}, {0}, {0}, {0}},
                                {{0}, {0}, {0}, {4,1,1}, {4,0,0}, {0}, {0}, {0}, {0}, {0}},
                                {{226}, {0}, {0}, {4,1,0}, {1}, {1}, {0}, {0}, {0}, {0}},
                                {{100}, {0}, {0}, {1}, {1}, {1}, {1}, {3,1,10,4,1,4,7}, {0}, {0}},
                                {{99}, {0}, {0}, {1}, {1}, {1}, {0}, {0}, {0}, {0}},
                                {{100}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}}};
                break;
            case 27: 
                map = new int[][][]
                               {{{1}, {1}, {1}, {1}, {0}, {0}, {1}, {1}, {1}, {0}},
                                {{1}, {1}, {1}, {3,0,5,9,0,8,9}, {1}, {2,0,5,9}, {1}, {1}, {1}, {0}},
                                {{1}, {0}, {0}, {1}, {1}, {2,0,8,9}, {1}, {1}, {1}, {0}},
                                {{1}, {0}, {0}, {0}, {0}, {0}, {0}, {8}, {8}, {0}},
                                {{1}, {1}, {0}, {0}, {0}, {0}, {0}, {8}, {8}, {0}},
                                {{1}, {1}, {0}, {0}, {0}, {1}, {8}, {8}, {8}, {4,1,0}},
                                {{1}, {1}, {1}, {0}, {0}, {8}, {8}, {8}, {8}, {1}},
                                {{1}, {1}, {1}, {0}, {0}, {8}, {8}, {8}, {8}, {1}},
                                {{0}, {1}, {0}, {0}, {0}, {8}, {8}, {8}, {8}, {4,1,0}},
                                {{0}, {1}, {0}, {0}, {0}, {8}, {8}, {8}, {8}, {0}},
                                {{0}, {1}, {0}, {0}, {0}, {0}, {8}, {8}, {0}, {0}},
                                {{0}, {1}, {0}, {0}, {0}, {0}, {8}, {8}, {0}, {227}},
                                {{1}, {1}, {1}, {0}, {0}, {1}, {1}, {1}, {0}, {100}},
                                {{1}, {6}, {1}, {0}, {0}, {1}, {7}, {1}, {0}, {99}},
                                {{1}, {1}, {1}, {0}, {0}, {1}, {1}, {1}, {0}, {100}}};
                break;
            case 28:
                map = new int[][][] 
                               {{{228}, {0}, {0}, {0}, {0}, {0}, {1}, {1}, {0}, {0}},
                                {{100}, {0}, {0}, {0}, {0}, {0}, {1}, {1}, {0}, {0}},
                                {{99}, {0}, {0}, {0}, {0}, {0}, {1}, {1}, {1}, {1}},
                                {{100}, {0}, {0}, {0}, {0}, {5,0,6,2,9}, {1}, {2,0,5,9,0,6,9,0,10,0,0,11,0}, {1}, {1}},
                                {{0}, {0}, {0}, {0}, {1}, {1}, {1}, {1}, {1}, {1}},
                                {{0}, {0}, {0}, {1}, {1}, {1}, {0}, {0}, {0}, {4,1,1}},
                                {{0}, {0}, {1}, {1}, {1}, {0}, {0}, {0}, {0}, {4,1,0}},
                                {{0}, {1}, {1}, {1}, {0}, {0}, {0}, {0}, {0}, {1}},
                                {{1}, {1}, {1}, {0}, {0}, {0}, {0}, {1}, {1}, {1}},
                                {{1}, {1}, {1}, {0}, {0}, {0}, {0}, {1}, {1}, {1}},
                                {{4,1,1}, {0}, {0}, {0}, {0}, {0}, {0}, {1}, {0}, {0}},
                                {{4,1,0}, {0}, {0}, {0}, {0}, {1}, {1}, {1}, {0}, {0}},
                                {{1}, {1}, {6}, {0}, {0}, {1}, {7}, {1}, {1}, {1}},
                                {{1}, {1}, {8}, {8}, {8}, {1}, {1}, {1}, {0}, {0}},
                                {{0}, {0}, {8}, {8}, {8}, {8}, {0}, {0}, {0}, {0}}};
                break;
            case 29:
                map = new int[][][] 
                               {{{0}, {0}, {0}, {3,1,11,9}, {0}, {0}, {0}, {0}, {0}, {0}},
                                {{0}, {0}, {0}, {4,0,5}, {0}, {0}, {0}, {0}, {0}, {0}},
                                {{3,1,9,5,1,9,6}, {0}, {0}, {4,0,4}, {0}, {0}, {2,1,12,3,1,13,3}, {0}, {0}, {2,1,1,3,1,2,3,0,3,0,0,4,0,0,3,6,0,4,6,0,10,0,0,11,0}},
                                {{4,0,3}, {0}, {0}, {1}, {0}, {0}, {4,1,1}, {0}, {0}, {4,1,1}},
                                {{4,0,2}, {0}, {0}, {1}, {0}, {0}, {4,1,0}, {0}, {0}, {4,1,0}},
                                {{1}, {1}, {1}, {1}, {1}, {1}, {1}, {1}, {1}, {1}},
                                {{0}, {0}, {1}, {1}, {229}, {0}, {0}, {0}, {0}, {0}},
                                {{0}, {0}, {1}, {6}, {100}, {0}, {0}, {0}, {0}, {0}},
                                {{0}, {0}, {1}, {1}, {99}, {1}, {1}, {1}, {0}, {0}},
                                {{1}, {1}, {1}, {1}, {100}, {4,0,1}, {4,0,0}, {1}, {1}, {0}},
                                {{4,1,1}, {0}, {0}, {1}, {0}, {0}, {0}, {0}, {4,0,1}, {0}},
                                {{4,1,0}, {0}, {0}, {1}, {0}, {0}, {0}, {0}, {4,0,0}, {4,0,0}},
                                {{2,1,3,0,1,4,0,0,3,6,0,4,6}, {0}, {0}, {4,0,1}, {0}, {0}, {0}, {1}, {1}, {1}},
                                {{0}, {0}, {0}, {4,0,0}, {0}, {0}, {0}, {1}, {7}, {1}},
                                {{0}, {0}, {0}, {3,1,10,8,1,11,8,0,3,9,0,4,9}, {0}, {0}, {0}, {1}, {1}, {1}}};
                break;
            case 30: 
                map = new int[][][]
                               {{{0}, {0}, {3,1,5,6,1,2,6,0,3,3,0,4,3}, {1}, {1}, {1}, {1}, {4,0,0}, {0}, {0}},
                                {{0}, {0}, {1}, {1}, {0}, {0}, {1}, {1}, {0}, {0}},
                                {{1}, {8}, {8}, {1}, {0}, {0}, {4,0,2}, {3,2,0,7}, {1}, {1}},
                                {{1}, {0}, {0}, {4,1,1}, {0}, {0}, {0}, {0}, {8}, {8}},
                                {{1}, {0}, {0}, {4,1,0}, {0}, {0}, {0}, {0}, {8}, {8}},
                                {{8}, {0}, {0}, {1}, {0}, {0}, {4,0,3}, {8}, {8}, {8}},
                                {{8}, {0}, {0}, {1}, {8}, {8}, {1}, {1}, {8}, {8}},
                                {{1}, {0}, {0}, {8}, {8}, {8}, {1}, {8}, {8}, {0}},
                                {{230}, {1}, {0}, {0}, {0}, {0}, {0}, {8}, {8}, {0}},
                                {{100}, {1}, {1}, {0}, {0}, {0}, {0}, {1}, {8}, {8}},
                                {{99}, {7}, {1}, {0}, {0}, {0}, {0}, {8}, {8}, {8}},
                                {{100}, {1}, {1}, {0}, {0}, {8}, {8}, {1}, {8}, {8}},
                                {{0}, {0}, {0}, {0}, {6}, {1}, {8}, {8}, {8}, {1}},
                                {{0}, {0}, {0}, {0}, {0}, {3,1,3,3,1,4,3}, {8}, {8}, {8}, {8}},
                                {{0}, {0}, {0}, {0}, {0}, {0}, {8}, {8}, {1}, {0}}};
                break;
            case 31:
                map = new int[][][]{ 
                                {{4,0,2}, {4,0,1}, {4,0,0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}},
                                {{1}, {1}, {1}, {0}, {0}, {8}, {1}, {1}, {1}, {0}},
                                {{1}, {7}, {1}, {1}, {8}, {8}, {1}, {6}, {1}, {0}},
                                {{1}, {1}, {1}, {0}, {0}, {8}, {1}, {1}, {1}, {0}},
                                {{0}, {0}, {4,0,1}, {0}, {0}, {0}, {0}, {4,1,1}, {0}, {0}},
                                {{0}, {0}, {4,0,0}, {0}, {0}, {0}, {0}, {4,1,0}, {0}, {0}},
                                {{0}, {3,2,4,2,2,5,2}, {1}, {1}, {1}, {1}, {1}, {1}, {0}, {0}},
                                {{231}, {0}, {1}, {1}, {1}, {1}, {1}, {2,0,4,2,0,5,2,0,4,7,0,5,7,0,9,7,0,10,7,0,9,7,0,10,7}, {0}, {0}},
                                {{100}, {0}, {1}, {1}, {2,0,4,2,0,5,2,0,4,7,0,5,7,0,9,7,0,10,7,0,9,7,0,10,7}, {1}, {1}, {1}, {3,2,9,7,2,10,7}, {0}},
                                {{99}, {0}, {4,1,1}, {0}, {0}, {0}, {0}, {4,0,1}, {0}, {0}},
                                {{100}, {0}, {4,1,0}, {0}, {0}, {0}, {0}, {4,0,1}, {0}, {0}},
                                {{0}, {1}, {1}, {1}, {8}, {0}, {0}, {1}, {1}, {1}},
                                {{0}, {1}, {1}, {1}, {8}, {8}, {1}, {1}, {3,0,9,2,0,10,2,1,0,0,1,0,1,0,0,2}, {1}},
                                {{0}, {1}, {1}, {1}, {8}, {0}, {0}, {1}, {1}, {1}},
                                {{0}, {0}, {0}, {0}, {0}, {0}, {0}, {4,1,2}, {4,1,1}, {4,1,0}}};

                break;
            case 32: 
                map = new int[][][]
                               {{{3,2,8,1,2,9,1,2,10,7,2,11,7}, {1}, {1}, {0}, {0}, {0}, {0}, {0}, {0}, {0}},
                                {{1}, {1}, {1}, {0}, {0}, {0}, {0}, {0}, {0}, {0}},
                                {{0}, {1}, {3,2,10,8,2,11,8}, {1}, {0}, {0}, {0}, {0}, {0}, {0}},
                                {{0}, {0}, {1}, {232}, {1}, {1}, {6}, {1}, {1}, {0}},
                                {{0}, {0}, {0}, {100}, {1}, {1}, {1}, {1}, {1}, {0}},
                                {{0}, {0}, {0}, {99}, {1}, {0}, {0}, {0}, {1}, {0}},
                                {{0}, {1}, {1}, {100}, {0}, {0}, {0}, {0}, {1}, {0}},
                                {{0}, {1}, {1}, {0}, {0}, {0}, {1}, {1}, {1}, {0}},
                                {{0}, {4,1,1}, {4,0,1}, {0}, {0}, {0}, {1}, {3,2,8,2,2,9,2}, {1}, {0}},
                                {{0}, {4,1,0}, {4,0,0}, {0}, {0}, {0}, {1}, {1}, {1}, {0}},
                                {{0}, {1}, {1}, {1}, {1}, {0}, {0}, {4,0,2}, {4,0,1}, {0}},
                                {{0}, {1}, {1}, {7}, {1}, {0}, {0}, {4,0,3}, {4,0,0}, {0}},
                                {{0}, {0}, {1}, {1}, {1}, {0}, {0}, {1}, {1}, {0}},
                                {{0}, {0}, {0}, {0}, {0}, {0}, {0}, {1}, {1}, {0}},
                                {{0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}}};
                break;
            case 33:
                map = new int[][][]
                               {{{0}, {0}, {0}, {0}, {0}, {0}, {1}, {3,1,3,1}, {1}, {1}},
                                {{0}, {0}, {1}, {2,0,10,7,0,11,7}, {1}, {1}, {1}, {2,0,10,7,0,11,7}, {1}, {1}},
                                {{0}, {0}, {1}, {1}, {1}, {1}, {1}, {1}, {1}, {1}},
                                {{0}, {4,0,0}, {1}, {1}, {1}, {2,0,10,7,0,11,7}, {2,0,10,7,0,11,7}, {1}, {1}, {0}},
                                {{1}, {1}, {1}, {2,0,10,7,0,11,7}, {2,0,10,7,0,11,7}, {1}, {1}, {1}, {0}, {0}},
                                {{1}, {1}, {1}, {2,0,10,7,0,11,7}, {1}, {1}, {1}, {1}, {0}, {0}},
                                {{1}, {1}, {2,0,10,7,0,11,7}, {1}, {1}, {1}, {1}, {0}, {0}, {0}},
                                {{2,0,10,7,0,11,7}, {1}, {1}, {1}, {2,0,10,7,0,11,7}, {1}, {1}, {1}, {1}, {0}},
                                {{1}, {1}, {1}, {1}, {1}, {1}, {1}, {2,0,10,7,0,11,7}, {1}, {0}},
                                {{1}, {1}, {2,0,10,7,0,11,7}, {1}, {1}, {1}, {1}, {1}, {1}, {0}},
                                {{0}, {0}, {0}, {4,1,0}, {0}, {0}, {0}, {4,1,0}, {0}, {0}},
                                {{233}, {0}, {0}, {4,1,0}, {0}, {0}, {0}, {4,1,0}, {0}, {0}},
                                {{100}, {0}, {1}, {1}, {0}, {0}, {1}, {1}, {1}, {1}},
                                {{99}, {0}, {1}, {6}, {0}, {0}, {1}, {7}, {1}, {1}},
                                {{100}, {0}, {1}, {1}, {0}, {0}, {1}, {1}, {1}, {1}}};
                break;
            default:
            {
                break;
            }
        }
        return map;
    }
}