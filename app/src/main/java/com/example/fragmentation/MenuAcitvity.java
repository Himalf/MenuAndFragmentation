package com.example.fragmentation;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MenuAcitvity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu_acitvity);
        Button btn = findViewById(R.id.conid);
        registerForContextMenu(btn);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mi = getMenuInflater();
        mi.inflate(R.menu.mymenu,menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
   MenuInflater mi = getMenuInflater();
   mi.inflate(R.menu.mymenu,menu);
        super.onCreateContextMenu(menu, v, menuInfo);
        gotoAcitivity2();

    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
int selectItem = item.getItemId();
if(selectItem==R.id.conid){
    gotoAcitivity2();
    return  true;
}
        return super.onContextItemSelected(item);
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Button btn = findViewById(R.id.conid);
        int selectedId = item.getItemId();
        if(selectedId==R.id.menuitem1){
            gotoAcitivity2();
            return  true;
        }
        if(selectedId==R.id.menuitem2){
            gotoAcitivity2();
            return true;
        }
        if(selectedId==R.id.menuitem3){
            gotoAcitivity2();
        }

        return super.onOptionsItemSelected(item);
    }
    public void gotoAcitivity2(){
        Intent i = new Intent(getApplicationContext(), FragmentActivity.class);
        startActivity(i);
    }

   
}