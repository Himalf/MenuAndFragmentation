package com.example.fragmentation;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MenuAcitvity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu_acitvity);
        Button btn = findViewById(R.id.conid);
        registerForContextMenu(btn);
      Button pop = findViewById(R.id.popups);

    }
    public void showMenu(View v){
        PopupMenu popup = new PopupMenu(this,v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.mymenu);
        popup.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        int selectedId = item.getItemId();
        if (selectedId == R.id.menuitem1) {
            gotoAcitivity2();
            return true;
        }
       else if (selectedId == R.id.menuitem2) {
            gotoAcitivity2();
            return true;
        }
      else{
            gotoAcitivity2();
            return  true;
        }


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


    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
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

        return super.onContextItemSelected(item);
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
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