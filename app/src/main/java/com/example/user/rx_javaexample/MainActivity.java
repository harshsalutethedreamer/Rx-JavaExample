package com.example.user.rx_javaexample;

import android.database.Observable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import rx.Observer;

public class MainActivity extends AppCompatActivity {

    private SimpleViewAdapter adapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView) findViewById(R.id.activity_recyclerview);
        adapter=new SimpleViewAdapter(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        createObservable();
    }

    private void createObservable(){
        //Rx java is about observables and observers
        rx.Observable<List<String>> listObservable= rx.Observable.just(getDeserts());
        listObservable.subscribe(new Observer<List<String>>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(List<String> strings) {
                adapter.setmStringList(strings);
            }
        });
    }

    private List<String> getDeserts(){
        ArrayList<String> deserts=new ArrayList<>();
        deserts.add("chasni");
        deserts.add("icecream");
        deserts.add("soanpapri");
        deserts.add("haluea");
        return deserts;
    }
}
