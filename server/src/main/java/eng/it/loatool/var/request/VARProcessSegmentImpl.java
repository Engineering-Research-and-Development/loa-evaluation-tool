package eng.it.loatool.var.request;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import eng.it.loatool.var.bean.MainProcess;
import eng.it.loatool.var.bean.SubProcesses;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VARProcessSegmentImpl {

	public static String getIsMadeOf() throws IOException {
		return VARProcessSegment.getIsMadeOf();
	}


	public static List<String> findMain(String procList) throws IOException {

		List<String> main = new ArrayList<String>();

		List<String> FatherList = new ArrayList<String>();
		List<String> ChildList = new ArrayList<String>();

		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode jsonNode = objectMapper.readTree(procList);
		for(JsonNode addSpace : jsonNode.get("results").get("bindings")){
			if(!ChildList.contains(addSpace.get("isChildren").get("value").asText()))
				ChildList.add(addSpace.get("isChildren").get("value").asText());
			if(!FatherList.contains(addSpace.get("isFather").get("value").asText()))
				FatherList.add(addSpace.get("isFather").get("value").asText());
		}

		for(String father: FatherList){
			if(!ChildList.contains(father))
				main.add(father);
		}

		return main;
	}

	public static List<String> findChildren(String father,String procList) throws IOException {

		List<String> ChildList = new ArrayList<String>();

		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode jsonNode = objectMapper.readTree(procList);
		for(JsonNode addSpace : jsonNode.get("results").get("bindings")){
			if(addSpace.get("isFather").get("value").asText().equals(father))
				ChildList.add(addSpace.get("isChildren").get("value").asText());
		}

		return ChildList;
	}

	public static  List<SubProcesses> loop(List<String> children, String procList, int counter) throws IOException {

		List<SubProcesses> subList = new ArrayList<SubProcesses>();
		counter+=1;
		if (children.isEmpty()){
			return subList;
		}

		for(String child : children){
			SubProcesses subProc = new SubProcesses();
			subProc.setName(stringParser(child));
			subProc.setProcessSegmentId(getProcessSegmentId(VARProcessSegment.getProcessSegmentAttribute(child)));
			subProc.setLevel(counter);
			subProc.setSubProcesses(loop(findChildren(child, procList),procList,counter));
			subList.add(subProc);
		}

		return subList;

	}

	public static String stringParser(String string) {
		String[] nameparts = string.split("#", 2);
		return nameparts[1];
	}

	public static String getProcessSegmentId(String attrList) throws IOException {

		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode jsonNode = objectMapper.readTree(attrList);
		String processSegmentId = null;

		for(JsonNode attrs : jsonNode.get("results").get("bindings")){
			if(stringParser(attrs.get("name").get("value").asText()).equals("processSegmentId"))
				processSegmentId = attrs.get("value").get("value").asText();
		}
		return processSegmentId;
	}

	public static int countLowerLevel(String procList) throws IOException {

		List<String> List = new ArrayList<String>();

		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode jsonNode = objectMapper.readTree(procList);
		for(JsonNode addSpace : jsonNode.get("results").get("bindings")){
			if(!List.contains(addSpace.get("isChildren").get("value").asText()))
				List.add(addSpace.get("isChildren").get("value").asText());
			if(!List.contains(addSpace.get("isFather").get("value").asText()))
				List.add(addSpace.get("isFather").get("value").asText());
		}

		return List.size()-1;

	}



	public static List<MainProcess> main() throws IOException {

		String procList = getIsMadeOf();
		List<String> fathers = findMain(procList);
		List<MainProcess> mainProcesses = new ArrayList<MainProcess>();

		for(String father: fathers){
			MainProcess mainP = new MainProcess();
			mainP.setName(stringParser(father));
			mainP.setProcessSegmentId(getProcessSegmentId(VARProcessSegment.getProcessSegmentAttribute(father)));
			List<SubProcesses> subList = loop(findChildren(father, procList),procList,0);

			mainP.setSubProcLowerLevel(countLowerLevel(procList));
			mainP.setSubProcesses(subList);

			mainProcesses.add(mainP);
		}

		return mainProcesses;
	}
}
