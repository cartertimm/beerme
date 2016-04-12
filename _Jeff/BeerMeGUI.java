import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 * User Interface for the BeerMe Application
 * 
 * @author 		Jeff Wheadon
 * @version 	1.1
 * @date		April 11, 2016
 * @file		BeerMeGUI.java
 */

public class BeerMeGUI extends JFrame
{

	// *****************************************************************
	// *  Fields
	// *****************************************************************
	
	private JPanel mainPanel = new JPanel();
	
	//** Menu Bar (North section of mainPanel)
	private JLabel menuBar = new JLabel();
	private JLabel beerMeLogo = new JLabel("BeerMe");
	private JPanel navButtonPanel = new JPanel();
	private JButton discoverTab = new JButton();
	private JButton onTapTab = new JButton();
	private JButton profileTab = new JButton();
	
	//** Pages (Center section of mainPanel)
	private JPanel pages = new JPanel();
	
	//* Discover Page
	private JPanel discoverPage = new JPanel();
	private JPanel topBar = new JPanel(); //Card layout for searching/filtering
	
	//Search Bar
	private JPanel searchBar = new JPanel();
	private JButton filterButtonOff = new JButton();
	private JPanel searchPanelBag = new JPanel();
	private JPanel searchPanel = new JPanel();
	private JTextField searchField = new JTextField("Search By Name", 40);
	private JButton submitSearch = new JButton("Submit");
	
	//FilterBar
	private JPanel filterBar = new JPanel();
	private JButton filterButtonOn = new JButton();
	
	//Beer Recommendation List
	private JPanel beerReccs = new JPanel();
	
	
	
	//* On Tap Page
	private JPanel onTapPage = new JPanel();
	
	//* Profile Page
	private JPanel profilePage = new JPanel();
	

