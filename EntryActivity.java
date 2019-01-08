package academy_sdk;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

public class EntryActivity extends AppCompatActivity {


    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);
        showAuth();


    }

    private void showAuth() {
        AuthFragment fragment1 = new AuthFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.entry_container, fragment1)
                .addToBackStack(null)
                .commit();
    }

    public void showMain() {
        MainFragment fragment2 = new MainFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.entry_container, fragment2)
                .commit();

    }

    public static class AuthFragment extends Fragment {

        public final void onAuthSuccess() {
                showMain();
        }

        }



    }

    public static class MainFragment extends Fragment {

        public void onBackPressed(){
            onBackPressed();
        }






    @Override
    public void onBackPressed() {
            super.onBackPressed();
    }





}