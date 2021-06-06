package OSI.OPE.ASQ.PSU.test;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import OSI.OPE.ASQ.PSU.OCI.ME.analysis.C.Analyzer;
import OSI.OPE.ASQ.PSU.OEI.ME.analysis.E.CogsBinaryForestAnalyzerImp;

import static java.lang.System.*;

public class DemoPOS {
	public static void main(String[] args) throws IOException {
		Analyzer analyzer = new CogsBinaryForestAnalyzerImp();
		analyzer.init();
		Map<String, String> nlp = analyzer.getPosCnToCn();
		List<String> sets = new ArrayList<>();
		String[] ss = new String[37];
		String[] ss1 = new String[37];
		ss[0] = "";
		ss[1] = "海南方向逃跑";
		ss[2] = "他说的确实在�???";
		ss[3] = "";
		ss[4] = "";
		ss[5] = "提高产品质量";
		ss[6] = "中外科学名著";
		ss[7] = "北京大学生前来应�???";
		ss[8] = "为人民服�???";
		ss[9] = "独立自主和平等互利的原则";
		ss[10] = "为人民办公益";
		ss[11] = "这事的确定不下来";
		ss[12] = "这扇门把手坏�???";
		ss[13] = "他把手抬起来";
		ss[14] = "学生会宣传部";
		ss[15] = "学生会主动完成作�???";
		ss[16] = "学生会游�???";
		ss[17] = "研究生活水平";
		ss[18] = "中国有企�???";
		ss[19] = "我爱美国手球";
		ss[20] = "中国喜欢�???";
		ss[21] = "中国热爱�???";
		ss[22] = "王军虎去广州�???";
		ss[23] = "王军虎头虎脑�???";
		ss[24] = "将军任命了一名中�???";
		ss[25] = "产量三年中将增长两�??";
		ss[26] = "";
		ss[27] = "我来到北京清华大�???";
		ss1[0] = "";
		ss1[1] = "�??? �??? 方向 逃跑";
		ss1[2] = "�??? �??? �??? 确实 在理";
		ss1[3] = "";
		ss1[4] = "";
		ss1[5] = "提高 产品 质量";
		ss1[6] = "中外 科学 名著";
		ss1[7] = "北京 大学�??? �??? �??? 应聘";
		ss1[8] = "�??? 人民 服务";
		ss1[9] = "独立 自主 �??? 平等 互利 �??? 原则";
		ss1[10] = "�??? 人民 办公�???";
		ss1[11] = "这事 的确 �??? �??? 下来";
		ss1[12] = "�??? �??? �??? 把手 �??? �???";
		ss1[13] = "�??? �??? �??? �??? 起来";
		ss1[14] = "学生�??? 宣传 �???";
		ss1[15] = "学生 �??? 主动 完成 作业";
		ss1[16] = "学生�??? 游戏";
		ss1[17] = "研究 生活 水平";
		ss1[18] = "中国 �??? 企业";
		ss1[19] = "�??? �??? 美国 手球";
		ss1[20] = "";
		ss1[21] = "";
		ss1[22] = "王军�??? �??? 广州 �???";
		ss1[23] = "王军 虎头虎脑 �???";
		ss1[24] = "将军 任命 �??? �???�??? 中将";
		ss1[25] = "产量 �??? �??? �??? �??? 增长 两�??";
		ss1[26] = "";
		ss1[27] = "�??? 来到 北京 清华 大学";
		ss[28] = "";
		ss1[28] = "";
		ss[29] = "";
		ss1[29] = "";
		
		ss[30] = "  ";
		ss1[30]= "  ";
		ss[31] = " ";
		ss1[31] = "";
		ss[32] = "   ";
		ss1[32]= " ";
		ss[33] = "老人家身体不�???";
		ss[34]= "老人家中很干�???";
		ss1[33] = "�??? 人家 身体 不错";
		ss1[34]= "老人 �??? �??? �??? 干净";
		ss[35] = "版权归属做出回应";
		ss[36] = "有用户发�???";
		ss1[35] = "版权 归属 �??? �??? 回应";
		ss1[36] = " �??? 用户 发现";
		for (int i = 0; i < ss.length; i++) {
			System.out.println("超级变�?�复杂病�???-->" + ss[i]);
			sets = analyzer.parserString(ss[i].replace(" ", ""));//词�?�分�???
			out.print("分析处理真实结果-->");
			for (int j = 0; j < sets.size(); j++) {
				if (!sets.get(j).replaceAll("\\s+", "").equals("")) {
					out.print(sets.get(j) + " ");
				}
			}
			out.println();
			out.println("期望得到分词效果-->" + ss1[i]);
			for (int k = 0; k < sets.size(); k++) {
				if (!sets.get(k).replaceAll("\\s+", "").equals("")) {
					nlp.get(sets.get(k));
					out.println(sets.get(k) + "/" + nlp.get(sets.get(k)) + "  ");
				}
			}
			out.println("");
		}
	}
}