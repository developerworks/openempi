/**
 *  Copyright (c) 2009-2011 Misys Open Source Solutions (MOSS) and others
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *  implied. See the License for the specific language governing
 *  permissions and limitations under the License.
 *
 *  Contributors:
 *    Misys Open Source Solutions - initial API and implementation
 *    -
 */
package org.openhealthtools.openexchange.syslog;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;

import org.apache.log4j.Logger;


/**
 * Class allowing to do several tasks on a database such as : <br/>
 * <ul>
 *   <li>create a table</li>
 *   <li>List fields in a table</li>
 *   <li>Test if a table exists</li>
 *   <li>Test if a message exists</li>
 * </ul>
 * <br />
 * An abstract log table contains a String tableName, a message identifier which allows to 
 * test if a message exists in a table, the createTableSqlCommand, readSqlCommand and writeSqlCommand 
 * have to be defined later and will be the command used to read or write in the database.
 * 
 * @author <a href="mailto:anilkumar.reddy@misys.com">Anil kumar</a>
 *
 */


public abstract class AbstractLogTable 
{
  protected Connection database ;
  
  protected String messageId ;
  

  protected String tableName           ;
  
  private final static Logger logger = Logger.getLogger(AbstractLogTable.class);
  
  //abstract int  writeToDB ( ) throws LoggerException  ;

  abstract void setWriteSqlCommand ( String sqlCommand )                   ;
  abstract void setReadSqlCommand ( String sqlCommand )                    ;
  

  /**
   * create a table with the structure specified in the sqlCommand string
   * @param sqlCommand
   * @throws SQLException
   */
  protected void createTable( String sqlCommand ) throws LoggerException 
	{
		try
		{
			if ( database== null || database.isClosed() )
				throw new LoggerException("Database null or closed") ;
			if ( sqlCommand !=null )
				database.createStatement().execute( sqlCommand ) ;
		} catch (SQLException e) 
		{
			throw new LoggerException( "AbstractLogTable::createTable()::" + e.getMessage() , e) ;
		}
		
	}
  
  /***
   * 
   * Lists tables present in the database specified in the conncection
   * @param c, a conncection
   * @return a Hashset of table's name
   * @throws SQLException
   */
  
  public static HashSet<String> ListTable ( Connection c ) 
  {
	  HashSet<String> set = null;
	  try {
		if ( c!=null && !c.isClosed() )
		  {
			set = new HashSet<String>() ;
		  String sqlRequest = "SELECT table_name FROM information_schema.tables WHERE table_type = 'BASE TABLE' AND table_schema NOT IN ('pg_catalog', 'information_schema');" ;
		    
		   ResultSet result = c.createStatement().executeQuery( sqlRequest ) ;
		   
		   //System.out.println("Table list") ;
		   while ( result.next() )
		   {
			  // System.out.println( result.getString( 1 ) ) ;
			   set.add( result.getString( 1 ) ) ;
		   }
				 
		  }
		  else return null ;
	} catch (SQLException e) {
		
		logger.debug("AbstractLogTable::ListTable()::" + e.getMessage() ) ;
	}
	return set ;
  }
  
  /**
   * Lists tables present in the current database
   * @return
   * @throws SQLException
   */
  public HashSet<String> listTable (  ) throws LoggerException
  {
	  HashSet<String> set = null ;
	  try {
		  if ( database==null || database.isClosed() )
					throw new SQLException("Database null or closed") ;
		
		  set = new HashSet<String>() ;
		  String sqlRequest = "SELECT table_name FROM information_schema.tables WHERE table_type = 'BASE TABLE' AND table_schema NOT IN ('pg_catalog', 'information_schema');" ;
		    
		   ResultSet result = database.createStatement().executeQuery( sqlRequest ) ;
		   
		  // System.out.println("Table list") ;
		   while ( result.next() )
		   {
			   //System.out.println( result.getString( 1 ) ) ;
			   set.add( result.getString( 1 ) ) ;
		   }
	  } catch (SQLException e) 
	  {
			throw new LoggerException( "AbstractLogTable::ListTable()::" + e.getMessage() ) ; 
 	  }
		  
		return set ;	 
  }
  
  /**
   * Tests if the table specified in parameter exists.
   * @param name
   * @return
   * @throws SQLException
   */
  public boolean tableExist ( String name  ) throws LoggerException
  {
	  boolean ret = false ;

	   ret = listTable().contains( name.toLowerCase().trim()) ;
	  
	
	return ret ;
  }
  
