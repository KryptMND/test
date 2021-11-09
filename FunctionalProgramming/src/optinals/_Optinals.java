package optinals;

import java.util.Optional;

public class _Optinals {

	public static void main(String[] args) {
		
		Optional<String> empty = Optional.ofNullable(null);
		
		System.out.println(empty.isEmpty());
		System.out.println(empty.isPresent());
		
		String orElse = empty.orElse("World");
		
		System.out.println(orElse);
	}

}
