/**
 */
package model.impl;

import model.ModelPackage;
import model.PageTile;
import model.CommandCodeResult;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page Tile</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PageTileImpl extends ICommandImpl implements PageTile {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageTileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PAGE_TILE;
	}

	/**
	 * Execute the command PageTitle on the given resource.
	 * @param resourceId The URI.
	 */
	@Override
	public void execute(String resourceId) {
		try {
		    URL url = new URL(resourceId);
		    URLConnection urlConnection = url.openConnection();
		    urlConnection.connect();
		    
		    BufferedReader br = new BufferedReader(
                    new InputStreamReader(urlConnection.getInputStream()));
		    
		    String html = "";
		    String tmp = br.readLine();
		    // Read the html until we finish reading the title.
		    while (tmp != null) {
		      html += " " + tmp;
		      
		      if (html.contains("</title>")) {
		    	  break;
		      }
		      
		      tmp = br.readLine();
		    }
		    br.close();

		    // Find the title using regular expression of the HTL snippet
		    html = html.replaceAll("\\s+", " ");
		    Pattern p = Pattern.compile("<title>(.*?)</title>");
		    Matcher m = p.matcher(html);
		    if (m.find() == true) {
		      codeResult = CommandCodeResult.SUCCESS;
		      result = m.group(1);
		    } else {
		    	codeResult = CommandCodeResult.ERROR;
				result = "Title not found !! ";
		    }
		} 
		catch (Exception e) { 
			codeResult = CommandCodeResult.ERROR;
			result = "Error:  " + e.getMessage();
		} 

	}
	
} //PageTileImpl
