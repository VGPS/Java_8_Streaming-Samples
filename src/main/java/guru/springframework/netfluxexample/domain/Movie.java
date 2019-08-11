package guru.springframework.netfluxexample.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by jt on 9/1/17.
 */
@Document
@Data		// convenience - getters, setters, toString(), equals
@NoArgsConstructor

public class Movie {

    public Movie(String id, String title) {
    	this.id = id;
    	this.title = title;
    	
    	System.out.println("Movie.constr() - movie is: " + this.id + ", " + this.title);
    	
	}

	private String id;

    @NonNull
    private String title;

}