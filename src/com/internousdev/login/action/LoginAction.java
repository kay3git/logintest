/**
 *
 */
package com.internousdev.login.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.login.dao.LoginDAO;
import com.internousdev.login.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internousdev
 *
 */
public class LoginAction extends ActionSupport implements SessionAware {

	private String username;
	private String password;

	private Map<String, Object> session;

	public String execute(){
		String ret = ERROR;
		LoginDAO dao=new LoginDAO();
///////ＤＴＯ使用時に書き加えた１行
		LoginDTO dto=new LoginDTO();
///////////////////////////////////
		dto = dao.select(username, password);
		if(username.equals(dto.getUsername())){
				if(password.equals(dto.getPassword())){
					session.put("username", "taro");
					System.out.println((String)session.get("username"));
					session.put("password","123");
					System.out.println((String)session.get("password"));
					ret = SUCCESS;
				}
			}
		return ret;
	}
	/**
	 * @return username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username セットする username
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password セットする password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * <p>VALUESTACKに登録されたセッション情報を取得してフィールドに登録します。</p>
	 * @return セッション情報 session
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * <p>フィールドに登録されたユーザ名をVALUE STACKに登録します。<br>
	 * VALUE STACKに登録されたユーザ名は次の画面へ引き継がれます。</p>
	 * @param session セッション情報
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
