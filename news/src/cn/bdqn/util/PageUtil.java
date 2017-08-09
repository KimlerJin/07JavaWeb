package cn.bdqn.util;

/**
 * ��ҳ�Ĺ�����
 */
public class PageUtil {
	private Integer totalCount;// �ܼ�¼�� ͨ��sql�����ݿ��л�ȡ
	private Integer pageSize = 3;// ҳ��С ÿҳ��ʾ������
	private Integer pageCount;// ��ҳ��
	private Integer pageIndex;// ��ǰҳ

	public Integer getTotalCount() {
		return totalCount;
	}

	/**�����ڻ�ȡ�ܼ�¼��֮�󣬿϶����Եó� ��ҳ��
	 * 001.�ܼ�¼��ͨ��sql�����ݿ��л�ȡ
	 * 002.��Ԫ���ʽ �����ж� ����ֵ��ҳ��pageCount
	 * 
	 * ��ҳ��=(�ܼ�¼��%ҳ��С==0)?(�ܼ�¼��/ҳ��С):(�ܼ�¼��/ҳ��С+1);
	 * 
	 * @param totalCount �ܼ�¼��
	 */
	public void setTotalCount(Integer totalCount) {
		if (totalCount > 0) {
			this.totalCount = totalCount;
			this.pageCount = (totalCount % pageSize == 0) ? (totalCount / pageSize)
					: (totalCount / pageSize + 1);// ��ҳ��
		}
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageCount() {
		return pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	public Integer getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public PageUtil(Integer totalCount, Integer pageSize, Integer pageCount,
			Integer pageIndex) {
		super();
		this.totalCount = totalCount;
		this.pageSize = pageSize;
		this.pageCount = pageCount;
		this.pageIndex = pageIndex;
	}

	public PageUtil() {
		super();
	}

	@Override
	public String toString() {
		return "PageUtil [totalCount=" + totalCount + ", pageSize=" + pageSize
				+ ", pageCount=" + pageCount + ", pageIndex=" + pageIndex + "]";
	}

}
