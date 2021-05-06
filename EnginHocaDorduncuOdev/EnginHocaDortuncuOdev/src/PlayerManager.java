
public class PlayerManager implements IPlayerService{
private IPersonCheckService personCheckService;
public PlayerManager(IPersonCheckService personCheckService) {
	this.personCheckService = personCheckService;
}


@Override
public void add(Player player) {
if(this.personCheckService.checkIfRealPerson(player)) {
	
	System.out.println("Oyuncu Sisteme Eklendi : "+player.getName());
	
}

else {
	
	System.out.println("Oyuncu Sisteme Eklenemedi");
	
}

}

@Override
public void delete(Player player) {
System.out.println("Oyuncu Sistemden Silidi :"+player.getName());	

}

@Override
public void guncelle(Player player) {
	
if(this.personCheckService.checkIfRealPerson(player)) {
	
	System.out.println("Oyuncu Güncellendi : "+player.getName());
	
}

else {
	
	System.out.println("Oyuncu Güncellenmedi");
}
	
	
}
}
