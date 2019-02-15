package dotzoo.dzo.com.mychatdemo;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ChatlistAdapter extends ArrayAdapter {
    Context context;
    String name,id,img,msg;
    String[] ids;
    String[] msgR;
    String[] msgS;
    ImageView receiverImg,senderImg;
    TextView receiverText,senderText;
    public ChatlistAdapter( @NonNull Context context, String name,String id,String img,String msg) {

        super(context,0);
        this.context=context;
        this.name=name;
        this.id=id;
        this.msg=msg;
        this.img=img;
    }

    public ChatlistAdapter(MainActivity mainActivity, String[] id, String[] msgR, String[] msgS) {
        super(mainActivity,0);
        this.context=mainActivity;
        this.ids=id;
        this.msgR=msgR;
        this.msgS=msgS;
    }

    @Override
    public int getCount() {
        return ids.length;
    }

    @Override
    public View getView(int position,  @Nullable View convertView,  @NonNull ViewGroup parent) {
        LayoutInflater inflater= ((Activity)context).getLayoutInflater();
        convertView=inflater.inflate(R.layout.activity_chat,parent,false);
        receiverImg=convertView.findViewById(R.id.receiverImg);
        senderImg=convertView.findViewById(R.id.senderImg);
        senderText=convertView.findViewById(R.id.senderText);
        receiverText=convertView.findViewById(R.id.receiverText);
        if(ids[position].equals("sId")){
            senderText.setText(msgS[position]);
            senderText.setVisibility(View.VISIBLE);
            senderImg.setVisibility(View.VISIBLE);
           // senderImg.setImageDrawable(context.getResources().getDrawable(R.drawable.appicon));
        }else {
            receiverText.setText(msgR[position]);
            receiverText.setVisibility(View.VISIBLE);
            receiverImg.setVisibility(View.VISIBLE);
           // receiverImg.setImageDrawable(context.getResources().getDrawable(R.drawable.jobs));

        }

        return convertView;
    }
}
