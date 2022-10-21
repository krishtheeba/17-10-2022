package SplitIteratorEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class AuthorSpliteratorImple {

	public static void main(String[] args) {
		
		List<Author> l = new ArrayList<>();
		l.add(new Author("Ram",12));
		l.add(new Author("sam",1));
		l.add(new Author("Vam",2));
		l.add(new Author("Jim",2));
		l.add(new Author("Jam",32));
		
		AuthorSpliterator split1 =new AuthorSpliterator<Author>(l) ;
		Spliterator<Author> split2 = split1.trySplit();
		System.out.println(split1.estimateSize());
		
		Spliterator<Author> split3 = split1.trySplit();
		System.out.println(split3);
		

	}

}