  /**
   * Test if the current table exists in the database
   * @return
   * @throws SQLException
   */
  public boolean tableExist (  ) throws LoggerException
  {
	  boolean ret = false ;
	
	  ret = ( listTable().contains( tableName )  ) ;
	 
	return ret ;
  }
  /**
   * Test if the table named 'name' exists in the database specified by the connection c
   * @param c , Database connection. It should be opened.
   * @param name
   * @return
   * @throws SQLException
   */
  public static boolean TableExist ( Connection c , String name ) throws LoggerException
  {
	  boolean ret = false ;
	 
	  ret = ( ListTable(c).contains( name.toLowerCase().trim() ) ) ;  
	 
	return ret ;
  }
  
  /**
   * Tests if the message 'messageID' exists in the table named 'tableName'
   * @param messageID
   * @param tableName
   * @return
   * @throws SQLException
   */
  public boolean messageExist ( String messageID , String tableName ) throws LoggerException
  {
		String currentTable = tableName.toLowerCase() ;
		/* if ( tableExist( tableName  ) )
		 {*/  // This test is deleted to optimize calls to the database
			 try {
				if ( database==null || database.isClosed() ) 
						throw new LoggerException("Database null or closed") ;
				} catch (SQLException e)
				{
					throw new LoggerException("Database null or closed") ;
				}
			 
			 String sqlRequest = "SELECT count(*) from " + currentTable + " where  messageid='"+ messageID +"' ;" ;
	
					Statement st;
					try {
						st = database.createStatement();
						
					    ResultSet res = st.executeQuery( sqlRequest ) ;
			
					    res.next() ;
					    if ( res.getInt(1) == 0 ) return false ;
					    else if ( res.getInt(1) > 0 ) return true ;   
					} catch (SQLException e) {
						throw new LoggerException( "AbstractLogTable::messageExist()::" + e.getMessage() ) ;
					}
		 /*}
		 else return false ;*/
		return false ;
  }
  
  
  public void deleteMessage( PreparedStatement deletePreparedStatement )
  {
	  try 
	  {
		deletePreparedStatement.setString( 1 , messageId ) ;
		deletePreparedStatement.executeUpdate() ;
	  } catch (SQLException e) 
	  {
		System.err.println("Unable to delete message number :" + messageId ) ;
		e.printStackTrace();
	  }
  }
  public void deleteMessage( String inMessageId ,  PreparedStatement deletePreparedStatement  )
  {
	  try 
	  {
		deletePreparedStatement.setString( 1 , inMessageId ) ;
		System.out.println(deletePreparedStatement.toString()) ;
		deletePreparedStatement.executeUpdate() ;
		 
	  } catch (SQLException e) 
	  {
		System.err.println("Unable to delete message number :" + inMessageId ) ;
		e.printStackTrace();
	  }	  
  }
  /**
   * Tests if the message 'messageID' exists in the current table
   * @param messageID
   * @return
   * @throws SQLException
   */
  public boolean messageExist ( String messageID   ) throws LoggerException
  {
		if ( tableName!=null  )
		{
		 /*if ( tableExist( tableName  ) )
		 {*/
			 try {
				if ( database==null || database.isClosed() ) 
						throw new LoggerException("Database null or closed") ;
				} catch (SQLException e) {
					throw new LoggerException( "AbstractLogTable::messageExist()::" + e.getMessage() ) ;

				}
			 
			 String sqlRequest = "SELECT count(*) from " + tableName + " where  messageid='"+ messageID +"' ;" ;
	
					Statement st;
					try {
						st = database.createStatement();
					
					    ResultSet res = st.executeQuery( sqlRequest ) ;
			
					    res.next() ;
					    if ( res.getInt(1) == 0 ) return false ;
					    else if ( res.getInt(1) > 0 ) return true ;   
					
					} catch (SQLException e) {
						throw new LoggerException( "AbstractLogTable::messageExist()::" + e.getMessage() ) ;

					}
		/* }
		 else return false ;*/
		}
		
		return false ;
  }
  
