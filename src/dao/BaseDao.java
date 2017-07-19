package dao;

import java.util.List;

import entity.Page;

public interface BaseDao {
	public <T> String add(T t);

	public <T> String delet(T t);

	public <T> String update(T t);

	public <T> String getById(T t);

	/**
	 * 分页查询，根据查询指定页数和每页显示最大记录数获取查询结果
	 * 
	 * @param <T>
	 * 
	 * @param t
	 *            查询的对象，泛型定义
	 * @param page
	 *            查询页数，Page封装了每页查询最大记录数、上一页、下一页、当前页和总页数，总页数需要手动设置。当然提供了自动设置属性的方法
	 *            autoSetter(int pageIndex, int totalPages)，需要手动传入当前页数和总页数
	 * @return
	 */
	public <T> List<T> getByPage(T t, Page page);
}
