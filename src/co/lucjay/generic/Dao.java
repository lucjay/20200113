package co.lucjay.generic;

import java.util.List;

public abstract class Dao {

	public abstract <E> List<E> allselect();

	public abstract <E> E select(E t);

}
