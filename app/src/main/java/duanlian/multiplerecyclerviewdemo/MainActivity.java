package duanlian.multiplerecyclerviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by guokun on 2017/1/7.
 * Description:
 * @param
 * @return
 */
public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<String> picList;
    private List<Map<String, Object>> channelList;
    private List<Integer> girlList;
    private List<String> normalList;
    private RecyclerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initView() {
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        picList = new ArrayList<>();
        channelList = new ArrayList<>();
        girlList = new ArrayList<>();
        normalList = new ArrayList<>();
        //设置布局管理器
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    /**
     * 模拟添加数据
     */
    private void initData() {
        //轮播图需要的图片地址
        String picPath = "http://fdfs.xmcdn.com/group27/M04/D4/24/wKgJW1j11VzTmYOeAAG9Mld0icA505_android_large.jpg";
        String picPath1 = "http://fdfs.xmcdn.com/group27/M0A/D4/81/wKgJR1j13gKTWVXaAALwrIB1AVY346_android_large.jpg";
        String picPath2 = "http://fdfs.xmcdn.com/group26/M05/D8/97/wKgJRlj13vqRHDmVAASRJaudX3I424_android_large.jpg";
        picList.add(picPath);
        picList.add(picPath1);
        picList.add(picPath2);
        //频道数据
        for (int i = 0; i < 15; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("title", "频道" + i);
            map.put("pic", R.drawable.channel);
            channelList.add(map);
        }
        for (int i = 0; i < 6; i++) {
            girlList.add(R.mipmap.ic_launcher);
        }
        for (int i = 0; i < 20; i++) {
            normalList.add("正常布局" + i);
        }

        adapter = new RecyclerAdapter(this,picList,channelList,girlList,normalList);
        recyclerView.setAdapter(adapter);

    }
}
