package com.example.myshop;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.myshop.application.HomeApplication;
import com.example.myshop.constants.Urls;
import com.example.myshop.interfaces.Post;
import com.example.myshop.services.NetworkService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
public class MainActivity extends AppCompatActivity {
    TextView categoryName;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        categoryName=findViewById(R.id.categoryName);
        NetworkService.getInstance()
                .getJSONApi()
                .getCategories()
                .enqueue(new Callback<List<Post>>() {
                    @Override
                    public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                        List<Post> list = response.body();
                        for (Post item: list
                             ) {
                            categoryName.append(item.getName()+"\n");
                            categoryName.append(item.getImage()+"\n");
                        }
                       // textView.append(post.getId() + "\n");
                       // textView.append(post.getUserId() + "\n");
                       // textView.append(post.getTitle() + "\n");
                        //textView.append(post.getBody() + "\n");
                    }

                    @Override
                    public void onFailure(Call<List<Post>> call, Throwable t) {

                       // textView.append("Error occurred while getting request!");
                        t.printStackTrace();
                    }
                });

        ImageView avatar = (ImageView)findViewById(R.id.myImage);
        String url = Urls.BASE+"/images/2.jpg";
        Glide.with(HomeApplication.getAppContext())
                .load(url)
                .apply(new RequestOptions().override(600))
                .into(avatar);
    }
}