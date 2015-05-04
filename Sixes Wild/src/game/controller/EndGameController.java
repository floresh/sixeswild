package game.controller;

import game.boundary.EndGameScreen;
import game.boundary.LevelView;
import game.entities.Model;
import game.main.Main;
/**
 * 
 * @author Jake
 *
 *	This is the controller that is called when a level ends. It opens an EndGameScreen jframe and 
 *  displays the appropriate information in that frame.
 */
public class EndGameController {
	/** The levelview that the player was interacting with prior to ending the level. */
	LevelView frame;
	
	/** The EndGameScreen that will pop up now that the level has ended. */
	EndGameScreen winLoseScreen;
	
	
	public EndGameController(LevelView levelView) {
		this.frame = levelView;
		process();
	}
	
	/** Gets the score and star values, and then updates the EndGameScreen to properly
	 *  reflect the player's status.  */
	public boolean process(){
		int score = frame.getLevel().getScore();
		int oneStar = frame.getLevel().getStars().get(0);
		int twoStar = frame.getLevel().getStars().get(1);
		int threeStar = frame.getLevel().getStars().get(2);
		frame.getTimeController().stop();
		frame.getBoardView().setVisible(false);
		winLoseScreen = new EndGameScreen(frame);
		
		if(score < oneStar){
			winLoseScreen.getWinLose().setText("You Lose.");
			winLoseScreen.getLblStars().setText("0 Stars, Score: " + frame.getLevel().getScore());
		}
		else if((score >= oneStar) && (score < twoStar)){
			winLoseScreen.getWinLose().setText("You Win!");
			winLoseScreen.getLblStars().setText("1 Star, Score: " + frame.getLevel().getScore());
			setUnlocks();
		}
		else if((score >= twoStar) && (score < threeStar)){
			winLoseScreen.getWinLose().setText("You Win!");
			winLoseScreen.getLblStars().setText("2 Stars, Score: " + frame.getLevel().getScore());
			setUnlocks();
		}
		else if(score >= threeStar){
			winLoseScreen.getWinLose().setText("You Win!");
			winLoseScreen.getLblStars().setText("3 Stars, Score: " + frame.getLevel().getScore());
			setUnlocks();
		}
		return true;
	}
	
	
	/** This method unlocks the appropriate levels upon level completion. 
	 *  It is only called if the player has earned at least 1 star. */
	public void setUnlocks(){
		String levelType = frame.getLevel().getGameMode();
		
		switch(levelType){
			case "Puzzle": levelType = "Puzzle";
				for(int i=0;i<3;i++){
					if((Main.model.unlockedLevels[0][i] == true) &&
							(Main.model.unlockedLevels[0][i+1] == false)){
						Main.model.unlockedLevels[0][i+1] = true;
						Main.model.unlockedLevels[1][0] = true;
						Main.model.unlockedLevels[2][0] = true;
						Main.model.unlockedLevels[3][0] = true;
						break;
					}
				}
				break;
				
			case "Elimination": levelType = "Elimination";
				for(int i=0;i<3;i++){
					if((Main.model.unlockedLevels[1][i] == true) &&
					(Main.model.unlockedLevels[1][i+1] == false)){
						Main.model.unlockedLevels[1][i+1] = true;
						break;
					}
				}
				break;
				
			case "Lightning": levelType = "Lightning";
				for(int i=0;i<3;i++){
					if((Main.model.unlockedLevels[2][i] == true) &&
					(Main.model.unlockedLevels[2][i+1] == false)){
						Main.model.unlockedLevels[2][i+1] = true;
						break;
					}
				}
				break;
				
			case "Release": levelType = "Release";
				for(int i=0;i<3;i++){
					if((Main.model.unlockedLevels[3][i] == true) &&
					(Main.model.unlockedLevels[3][i+1] == false)){
						Main.model.unlockedLevels[3][i+1] = true;
						break;
					}
				}
				break;
		}
	}
	
}