  /**
   * Tests if the message 'messageID' exists in the table named 'tableName' in the database specified by the connection 'c'
   * @param c, a Connection
   * @param inTableName
   * @param messageID
   * @return
   * @throws SQLException
   */
  public static boolean MessageExist ( Connection c , String inTableName , String messageID   ) throws LoggerException
  {
		if ( inTableName!=null  )
		{
		/* Reduction of the database calls
		 *  if ( TableExist( c , inTableName  ) )
		 {*/
			 try {
				if ( c==null || c.isClosed() ) 
						throw new SQLException("Database null or closed") ;
			
			 
			   String sqlRequest = "SELECT count(*) from " + inTableName + " where  messageid='"+ messageID +"' ;" ;
	
					Statement st = c.createStatement() ;
				    ResultSet res = st.executeQuery( sqlRequest ) ;
		
				    res.next() ;
				    if ( res.getInt(1) == 0 ) return false ;
				    else if ( res.getInt(1) > 0 ) return true ;   
			 } catch (SQLException e) {
					throw new LoggerException( "AbstractLogTable:: MessageExist()::" + e.getMessage() ) ;
				}
			  
		 }
		/* else return false ;
		}*/
		
		return false ;
  }
  
  /**
   * Lists the fields present in the current table
   * @return a hashset of fields name
   * @throws SQLException
   */
  public HashSet<String> listFields ( ) throws LoggerException
  { 
	  HashSet<String> set = null ;
	  try {
		if ( database == null || database.isClosed() )
				throw new LoggerException("Database null or closed") ;

	  set = new HashSet<String>() ;
	  String sqlRequest = "SELECT column_name FROM information_schema.columns WHERE table_name = '"+tableName.toLowerCase().trim()+"'";
     
	  ResultSet result = database.createStatement().executeQuery( sqlRequest ) ;
	   
	   //System.out.println("Field list") ;
	   while ( result.next() )
	   {
		   //System.out.println( result.getString( 1 ) ) ;
		   set.add( result.getString( 1 ) ) ;
	   }
	  } catch (SQLException e) 
	  {
			throw new LoggerException( "AbstractLogTable:: listFields()::" + e.getMessage() ) ;
	  }
	   return set ;
  }
/**
 *  Lists the fields present in the table specified in parameter
 * @param tableName
 * @return a hashset of fields name
 * @throws SQLException
 */
  public HashSet<String> listFields ( String tableName  ) throws LoggerException
  {
	  HashSet<String> set = null ;
	  try {
		if ( database == null || database.isClosed() )
				throw new LoggerException("Database null or closed") ;
	
	  
	  set = new HashSet<String>() ;
	  String sqlRequest = "SELECT column_name FROM information_schema.columns WHERE table_name = '"+tableName.toLowerCase().trim()+"'";
     
	   ResultSet result = database.createStatement().executeQuery( sqlRequest ) ;
	   
	   //System.out.println("Field list") ;
	   while ( result.next() )
	   {
		   //System.out.println( result.getString( 1 ) ) ;
		   set.add( result.getString( 1 ) ) ;
	   }
	  } catch (SQLException e) 
	  {
			throw new LoggerException( "AbstractLogTable:: listFields()::" + e.getMessage() ) ;
	  }
	   return set ;
  }

  /**
   * Lists the fields present in the table specified in parameter in the database specified with the connection c
   * @param c
   * @param tableName
   * @return
   * @throws SQLException
   */
  protected static HashSet<String> ListFields ( Connection c , String tableName  ) throws LoggerException
  {
	  try {
		if ( c!=null && !c.isClosed() )
		  {
		  HashSet<String> set = new HashSet<String>() ;
		  String sqlRequest = "SELECT column_name FROM information_schema.columns WHERE table_name = '"+tableName.toLowerCase().trim()+"'";
		 
		   ResultSet result = c.createStatement().executeQuery( sqlRequest ) ;
		   
		   //System.out.println("Field list") ;
		   while ( result.next() )
		   {
			   //System.out.println( result.getString( 1 ) ) ;
			   set.add( result.getString( 1 ) ) ;
		   }
		   return set ;
		  }
		  else return null ;
	} catch (SQLException e) {
		throw new LoggerException( "AbstractLogTable:: listFields()::" + e.getMessage() ) ;
	}
  }
  
  /**
   * Tests if the parameter field exists in the table specified
   * @param tableName
   * @param fieldName
   * @return
   * @throws SQLException
   */
  public boolean fieldExist ( String tableName ,  String fieldName ) throws LoggerException
  {
	 return ( listFields( tableName ).contains( fieldName.toLowerCase().trim() ) ) ;		  
  }
 
}
