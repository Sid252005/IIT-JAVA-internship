package com.sunbeam.quiz.main;

import java.util.*;

import java.sql.*;

import com.sunbeam.quiz.menu.MainMenu;



public class Main {
	private static final String URL="jdbc:mysql://localhost:3306/quiz_system";
	private static final String USER="root";
	private static final String PASS="managerSTring ";
	public static Connection getConnection()throws SQLException{
		return DriverManager.getConnection(URL,USER,PASS);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//MainMenu.mainMenu(sc);
		MainMenu.enumMainMenu(sc);
	}

}
