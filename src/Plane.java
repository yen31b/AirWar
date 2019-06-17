

	
import bateria.Mapa;
import bateria.PanelImagen;

import javax.swing.*;
import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
 
	public class Plane extends JFrame{

		public PanelImagen panel;

		public Plane(){
			super();
			inicializarComponentes();
		}

	    public static void main(String[] args) {
	    	
	        JFrame frame = new JFrame("AirWar");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(1600, 1000);
	        frame.setLocationRelativeTo(null);
	        frame.add(new Canvas());
	        frame.setVisible(true);

	        Plane plane = new Plane();
	        
	        
	    }

		private void inicializarComponentes() {
			panel = new PanelImagen();

			this.add(panel);


			setContentPane(panel);

		}

	}

	class Canvas extends JComponent {

	    /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private int lastX = 0;
		private int lastY = 0;
		private int Xdest = 0;
		private int Ydest = 0;
		
		
		
		private int p = 12;{
		if (p==0) {
			lastX=165;
			lastY=295;
			Xdest=265;
			Ydest=350;}
		if (p==1) {
			lastX=265;
			lastY=350;
			Xdest=165;
			Ydest=295;}
		if (p==2) {
			lastX=165;
			lastY=285;
			Xdest=265;
			Ydest=570;}
		if (p==3) {
			lastX=266;
			lastY=350;
			Xdest=265;
			Ydest=570;}
		if (p==4) {
			lastX=270;
			lastY=350;
			Xdest=760;
			Ydest=165;}
		if (p==5) {
			lastX=762;
			lastY=330;
			Xdest=760;
			Ydest=460;}
		if (p==6) {
			lastX=760;
			lastY=460;
			Xdest=960;
			Ydest=462;}
		if (p==7) {
			lastX=760;
			lastY=460;
			Xdest=762;
			Ydest=630;}
		if (p==8) {
			lastX=760;
			lastY=630;
			Xdest=670;
			Ydest=830;}
		if (p==9) {
			lastX=270;
			lastY=570;
			Xdest=271;
			Ydest=740;}
		if (p==10) {
			lastX=270;
			lastY=740;
			Xdest=271;
			Ydest=910;}
		if (p==11) {
			lastX=270;
			lastY=910;
			Xdest=460;
			Ydest=911;}
		if (p==12) {
			lastX=460;
			lastY=910;
			Xdest=660;
			Ydest=700;}
		}
		
		
	    public Canvas() {
	        Thread animationThread = new Thread(new Runnable() {
	        	
	            public void run() {
               while (lastX!=Xdest && lastY!=Ydest ) {
	                    repaint();
	                    try {Thread.sleep(100);} catch (Exception ex) {}
	                    ;
	                }
	            }
	        });

	        animationThread.start();
	    }
	   

	    public void paintComponent(Graphics g) {
	        Graphics2D gg = (Graphics2D) g;
	        Image m = new ImageIcon("C:\\Users\\Yen\\Desktop\\proyecto 3\\hp2.png").getImage();
	        Image m2 = new ImageIcon("C:\\Users\\Yen\\Desktop\\proyecto 3\\hp2.png").getImage();
	        g.drawImage(m,0,0,this);
	     
	        
            if(p==0) {
            
            
	       
	        int Speed = 1;

	        int x = lastX + 2;
            int y = lastY + Speed;
            
	        gg.setColor(Color.BLACK);
	        
	        g.drawImage(m2,x, y,20,20,this);
	        

	        lastX = x;
	        lastY = y		;
	        }
            if(p==1) {
                
               
    	        int Speed = 1;

    	        int x = lastX - 2;
                int y = lastY - Speed;
                
    	        gg.setColor(Color.BLACK);
    	        
    	        g.drawImage(m2,x, y,20,20,this);
    	        

    	        lastX = x;
    	        lastY = y		;
    	        }
               if(p==2) {
                
           

    	        int x = lastX + 1;
                int y = lastY + 3;
                
    	        gg.setColor(Color.BLACK);
    	        
    	        g.drawImage(m2,x, y,20,20,this);
    	        

    	        lastX = x;
    	        lastY = y		;
    	        }
               if(p==3) {
                   
                   
       	       

       	        int x = lastX ;
                   int y = lastY + 5;
                   
       	        gg.setColor(Color.BLACK);
       	        
       	        g.drawImage(m2,x, y,20,20,this);
       	        

       	        lastX = x;
       	        lastY = y		;
       	        }
               if(p==4) {
                   
                   
          	     

          	        int x = lastX + 10 ;
                      int y = lastY - 1;
                     System.out.println (x );
                     System.out.println (y );
          	        gg.setColor(Color.BLACK);
          	        
          	        g.drawImage(m2,x, y,20,20,this);
          	        

          	        lastX = x;
          	        lastY = y		;
          	        }
               if(p==5) {
                   
                   
         	     

         	        int x = lastX  ;
                     int y = lastY +10;
                    System.out.println (x );
                    System.out.println (y );
         	        gg.setColor(Color.BLACK);
         	        
         	        g.drawImage(m2,x, y,20,20,this);
         	        

         	        lastX = x;
         	        lastY = y		;
         	        }
               if(p==6) {
                   
                  

        	        int x = lastX +5 ;
                    int y = lastY;
                   System.out.println (x );
                   System.out.println (y );
        	        gg.setColor(Color.BLACK);
        	        
        	        g.drawImage(m2,x, y,20,20,this);
        	        

        	        lastX = x;
        	        lastY = y		;
        	        }
               if(p==7) {
                   
                   
       	        

       	        int x = lastX  ;
                   int y = lastY +10;
                  System.out.println (x );
                  System.out.println (y );
       	        gg.setColor(Color.BLACK);
       	        
       	        g.drawImage(m2,x, y,20,20,this);
       	        

       	        lastX = x;
       	        lastY = y		;
       	        }
               if(p==8) {
                   
                   

          	        int x = lastX -5 ;
                      int y = lastY +10;
                     System.out.println (x );
                     System.out.println (y );
          	        gg.setColor(Color.BLACK);
          	        
          	        g.drawImage(m2,x, y,20,20,this);
          	        

          	        lastX = x;
          	        lastY = y		;
          	        }
               if(p==9) {
                   
                   
           	       

          	        int x = lastX ;
                      int y = lastY + 5;
                      
          	        gg.setColor(Color.BLACK);
          	        
          	        g.drawImage(m2,x, y,20,20,this);
          	        

          	        lastX = x;
          	        lastY = y		;
          	        }
               if(p==10) {
                   
                   
           	       

         	        int x = lastX ;
                     int y = lastY + 5;
                     
         	        gg.setColor(Color.BLACK);
         	        
         	        g.drawImage(m2,x, y,20,20,this);
         	        

         	        lastX = x;
         	        lastY = y		;
         	        }
               if(p==11) {
                   
                   
           	       

        	        int x = lastX+10 ;
                    int y = lastY ;
                    
        	        gg.setColor(Color.BLACK);
        	        
        	        g.drawImage(m2,x, y,20,20,this);
        	        

        	        lastX = x;
        	        lastY = y		;
        	        }
               if(p==12) {
                   
                   
           	       

       	        int x = lastX+20;
                   int y = lastY-10 ;
                   
       	        gg.setColor(Color.BLACK);
       	        
       	        g.drawImage(m2,x, y,20,20,this);
       	        

       	        lastX = x;
       	        lastY = y		;
       	        }
	    }
	    
	    	
	}
