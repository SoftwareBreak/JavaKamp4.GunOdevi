
public class Main {

	public static void main(String[] args) {
Player player1 = new  Player();
		player1.setId(3);
        player1.setName("Fatih");
		player1.setDateOfBirth("2005");
		player1.setTc("420");
		player1.setPoint(100);
		IPlayerService playerService = new PlayerManager(new PersonFakeCheckManager());
	    playerService.add(player1);
		 
		Game game1 = new Game(3, "Valorant ", 100);
		IGameService gameService = new GameManager();
		gameService.add(game1);
		gameService.delete(game1);
		gameService.guncelle(game1);
  
		
		Campaign campaign0 = new Campaign(1,"Böyle Bir Oyunu Bu Fyata... Daha Kapmanyamý!!!", 100);
		ICampaignService campaignService = new CampaignManager();
		campaignService.add(campaign0);
		
        

		gameService.sales(game1, campaign0, player1);
		gameService.sales(game1,player1);
		
	}

}
