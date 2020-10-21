package ashrut.saxena.destrution.shayar;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import Adapter.MyAdapter;
import Model.ListItem;

public class quotes extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<ListItem> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes);

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItems = new ArrayList<>();
        ListItem item1 = new ListItem("SHAYARI", "PASSION IN MY MIND, WANTED TO DO SOMETHING GREAT THE PEOPLE WHO ARE SAYING ANYTHING BEHIND MY BACK  WANTED TO SHUT THEMSELVES WITH MY GREAT WORK", "");
        ListItem item2 = new ListItem("SHAYARI", "PEOPLE WITH GREAT PASSION" +
                "CAN MAKE THE IMPOSSIBLE HAPPEN", "");
        //for(int i=0;i<10;i++){
        // ListItem item=new ListItem(
        //"item"+(i+1),
        // "description",
        // "rating"
        // );

        listItems.add(item1);
        listItems.add(item2);
        // }
        adapter = new MyAdapter(this, listItems);
        recyclerView.setAdapter(adapter);
    }
}
