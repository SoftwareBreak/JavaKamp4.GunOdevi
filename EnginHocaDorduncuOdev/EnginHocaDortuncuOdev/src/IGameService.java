
public interface IGameService {
	void add(Game game);
	void delete(Game game);
	void guncelle(Game game);
	void sales(Game game,Campaign campaign,Player player);
	void sales(Game game,Player player);

}
