/**   
* Filename:    MicroblogDict.java   
* @version:    1.0  
* Create at:   2015年7月6日 上午2:27:47   
* Description:  
*   
* Modification History:   
* Date        Author      Version     Description   
* ----------------------------------------------------------------- 
* 2015年7月6日    shiyl      1.0         1.0 Version   
*/
package com.cnfantasia.server.api.microblog.constant;

/**
 * Filename:    MicroblogDict.java
 * @version:    1.0.0
 * Create at:   2015年7月6日 上午2:27:47
 * Description:
 *
 * Modification History:
 * Date           Author           Version           Description
 * ------------------------------------------------------------------
 * 2015年7月6日       shiyl             1.0             1.0 Version
 */
public class MicroblogDict {
	
	/**
	 * 系统消息类别=={\"1\":\"普通消息\",\"2\":\"系统消息\"}
	 */
	public static class MicroblogContent_SourceType{
		/**1:普通消息*/
		public static final Integer CommMsg = 1;
		/**2:系统消息*/
		public static final Integer SysMsg = 2;
		/**3:活动消息*/
		public static final Integer Activity = 3;
	}
	
}
