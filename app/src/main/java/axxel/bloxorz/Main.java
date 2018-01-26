package axxel.bloxorz;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class Main extends Activity implements OnClickListener{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        findViewById(R.id.Play).setOnClickListener(this);
        findViewById(R.id.Instructions).setOnClickListener(this);
		findViewById(R.id.FloodEmAll).setOnClickListener(this);
        findViewById(R.id.Blox).setOnClickListener(this);
        findViewById(R.id.Exit).setOnClickListener(this);
    }

	public void onClick(View v) {
		switch (v.getId()){
			case R.id.Play:
				Intent intent = new Intent();
				intent.setClass(this, Play.class);
				startActivity(intent);
				break;
			case R.id.Instructions:
			    instruction();
                break;
            case R.id.FloodEmAll:
                Intent marketIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("market://details?id=axxel.floodit"));
                startActivity(marketIntent);
                break;
            case R.id.Blox:
                Intent marketIntentBlox = new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=axxel.bloxorz"));
                startActivity(marketIntentBlox);
                break;
			case R.id.Exit:
				Main.this.finish();
				break;
		}
	}

    private void instruction() {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.instruclayout);
        TextView instruc =  dialog.findViewById(R.id.instructions1);
        instruc.setText(getString(R.string.instruc));
        Button OK = dialog.findViewById(R.id.OK);
        OK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.cancel();
            }
        });
        dialog.show();
    }
}