package com.hzh.mencahced.constant;

/**
  * @Description: ������ϵͳ��������<br>
  * �˴�����Ļ���������xmemcached-context.xml�ļ��ж����cacheManager����configMap��keyһ��
  * @author HZH
  * @date 2016��4��12�� ����4:11:17
 */
public class CacheType {
	 /**
     * ������: DEFAULT ����: Ĭ�ϻ�������,��Memcached����ʱ��Ϊ12��Сʱ
     */
    public static final String DEFAULT           = "DEFAULT";

    /**
     * ������: THREAD_LOCAL ����: ���ڵ�ǰThreadLocal����,����ͬ����Memcached,��Request����ʱ,�û��潫�����
     */
    public static final String THREAD_LOCAL      = "THREAD_LOCAL";

    /**
     * ������: APPLICATIONAL ����: �����ʱ�仺�浽Memcached
     */
    public static final String APPLICATIONAL     = "APPLICATIONAL";

    /**
     * ������: MEMCACHED_ONLY ����: ��ʹ�ñ��ػ���
     */
    public static final String MEMCACHED_ONLY    = "MEMCACHED_ONLY";

    /**
     * ������: MEMCACHED_FOR_SMS ����: ���������֤��
     */
    public static final String MEMCACHED_FOR_SMS = "MEMCACHED_FOR_SMS";

    /**
     * ������: MEMCACHED_WECHAT ����: ����΢����֤��Ϣ
     */
    public static final String MEMCACHED_WECHAT  = "MEMCACHED_WECHAT";

}
