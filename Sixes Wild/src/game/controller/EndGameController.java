package game.controller;

import game.boundary.EndGameScreen;
import game.boundary.LevelView;
import game.entities.Model;
import game.main.Main;

public class EndGameController {
	LevelView frame;
	EndGameScreen winLoseScreen;
	
	public EndGameController(LevelView levelView) {
		this.frame = levelView;
		process();
	}
	
	public boolean process(){
		int score = frame.getLevel().getScore();
		int oneStar = frame.getLevel().getStars().get(0);
		int twoStar = frame.getLevel().getStars().get(1);
		int threeStar = frame.getLevel().getStars().get(2);
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
	
	public void setUnlocks(){
		String levelType = frame.getLevel().getGameMode();
		
		switch(levelType){
			case "Puzzle": levelType = "Puzzle";
				for(int i=0;i<3;i++){
					if(Main.model.unlockedLevels[0][i] == true){
						Main.model.unlockedLevels[0][i+1] = true;
						Main.model.unlockedLevels[1][0] = true;
						Main.model.unlockedLevels[2][0] = true;
						Main.model.unlockedLevels[3][0] = true;
						break;
					}
				}
				
			case "Elimination": levelType = "Elimination";
				for(int i=0;i<3;i++){
					if(Main.model.unlockedLevels[1][i] == true){
						Main.model.unlockedLevels[1][i+1] = true;
						break;
					}
				}
			case "Lightning": levelType = "Lightning";
			for(int i=0;i<3;i++){
				if(Main.model.unlockedLevels[2][i] == true){
					Main.model.unlockedLevels[2][i+1] = true;
					break;
				}
			}
			case "Release": levelType = "Release";
			for(int i=0;i<3;i++){
				if(Main.model.unlockedLevels[3][i] == true){
					Main.model.unlockedLevels[3][i+1] = true;
					break;
				}
			}
		}
	}
	
}
