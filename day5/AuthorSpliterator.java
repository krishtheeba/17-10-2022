package SplitIteratorEx;

import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class AuthorSpliterator<Author> implements Spliterator<Author> {

	private final List<Author> list;
	int count;
	
	
	
	public AuthorSpliterator(List<Author> list) {
		super();
		this.list = list;
		}

	@Override
	public boolean tryAdvance(Consumer<? super Author> action) {
	
		action.accept(list.get(count++));
		return count < list.size();
	}

	@Override
	public Spliterator<Author> trySplit() {
	
		int currentSize  = list.size()-count;
		if(currentSize<=3) {
			return null;
		}
		for( int splitPos = currentSize/2;  splitPos<list.size(); splitPos++) {
			
			Spliterator<Author>   splitit = new AuthorSpliterator(list.subList(count,splitPos));
			count=splitPos;
			
			return splitit;
		}
		
		return null;
	}

	@Override
	public long estimateSize() {
	
		return list.size() -count;
	}

	@Override
	public int characteristics() {
	
		return ORDERED;
	}

}
