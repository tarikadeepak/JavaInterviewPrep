package coding.interview;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromArray {
	@SuppressWarnings("unchecked")
	<E> Set<E> removeDuplicatesFromArray(E[] array){
		Set<E> arrayElementSet = new HashSet<E>(); 
		for(E arrayElement : array)
			arrayElementSet.add(arrayElement);
		int i=0;
		return arrayElementSet;
	}
}
