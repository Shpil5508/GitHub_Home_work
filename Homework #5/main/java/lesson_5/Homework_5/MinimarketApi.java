package lesson_5.Homework_5;

import retrofit2.Call;
import retrofit2.http.*;

public interface MinimarketApi {
    @GET("api/v1/categories/{id}")
    Call<CategoryResult> getCategory(@Path("id") int id);

    @GET("api/v1/products")
    Call<ProductResult500> getProducts();

    @POST("api/v1/products")
    Call<Products> postProduct(@Body Products product);

    @PUT("api/v1/products")
    Call<Products> putProduct(@Body Products product);

    @GET("api/v1/products/{id}")
    Call<Products> getProduct(@Path("id") int id);

    @DELETE("api/v1/products/{id}")
    Call<Object> deleteProduct (@Path("id") int id);
}
