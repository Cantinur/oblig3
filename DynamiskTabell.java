import java.util.Iterator;


class DynamiskTabell<T> extends StatiskTabell<T>{

  public DynamiskTabell(){
    super(lengde);
    this.tabell = (T[]) new Object[lengde];
  }

  private T[] tabell;


  @Override
  public void settInn(T element){
    for (int i = 0; i <= tabell.length-1; i++){
      if (tabell[i] == null){
        tabell[i] = element;
        return;
      }
    }
    T[] temp = tabell;
    lengde = lengde*2;
    tabell = (T[]) new Object[lengde];
    int i = 0;
    for (T data : temp){
      tabell[i] = data;
      i++;
    }
    tabell[i] = element;
  }
}
