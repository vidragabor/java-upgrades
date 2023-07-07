package co.uk.wob.util;

import lombok.NonNull;
import lombok.experimental.UtilityClass;

import java.util.StringJoiner;

@UtilityClass
public class BookUtil {
	public String generateTitle(@NonNull final String author, @NonNull final String title) {
		return new StringJoiner(" ").add(title).add("by").add(author).toString();
	}
}
