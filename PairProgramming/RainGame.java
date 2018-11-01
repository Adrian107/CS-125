/**
 * @author replace-this-with-your-netids-on-this-line-here-with-a-comma-between-them
 */
import java.awt.Color;

public class RainGame {

	public static void main(String[] args) {
		// To get points type your netids above (CORRECTLY-Please double check your partner correctly spells your netid correctly!!)
		// Your netid is the unique part of your @illinois email address
		// Do not put your name or your UIN. 
		// REMEMBER TO COMMIT this file...
		while (Zen.isRunning())
		{
			Zen.setFont("Helvetica-30");
			Zen.drawText("Press ' S ' to Start", Zen.getZenWidth()/2-130, Zen.getZenHeight()/2);
			Zen.setFont("Helvetica-10");
			Zen.drawText("By: Zhixin Xie",Zen.getZenWidth()-200,Zen.getZenHeight()-20);
			String user = Zen.getEditText();
			Zen.setEditText("");
			if (user.length() == 0) continue;
			if (user.charAt(0) == 's') break;
			Zen.flipBuffer();
			Zen.sleep(9);
		}
	
		int x=0, y=0, dx=1, dy=1, dxSign=1, dySign=1,score = -1000000, level = 0;
		Color textColor= new Color(0, 0, 0);
		Color backgroundColor=new Color(255,255,255);
		String text = "";
		long startTime =System.currentTimeMillis();
		
		Zen.setFont("Helvetica-64");
		while (Zen.isRunning()) {
			if (text.length() == 0) {
				if(level<70)
					x = Zen.getZenWidth()/2-10*(level/10)-15;
				else
					x = Zen.getZenWidth()/2-15*(6);
				y = Zen.getZenHeight() / 2;
				if(Math.random()>.5)
					dxSign*=-1;
				if(Math.random()>.5)
					dySign*=-1;
				if(level<15)
				{
				dx = dxSign*(level+(int) (Math.random() * 5));
				dy = dySign*(level+(int) (Math.random() * 5));
				}
				else
				{
					dx = dxSign*(15+(int) (Math.random() * 2));
					dy = dySign*(15+(int) (Math.random() * 2));
				}
				if(level<70)
				text = "" + (int) (Math.random() * (999*(Math.pow(10, level/10))));
				else
					text = "" + (int) (Math.random() * (999*(Math.pow(10, 6))));
				long elapsed = System.currentTimeMillis() - startTime;
				startTime = System.currentTimeMillis();
				score += (10000 / elapsed)*level;
				if(score<0)score=0;
				level++;
				if(level>5)
				textColor= new Color((int) (Math.random() * 255),(int) (Math.random() * 255),(int) (Math.random() * 255));
				if (level>10)
				backgroundColor = new Color((int) (Math.random() * 255),(int) (Math.random() * 255),(int) (Math.random() * 255));
			}

			if(Zen.isKeyPressed(' '))
			{
				level++;
				if(level<70)
					x = Zen.getZenWidth()/2-10*(level/10)-15;
				else
					x = Zen.getZenWidth()/2-15*(6);
				y = Zen.getZenHeight() / 2;
				if(Math.random()>.5)
					dxSign*=-1;
				if(Math.random()>.5)
					dySign*=-1;
				if(level<15)
				{
					dx = dxSign*(level+(int) (Math.random() * 5));
					dy = dySign*(level+(int) (Math.random() * 5));
				}
				else
				{
					dx = dxSign*(15+(int) (Math.random() * 2));
					dy = dySign*(15+(int) (Math.random() * 2));
				}
				text = "" + (int) (Math.random() * (999*(Math.pow(10, level/10))));
				if(level>5)
				textColor= new Color((int) (Math.random() * 255),(int) (Math.random() * 255),(int) (Math.random() * 255));
				if (level>10)
				backgroundColor = new Color((int) (Math.random() * 255),(int) (Math.random() * 255),(int) (Math.random() * 255));
				//levelUp=true;
			}
			
			if(y>=Zen.getZenHeight()||x>=Zen.getZenWidth()||y<=0||x<=0)
			{
				if(level>1)
					level--;
				if((score-(int)(score/(level))>0))
					score-=(int)(score/(level));
				else score=0;
				text = "";
				long elapsed = System.currentTimeMillis() - startTime;
				score-=(10000 / elapsed)*level;
				level--;
				
				x = Zen.getZenWidth()/2-5*level/10;
				y = Zen.getZenHeight() / 2;
				if(Math.random()>.5)
					dxSign*=-1;
				if(Math.random()>.5)
					dySign*=-1;
				if(level<20)
				{
				dx = dxSign*(level);
				dy = dySign*(level);
				}
				if(level>5)
				textColor= new Color((int) (Math.random() * 255),(int) (Math.random() * 255),(int) (Math.random() * 255));
			}
			Zen.flipBuffer();
			
			if(level<=10)
			backgroundColor=new Color(0,0,0);
			Zen.setColor(backgroundColor);
			Zen.fillRect(0, 0, Zen.getZenWidth(), Zen.getZenHeight());

			if(level<=5)
				textColor= new Color(255, 255, 255);
			Zen.setFont("Helvetica-32");
			Zen.setColor(textColor);
			Zen.drawText(text, x, y);
			
			Zen.drawText("Level: "+level,10,50);
			Zen.drawText("Score: "+score,10,100);
			
			Zen.setFont("Helvetica-22");
			Zen.setColor(255,255,255);
			Zen.drawText("Press space to increase level.",0,Zen.getZenHeight()-3);
			
			x += dx;
			y += dy;
			
			String user = Zen.getEditText();
			Zen.setEditText("");
			for(int i=0;i < user.length();i++) {
				char c = user.charAt(i);
				if(c == text.charAt(0))
					text = text.substring(1,text.length());
			}

				Zen.sleep(90);
		}
	}

}