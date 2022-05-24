package lesson_5.Homework_5;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static lesson_5.Homework_5.RetrofitCallMarket.executeCall;

public class MinimarketService {
//    private int id;
    private final MinimarketApi api;

    public MinimarketService() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor(System.out::println);

        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .build();

        api = new Retrofit.Builder()
                .baseUrl("https://minimarket1.herokuapp.com/market/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build()
                .create(MinimarketApi.class);
    }

    public CategoryResult getCategory(int id) {
        return executeCall(api.getCategory(id));
    }

    public ProductResult500 getProducts() {
        return executeCall(api.getProducts());
    }

    public Products postProduct(String title, Integer price, String categoryTitle) {
        Products product = new Products();
        product.setPrice(price);
        product.setTitle(title);
        product.setCategoryTitle(categoryTitle);

        return executeCall(api.postProduct(product));
    }

    public Products putProduct(Integer id, String title, Integer price, String categoryTitle) {
        Products product = new Products(id, title, price, categoryTitle);
        return executeCall(api.putProduct(product));
    }

    public Products getProduct(Integer id) {
        return executeCall(api.getProduct(id));
    }

    public Object deleteProduct(Integer id) {
        return executeCall(api.deleteProduct(id));
    }
}
