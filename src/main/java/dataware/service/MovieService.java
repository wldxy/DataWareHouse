package dataware.service;

import dataware.model.Movie;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Created by ocean on 17-1-1.
 */
public interface MovieService {
    int countMovieByTime(int year) throws SQLException;

    int countMovieByTime(int year, int month) throws SQLException;

    int countMovieByTime(int year, List<Integer> months) throws SQLException;

    int countMovieByTime(int year, int month, int day) throws SQLException;

    List<Movie> findMovieByName(String movieName) throws SQLException;

    List<Movie> findMovieByDirectorName(String directorName) throws SQLException;

//    List<Movie> findByActorName(String actorName) throws SQLException;

    List<Map> findByActorName(String actorName) throws SQLException;

    List<Map> findByTypeName(String typeName) throws SQLException;
}
