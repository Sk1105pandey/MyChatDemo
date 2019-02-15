package dotzoo.dzo.com.mychatdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
String Id[]={"sId","rId","sId","rId","sid"};
String msgS[]={"hello","yes","no","ok","fine"};
String msgR[]={"hello","yes","no","ok","fine"};
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.chatList);
        ChatlistAdapter adapter=new ChatlistAdapter(this,Id,msgR,msgS);
        listView.setAdapter(adapter);

    }
}
