package ApiTest;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class BackTest {


    @Test
    public void testGetAllMovies() {
        given()
                .when()
                .get("https://83n5sz9zvl.execute-api.us-east-1.amazonaws.com/api/v1/movies")
                .then()
                .statusCode(200);
    }

    @Test
    public void testGetMovieById() {
        given()
                .contentType(ContentType.JSON).with().queryParam("movieId", "64e4d1b9daf2a2c7f2f2d1f7")
                .when()
                .get("https://83n5sz9zvl.execute-api.us-east-1.amazonaws.com/api/v1/movies/")
                .then()
                .statusCode(200);
    }

    @Test
    public void testGetMovieByTitle() {

        given()
                .contentType(ContentType.JSON).with().queryParam("title", "89")
                .when()
                .get("https://83n5sz9zvl.execute-api.us-east-1.amazonaws.com/api/v1/movies/search?title=")
                .then()
                .statusCode(200);
    }

    @Test
    public void testGetMovieByPlatform() {

        given()
                .contentType(ContentType.JSON).with().queryParam("platforms", "Netflix,HBO")
                .when()
                .get("https://83n5sz9zvl.execute-api.us-east-1.amazonaws.com/api/v1/movies/filter?platforms=")
                .then()
                .statusCode(200);
    }

    @Test
    public void testGetMovieByGenre() {

        given()
                .contentType(ContentType.JSON).with().queryParam("genres", "Drama,Accion")
                .when()
                .get("https://83n5sz9zvl.execute-api.us-east-1.amazonaws.com/api/v1/movies/filter?genres=")
                .then()
                .statusCode(200);
    }


    @Test
    public void testGetUserInfo() {

        String userId = "d7cda781-9ab7-46be-8007-b34e792fb4b1";

        given()
                .contentType(ContentType.JSON)
                .when()
                .get("https://83n5sz9zvl.execute-api.us-east-1.amazonaws.com/authorization/users/" + userId)
                .then()
                .statusCode(200);
    }

    @Test
    public void testPostAddMovieToWatchlist() {

        String userId = "d6c8b8d8-75da-4e7a-bef7-b7f2830b0aa0";
        String movieId = "64e4d1b9daf2a2c7f2f2d205";


        String requestBody = "{\"movieId\": \"" + movieId + "\"}";

        given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post("https://83n5sz9zvl.execute-api.us-east-1.amazonaws.com/authorization/users/" + userId + "/watchlist")
                .then()
                .statusCode(200);
    }

    @Test
    public void testGetAddMovieToWatchlist() {

        String userId = "d6c8b8d8-75da-4e7a-bef7-b7f2830b0aa0";
        String movieId = "64e4d1b9daf2a2c7f2f2d205";


        String requestBody = "{\"movieId\": \"" + movieId + "\"}";


        given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .get("https://83n5sz9zvl.execute-api.us-east-1.amazonaws.com/authorization/users/" + userId + "/watchlist")
                .then()
                .statusCode(200);
    }

}