	// *****************************************************************
	// *  Constructor
	// *****************************************************************	
	public BeerMeGUI() {
		super("BeerMe");
		
		//Initial Frame Setup
		setSize(700,475);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Main Panel Setup
		mainPanel.setLayout(new BorderLayout());
		
		
		//** Menu Bar (North section of mainPanel)
		menuBar.setLayout(new BorderLayout());
		menuBar.setIcon(new ImageIcon("bin/MenuBarBackground.png"));
		
		//Logo
		Font logoFont = beerMeLogo.getFont();
		beerMeLogo.setFont(new Font(logoFont.getName(), Font.PLAIN, 50));
		beerMeLogo.setBorder(new EmptyBorder(0,10,0,0));
		beerMeLogo.setForeground(Color.white);
		menuBar.add(beerMeLogo, BorderLayout.WEST);
		
		//NavButtonPanel
		navButtonPanel.setLayout(new FlowLayout());
		navButtonPanel.setOpaque(false);

		//Discover Tab
		discoverTab.setIcon(new ImageIcon("bin/DiscoverButton.png"));
		discoverTab.setBorder(new EmptyBorder(0,0,0,10));
		discoverTab.setContentAreaFilled(false);
		discoverTab.setCursor(new Cursor(Cursor.HAND_CURSOR));
		discoverTab.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		CardLayout cl = (CardLayout)(pages.getLayout());
    			cl.show(pages, "discoverPage");
        	}
        });
		navButtonPanel.add(discoverTab);
		
		//OnTap Tab
		onTapTab.setIcon(new ImageIcon("bin/MyTapButton.png"));
		onTapTab.setBorder(new EmptyBorder(0,10,0,10));
		onTapTab.setContentAreaFilled(false);
		onTapTab.setCursor(new Cursor(Cursor.HAND_CURSOR));
		onTapTab.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		CardLayout cl = (CardLayout)(pages.getLayout());
    			cl.show(pages, "onTapPage");
        	}
        });
		navButtonPanel.add(onTapTab);
		
		//Profile Tab
		profileTab.setIcon(new ImageIcon("bin/ProfileButton.png"));
		profileTab.setBorder(new EmptyBorder(0,10,0,10));
		profileTab.setContentAreaFilled(false);
		profileTab.setCursor(new Cursor(Cursor.HAND_CURSOR));
		profileTab.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		CardLayout cl = (CardLayout)(pages.getLayout());
    			cl.show(pages, "profilePage");
        	}
        });
		navButtonPanel.add(profileTab);
		
		menuBar.add(navButtonPanel, BorderLayout.EAST); //adds navButtonPanel to menuBar

		mainPanel.add(menuBar, BorderLayout.NORTH); //Add menu bar to mainPanel
		
		
		
		//** Pages (Center section of mainPanel)
		pages.setLayout(new CardLayout());	
		
		//* Discover Page
		discoverPage.setLayout(new BorderLayout());	
		topBar.setLayout(new CardLayout());
		topBar.setPreferredSize(new Dimension(700,75));
		topBar.setBorder(new EmptyBorder(10,10,10,10));
		
		//Search Bar
		searchBar.setLayout(new BorderLayout());
		filterButtonOff.setIcon(new ImageIcon("bin/filterButtonOff.png"));
		filterButtonOff.setBorder(new EmptyBorder(0,10,0,0));
		filterButtonOff.setContentAreaFilled(false);
		filterButtonOff.setCursor(new Cursor(Cursor.HAND_CURSOR));
		filterButtonOff.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		CardLayout cl = (CardLayout)(topBar.getLayout());
    			cl.show(topBar, "filterBar");
        	}
        });
		searchBar.add(filterButtonOff, BorderLayout.WEST);
		
		searchPanelBag.setLayout(new GridBagLayout());
		searchPanel.setLayout(new FlowLayout());
		searchPanel.add(searchField);
		searchPanel.add(submitSearch);
		searchPanelBag.add(searchPanel);
		searchBar.add(searchPanelBag, BorderLayout.EAST);
		
		topBar.add(searchBar, "searchBar"); //adds searchBar to topBar
		
		//Filter Bar
		filterBar.setLayout(new BorderLayout());
		filterButtonOn.setIcon(new ImageIcon("bin/filterButtonOn.png"));
		filterButtonOn.setBorder(new EmptyBorder(0,10,0,0));
		filterButtonOn.setContentAreaFilled(false);
		filterButtonOn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		filterButtonOn.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		CardLayout cl = (CardLayout)(topBar.getLayout());
    			cl.show(topBar, "searchBar");
        	}
        });
		filterBar.add(filterButtonOn, BorderLayout.WEST);
		topBar.add(filterBar, "filterBar"); //adds filterBar to topBar
		
		discoverPage.add(topBar,BorderLayout.NORTH);
		
		beerReccs.setLayout(new FlowLayout());
		
		BeerDisplay beer1 = new BeerDisplay();
		beerReccs.add(beer1);
		BeerDisplay beer2 = new BeerDisplay();
		beerReccs.add(beer2);
		BeerDisplay beer3 = new BeerDisplay();
		beerReccs.add(beer3);
		BeerDisplay beer4 = new BeerDisplay();
		beerReccs.add(beer4);
		BeerDisplay beer5 = new BeerDisplay();
		beerReccs.add(beer5);
		BeerDisplay beer6 = new BeerDisplay();
		beerReccs.add(beer6);
		discoverPage.add(beerReccs, BorderLayout.CENTER);
		
		
		pages.add(discoverPage, "discoverPage"); //adds discoverPage to pages
		
		
		
		
		//* On Tap Page
		onTapPage.setLayout(new BorderLayout());
		
		pages.add(onTapPage, "onTapPage"); //adds onTapPage to pages
		
		//* Profile Page
		profilePage.setLayout(new BorderLayout());
		
		pages.add(profilePage, "profilePage"); //add profile Page to pages
		
		
		mainPanel.add(pages, BorderLayout.CENTER);
		
		
		add(mainPanel);	//adds mainPanel to the frame
		setVisible(true); //makes the frame visible
		
	} //end constructor
	
	
	// *****************************************************************
	// *  Main
	// *****************************************************************	
	public static void main(String[] args){
		new BeerMeGUI();
	}
	
	
}