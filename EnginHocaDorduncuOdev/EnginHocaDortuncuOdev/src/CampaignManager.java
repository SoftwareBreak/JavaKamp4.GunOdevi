
public class CampaignManager implements ICampaignService {

	@Override
	public void add(Campaign campaign) {
      System.out.println("Kampanya Eklendi : "+campaign.getName());		
	}

	@Override
	public void delete(Campaign campaign) {
	      System.out.println("Kampanya Silindi : "+campaign.getName());		

	}

	@Override
	public void guncelle(Campaign campaign) {
	      System.out.println("Kampanya Güncellendi : "+campaign.getName());		

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
