package my.paginingdemo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by hplaptop on 25-03-2019.
 */

public interface Api {


    @GET("answers")
    Call<StackApiResponse> getAnswers(@Query("page") int page, @Query("pagesize") int pagesize, @Query("site") String site);

}


