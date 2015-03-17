package com.resgain.sparrow.pdm;

import java.io.File;

public class PDMParserTest
{
	public static void main(String[] args) throws Exception
	{
		System.out.println(PDMParser.parse(new File("D:/workspace/webmagic/spider/doc/设计/数据库设计/companyInfo.pdm")));
	}
}
