package com.city.list.main;

/**
 * 城市属性实体类
 * @author sy
 *
 */
public class CityModel
{
	private String CityName; //城市名字
	private String NameSort; //城市首字母
	private String AreaCode; //地区编号

	public String getAreaCode() {
		return AreaCode;
	}

	public void setAreaCode(String areaCode) {
		AreaCode = areaCode;
	}



	public String getCityName()
	{
		return CityName;
	}

	public void setCityName(String cityName)
	{
		CityName = cityName;
	}

	public String getNameSort()
	{
		return NameSort;
	}

	public void setNameSort(String nameSort)
	{
		NameSort = nameSort;
	}

}
